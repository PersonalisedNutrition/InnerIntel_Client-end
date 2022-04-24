package au.edu.anu.cecs.innerintel.dao.dataImpl;


import java.lang.reflect.Type;

import au.edu.anu.cecs.innerintel.dao.UserDataDao;

/**
 * Database operations of all types of users.
 * @author XinyueHu
 */
public class UserDataImpl implements UserDataDao {

    //Implement singleton design pattern
    private static UserDataImpl userDao = null;

    public static UserDataImpl getInstance() {
        if (userDao == null) {
            userDao = new UserDataImpl();
        }
        return userDao;
    }

    @Override
    public boolean addUser(Object user) {
        return false;
    }

    @Override
    public boolean deleteUser(Object user) {
        return false;
    }

    @Override
    public boolean updateProfile(Object user) {
        return false;
    }

    @Override
    public Object searchUser(String msg) {
        return null;
    }

}
