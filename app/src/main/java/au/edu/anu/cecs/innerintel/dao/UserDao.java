package au.edu.anu.cecs.innerintel.dao;

import java.util.List;

import au.edu.anu.cecs.innerintel.Bean.Food;

/**
 * Basic database operations of all users.
 * @author XinyueHu
 */
public interface UserDao<T> {

    // Add a user
    void addUser(String key, T user);

    // Delete a user
    void deleteUser(String key, T user);

    // Update profile information
    void updateProfile(String key, T user);

    // Search a user by id
    T searchUserByID(String id);

    // Search a user by name
    List<T> searchUserByName(String name);

    List<T> searchAll();

}
