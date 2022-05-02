package au.edu.anu.cecs.innerintel.utils;


import android.content.Context;

import com.google.common.reflect.TypeToken;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.WriteBatch;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

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
 * Get data from local files and then upload them to Firebase
 * @author Xinyue Hu
 */
public class InformationResources {
    public List<Food> foods = new ArrayList<>();
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
                Food food = gson.fromJson(reader, Food.class);
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




}



