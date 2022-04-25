package au.edu.anu.cecs.innerintel.dao.dataImpl;


import java.lang.reflect.Type;

import au.edu.anu.cecs.innerintel.Bean.User;
import au.edu.anu.cecs.innerintel.dao.UserDataDao;

/**
 * Database operations of all types of users.
 * @author XinyueHu
 */
public class UserDaoImpl implements UserDataDao<User> {

    //Implement singleton design pattern
    private static UserDaoImpl userDao = null;

    public static UserDaoImpl getInstance() {
        if (userDao == null) {
            userDao = new UserDaoImpl();
        }
        return userDao;
    }

    @Override
    public boolean addUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }

    @Override
    public boolean updateProfile(User user) {
        return false;
    }

    @Override
    public User searchUser(String msg) {
        return null;
    }

}
