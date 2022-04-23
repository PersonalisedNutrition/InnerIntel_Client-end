package au.edu.anu.cecs.innerintel.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 *
 * The class DataBaseUtils is a utility class for database operations
 * The singleton pattern is used for instantiation to prevent redundancy, because it is a utility class.
 * Static block loading drivers are used to avoid resource waste.
 * @author Shiyun Zhu
 */
public class DataBaseUtils {

    //Define the field.
    //Address of the connection to the database.
    public static String dataBaseURL;
    //User name.
    public static String dataBaseUserName;
    //Password.
    public static String dataBasePassword;
    //DataBase driver.
    public static String dataBaseDriver;

    //Internationalization.
    private static ResourceBundle dataBaseResourceBundle = ResourceBundle.getBundle("au.edu.anu.cecs.innerintel.utils.db-config");

    //constructor in singleton pattern.
    private DataBaseUtils(){};

    //Use static block loading drivers.
    static {
        dataBaseURL = DataBasePropertiesReading.getInstance().getString("jbdc.url");
        dataBaseUserName = DataBasePropertiesReading.getInstance().getString("jbdc.username");
        dataBasePassword = DataBasePropertiesReading.getInstance().getString("jbdc.password");
        dataBaseDriver = DataBasePropertiesReading.getInstance().getString("jbdc.driver");
        try{
            Class.forName(dataBaseDriver);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    //Define a method to get connection to database.
    public static Connection getConnection(){
        Connection dataBaseConnection = null;
        try{
            dataBaseConnection = DriverManager.getConnection(dataBaseURL,dataBaseUserName,dataBasePassword);
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("Failed in get database connection.");
        }
    return dataBaseConnection;
    }

    /**
     * Disconnected the database
     * @param rs resultSet
     * @param stat Statement
     * @param conn Connection
     */
    public static void close(ResultSet rs, Statement stat, Connection conn){
        try{
            if(rs!=null)rs.close();
            if(stat!=null)stat.close();
            if(conn!=null)conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
