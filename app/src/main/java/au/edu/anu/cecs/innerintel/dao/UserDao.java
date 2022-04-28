package au.edu.anu.cecs.innerintel.dao;

/**
 * Basic database operations of all users.
 * @author XinyueHu
 */
public interface UserDao<T> {

    // Add a user
    boolean addUser(T user);

    // Delete a user
    boolean deleteUser(T user);

    // Update profile information
    boolean updateProfile(T user);

    // Search a user by id, name or role
    T searchUser(String msg);

}
