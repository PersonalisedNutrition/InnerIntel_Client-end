package au.edu.anu.cecs.innerintel.dao;

import java.sql.SQLException;
import java.util.List;

import au.edu.anu.cecs.innerintel.Bean.FoodData;

/**
 * Interface of the basic database
 * @author Shiyun Zhu
 */
public interface FoodDataDao{
    //add method
    public boolean add(FoodData f) throws SQLException;

    //update method
    public boolean update(FoodData f) throws SQLException;

    //delete method
    public boolean delete(FoodData f) throws  SQLException;

    //search method
    public  FoodData search(String foodName) throws SQLException;

    //search all
    public List<FoodData> searchAll(FoodData f) throws SQLException;

}
