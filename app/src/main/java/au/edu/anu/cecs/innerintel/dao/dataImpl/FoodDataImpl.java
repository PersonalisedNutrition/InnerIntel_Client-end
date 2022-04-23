package au.edu.anu.cecs.innerintel.dao.dataImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import au.edu.anu.cecs.innerintel.Bean.FoodData;
import au.edu.anu.cecs.innerintel.dao.FoodDataDao;
import au.edu.anu.cecs.innerintel.utils.DataBasePropertiesReading;
import au.edu.anu.cecs.innerintel.utils.DataBaseUtils;

/**
 * implement class of the food data
 * @author Shiyun Zhu
 */
public class FoodDataImpl implements FoodDataDao {

    /**
     * Add new data to database.
     * @param f FoodData
     * @return true if successfully added.
     * @throws SQLException if failed in adding.
     */
    @Override
    public boolean add(FoodData f) throws SQLException {
        Connection conn =null;
        PreparedStatement ps = null;
        String sql = "insert into foodData(type,name,measurement,info)values(?,?,?)";
        try{
            conn = DataBaseUtils.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setObject(1,f.getFoodType());
            ps.setString(2,f.getFoodName());
            ps.setObject(3,f.getFoodMeasurement());
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
    public boolean update(FoodData f) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(FoodData f) throws SQLException {
        return false;
    }

    @Override
    public FoodData search(String foodName) throws SQLException {
        return null;
    }

    @Override
    public List<FoodData> searchAll(FoodData f) throws SQLException {
        return null;
    }
}
