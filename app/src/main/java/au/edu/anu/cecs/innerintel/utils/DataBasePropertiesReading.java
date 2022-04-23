package au.edu.anu.cecs.innerintel.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * The class DataBasePropertiesReading is to read database properties
 * from the db-config.properties.
 * @author Shiyun Zhu
 */
public class DataBasePropertiesReading {

    private static DataBasePropertiesReading dataBasePropertiesReading;
    private static Properties properties;


    private DataBasePropertiesReading(){
        String configFile = "db-config.Properties";
        properties = new Properties();
        InputStream is = DataBasePropertiesReading.class.getClassLoader().getResourceAsStream(configFile);
        try{
            properties.load(is);
            is.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static DataBasePropertiesReading getInstance(){
        if (dataBasePropertiesReading == null){
            dataBasePropertiesReading=new DataBasePropertiesReading();
        }
        return  dataBasePropertiesReading;
    }

    // Get key value from the db-config.properties.
    public String getString(String key){
        return properties.getProperty(key);
    }
}
