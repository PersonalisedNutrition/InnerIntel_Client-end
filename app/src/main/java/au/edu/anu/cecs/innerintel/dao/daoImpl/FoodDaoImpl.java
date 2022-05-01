package au.edu.anu.cecs.innerintel.dao.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import au.edu.anu.cecs.innerintel.Bean.Food;
import au.edu.anu.cecs.innerintel.dao.FoodDao;
import au.edu.anu.cecs.innerintel.utils.DataBaseUtils;

/**
 * implement class of the food data
 * @author Shiyun Zhu
 */
public class FoodDaoImpl implements FoodDao {

    /**
     * Add new data to database.
     * @param f FoodData
     * @return true if successfully added.
     * @throws SQLException if failed in adding.
     */
    @Override
    public boolean add(Food f) throws SQLException {
        Connection conn =null;
        PreparedStatement ps = null;
        String sql = "insert into foodData(type,name,measurement,info)values(?,?,?)";
        try{
            conn = DataBaseUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1,f.getFoodType());
            ps.setString(2,f.getFoodName());
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
            throw new SQLException("Failed in adding ");
        }finally {
            DataBaseUtils.close(null,ps,conn);
        }

        return true;
    }

    //TODO: finish other methods.
    @Override
    public boolean update(Food f) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Food f) throws SQLException {
        return false;
    }

    @Override
    public Food search(String foodName) throws SQLException {
        return null;
    }

    @Override
    public List<Food> searchAll(Food f) throws SQLException {
        return null;
    }
}
