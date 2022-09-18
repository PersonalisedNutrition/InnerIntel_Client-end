package au.edu.anu.cecs.innerintel.utils;


import android.content.Context;
import android.util.JsonReader;

import au.edu.anu.cecs.innerintel.Bean.Log;
import au.edu.anu.cecs.innerintel.Bean.SleepLog;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.WriteBatch;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.firebase.database.DatabaseReference;
import au.edu.anu.cecs.innerintel.Bean.Food;

/**
 * Read data from local files and then upload instances to Firebase
 * @author Xinyue Hu
 */
public class InformationResources {
    public List<Food> foods = new ArrayList<>();
    public List<Log>  logs = new ArrayList<>();
    public List<SleepLog> sleepLogs = new ArrayList<>();
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    /**
     * Read instances from food.json and then upload to Firebase
     */
    public void ReadUploadFood(Context context) {

        try {
            JsonReader reader = new JsonReader(new InputStreamReader(
                    context.getResources().getAssets().open("food.json")));
            Gson gson = new GsonBuilder().create();

            reader.beginArray();
            while (reader.hasNext()) {
                //Read data into object model
                Food food = gson.fromJson(String.valueOf(reader), Food.class);
                this.foods.add(food);
                db.collection("Food").document(food.getFoodID()).set(food);
            }
            reader.close();
        } catch (UnsupportedEncodingException e) {
            System.out.println("The encoding is unsupported!");
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find food.json!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        /**
         * Read instances from logs.json and then upload to Firebase
         */
//        public void ReadUploadLog (Context context){
//
//            try{
//                JsonReader reader = new JsonReader(new InputStreamReader(
//                        context.getResources().getAssets().open("logs.json")));
//                Gson gson = new GsonBuilder().create();
//
//                reader.beginArray();
//                while (reader.hasNext()) {
//                    //Read data into object model
//                    Log log = gson.fromJson(String.valueOf(reader), Log.class);
//                    this.logs.add(log);
//                    db.collection("Log").document(log.getLid()).set(log);
//                }
//                reader.close();
//            } catch (UnsupportedEncodingException e) {
//                System.out.println("The encoding is unsupported!");
//            } catch (FileNotFoundException e) {
//                System.out.println("Cannot find logs.json!");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//
//        }

//    public void ReadUploadSleepLog (Context context){
//
//        try{
//            JsonReader reader = new JsonReader(new InputStreamReader(
//                    context.getResources().getAssets().open("sleep_log.json")));
//            Gson gson = new GsonBuilder().create();
//
//            reader.beginArray();
//            while (reader.hasNext()) {
//                //Read data into object model
//                SleepLog sleepLog = gson.fromJson(String.valueOf(reader), SleepLog.class);
//                this.sleepLogs.add(sleepLog);
//                db.collection("SleepLog").document(sleepLog.getSleep_id()).set(sleepLog);
//            }
//            reader.close();
//        } catch (UnsupportedEncodingException e) {
//            System.out.println("The encoding is unsupported!");
//        } catch (FileNotFoundException e) {
//            System.out.println("Cannot find sleep_log.json!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }





}



