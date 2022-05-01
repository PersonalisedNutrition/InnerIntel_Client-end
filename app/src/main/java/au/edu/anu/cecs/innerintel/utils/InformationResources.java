package au.edu.anu.cecs.innerintel.utils;


import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import au.edu.anu.cecs.innerintel.Bean.Food;

/**
 * Get data from local files
 * @author XinyueHu
 */
public class InformationResources {
    public List<Food> food=new ArrayList<>();

    /**
     * Read instances from JSON
     * @param file
     */
    public void jsonRead(InputStream file){
        JsonReader jsonReader=null;

        final Type class_type = new TypeToken<List<Food>>() {}.getType();
        Gson gson =new Gson();
        try{
            jsonReader=new JsonReader(new InputStreamReader(file));
        }catch (Exception e) {
            e.printStackTrace();
        }
        List<Food> foods= gson.fromJson(jsonReader, class_type);


        this.food.addAll(foods);

    }

}
