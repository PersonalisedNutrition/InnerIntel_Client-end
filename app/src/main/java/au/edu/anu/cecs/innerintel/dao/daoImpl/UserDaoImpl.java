package au.edu.anu.cecs.innerintel.dao.daoImpl;


import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;

import au.edu.anu.cecs.innerintel.Bean.Food;
import au.edu.anu.cecs.innerintel.Bean.User;
import au.edu.anu.cecs.innerintel.dao.UserDao;
import au.edu.anu.cecs.innerintel.utils.FirebaseUtils;

/**
 * Database operations of all types of users.
 * @author XinyueHu
 */
public class UserDaoImpl implements UserDao<User> {

    private static UserDaoImpl userDao = null;
    private FirebaseFirestore db;
    private FirebaseUser currentUser;
    private User user;
    private List<User> userList;
    private AppCompatActivity act;
    private String TAG = "User";

    public UserDaoImpl(AppCompatActivity act) {
        FirebaseUtils fu = new FirebaseUtils();
        db = fu.getCloudStore();
        currentUser = fu.getCurrentUser();
        this.act = act;
    }


    @Override
    public void addUser(String key, User user) {
        userList = searchAll();
        if (userList.contains(user)){
            Toast.makeText(act.getBaseContext(),
                    "User already exist", Toast.LENGTH_SHORT).show();
        }else {
            db.collection("Users").document(key)
                    .set(user)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Log.d(TAG, "Successfully adding new user");
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding user ", e);
                        }
                    });
        }

    }

    @Override
    public void deleteUser(String key, User user) {
        db.collection("Users").document(key)
                .delete()
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "user successfully deleted!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error deleting user", e);
                    }
                });
    }

    @Override
    public void updateProfile(String key, User user) {

    }

    @Override
    public User searchUserByID(String id) {
        DocumentReference docRef = db.collection("Users").document(id);
        docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                user = new User();
                user = documentSnapshot.toObject(User.class);
            }
        });
        return user;
    }


    @Override
    public List<User> searchUserByName(String msg) {
       userList = new ArrayList<>();
        db.collection("Users")
                .whereEqualTo("userName", msg)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                               userList.add(document.toObject(User.class));
                            }
                        } else {
                            Toast.makeText(act.getBaseContext(),
                                    "Sorry, cannot find the user", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        return userList;
    }

    @Override
    public List<User> searchAll() {
        userList = new ArrayList<>();
        db.collection("Users")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                userList.add( document.toObject(User.class));
                            }
                        } else {
                            Toast.makeText(act.getBaseContext(),
                                    "Oops, the user list is gone", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        return userList;
    }

    public List<User> searchUserByRole(String role){
        userList = new ArrayList<>();
        db.collection("Users")
                .whereEqualTo("role", role)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                userList.add(document.toObject(User.class));
                            }
                        } else {
                            Toast.makeText(act.getBaseContext(),
                                    "Sorry, cannot find the user", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        return userList;

    }



}
