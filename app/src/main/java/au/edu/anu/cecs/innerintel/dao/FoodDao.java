package au.edu.anu.cecs.innerintel.dao;

import java.sql.SQLException;
import java.util.List;

import au.edu.anu.cecs.innerintel.Bean.Food;

/**
 * Interface of the basic database
 * @author Shiyun Zhu
 */
public interface FoodDao {
    //add method
    public boolean add(Food f) throws SQLException;

    //update method
    public boolean update(Food f) throws SQLException;

    //delete method
    public boolean delete(Food f) throws  SQLException;

    //search method
    public Food search(String foodName) throws SQLException;

    //search all
    public List<Food> searchAll(Food f) throws SQLException;

}
