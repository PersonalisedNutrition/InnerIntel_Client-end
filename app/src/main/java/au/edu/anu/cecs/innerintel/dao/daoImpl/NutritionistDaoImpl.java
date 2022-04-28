package au.edu.anu.cecs.innerintel.dao.daoImpl;

import au.edu.anu.cecs.innerintel.Bean.Log;
import au.edu.anu.cecs.innerintel.Bean.Nutritionist;
import au.edu.anu.cecs.innerintel.dao.UserDao;
/**
 * Database operations of nutritionists.
 * @author XinyueHu
 */
public class NutritionistDaoImpl implements UserDao<Nutritionist> {

    //Implement singleton design pattern
    private static NutritionistDaoImpl userDao = null;

    public static NutritionistDaoImpl getInstance() {
        if (userDao == null) {
            userDao = new NutritionistDaoImpl();
        }
        return userDao;
    }

    public Log readReport(){return null;}

    @Override
    public boolean addUser(Nutritionist user) {
        return false;
    }

    @Override
    public boolean deleteUser(Nutritionist user) {
        return false;
    }

    @Override
    public boolean updateProfile(Nutritionist user) {
        return false;
    }

    @Override
    public Nutritionist searchUser(String msg) {
        return null;
    }
}
