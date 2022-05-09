package au.edu.anu.cecs.innerintel.dao.daoImpl;


import android.net.Uri;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;

import java.util.List;

import au.edu.anu.cecs.innerintel.Bean.User;
import au.edu.anu.cecs.innerintel.dao.UserDao;

/**
 * Database operations of all types of users.
 * @author XinyueHu
 * @author Shiyun Zhu
 */
public class UserDaoImpl implements UserDao<User> {

    //Implement singleton design pattern
    private static UserDaoImpl userDao = null;

    private UserDaoImpl(){

    }


    public static UserDaoImpl getInstance() {
        if (userDao == null) {
            userDao = new UserDaoImpl();
        }
        return userDao;
    }



    public boolean addUser(User user) {
        return false;
    }


    public boolean deleteUser(User usr) {
        String TAG = "deleteUser";
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        user.delete()
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Log.d(TAG, "User account deleted.");
                        }
                    }
                });

        return true;
    }


    public boolean updateProfile(User usr) {
        String TAG = "updateProfile";

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        UserProfileChangeRequest profileUpdates = new UserProfileChangeRequest.Builder()
                .setDisplayName(usr.getName())
                .setPhotoUri(Uri.parse(usr.getImg()))
                .build();
        user.updateProfile(profileUpdates)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Log.d(TAG, "User profile updated.");
                        }
                    }
                });

        return true;
    }


    public User searchUser(String msg) {

        return null;
    }

    @Override
    public void addUser(String key, User user) {

    }

    @Override
    public void deleteUser(String key, User user) {

    }

    @Override
    public void updateProfile(String key, User user) {

    }

    @Override
    public User searchUserByID(String id) {
        return null;
    }

    @Override
    public List<User> searchUserByName(String name) {
        return null;
    }

    @Override
    public List<User> searchAll() {
        return null;
    }
}
