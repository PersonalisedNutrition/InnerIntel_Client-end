package au.edu.anu.cecs.innerintel.dao;

import java.sql.SQLException;
import java.util.List;

import au.edu.anu.cecs.innerintel.Bean.Food;

/**
 * Interface of the basic database
 * @author Shiyun Zhu
 * @author Xinyue Hu
 */
public interface FoodDao {
    //add method
    public void add(String key,Food f) throws SQLException;

    //update method
    public void update(String key,Food f) throws SQLException;

    //delete method
    public void delete(String key) throws  SQLException;

    //search method
    public List<Food> searchByName(String foodName) throws SQLException;

    //search all
    public List<Food> searchAll() throws SQLException;

    //search a type of food
    List<Food> searchByType(String foodType) throws SQLException;

}
