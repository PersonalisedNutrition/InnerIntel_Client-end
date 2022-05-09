package au.edu.anu.cecs.innerintel.dao.daoImpl;


import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.firestore.Source;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import au.edu.anu.cecs.innerintel.Bean.Client;
import au.edu.anu.cecs.innerintel.dao.UserDao;
import au.edu.anu.cecs.innerintel.utils.FirebaseUtils;

/**
 * Database operations of clients.
 * @author XinyueHu
 * @author Shiyun Zhu
 */
public class ClientDaoImpl implements UserDao<Client> {
    private FirebaseFirestore db;

    //Implement singleton design pattern
    private static ClientDaoImpl userDao = null;

    private ClientDaoImpl() {
        this.db = FirebaseFirestore.getInstance();

    }

    public static ClientDaoImpl getInstance() {
        if (userDao == null) {
            userDao = new ClientDaoImpl();
        }
        return userDao;
    }

    public String readLog(Client user) {return null;}
    public String changeLog(Client user) {return null;}
    public boolean deleteLog(Client user) {return false;}

    public String showDiseaseHistory(Client user){return null;}
    public String showAllergies(Client user){return null;}


    public boolean addUser(Client usr) {
        String TAG = "add client";
        // Create a new user with a first and last name
        Map<String, Object> user = new HashMap<>();
        user.put("name", usr.getName());
        user.put("age", usr.getAge());
        user.put("bloodType", usr.getBloodType());
        user.put("country",usr.getCountry());
        user.put("height",usr.getHeight());


        // Add a new document with a generated ID
        db.collection("users")
                .add(user)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error adding document", e);
                    }
                });

        return false;
    }


    public boolean deleteUser(Client usr) {
        String TAG = "delete client";
        db.collection("client").document(String.valueOf(usr.getCid()))
                .delete()
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "DocumentSnapshot successfully deleted!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error deleting document", e);
                    }
                });


        return false;
    }


    public boolean updateProfile(Client usr) {
        String TAG = "update Profile of client";

        DocumentReference washingtonRef = db.collection("client").document(String.valueOf(usr.getCid()));
        // Set the element field of the user
        washingtonRef
                .update("name", usr.getName())
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @SuppressLint("LongLogTag")
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "DocumentSnapshot successfully updated!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @SuppressLint("LongLogTag")
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error updating document", e);
                    }
                });


        return false;
    }


    public Client searchUser(String msg) {

        String TAG = "search client";
        DocumentReference docRef = db.collection("client").document(String.valueOf("msg"));

        // Source can be CACHE, SERVER, or DEFAULT.
        Source source = Source.CACHE;

        // Get the document, forcing the SDK to use the offline cache
        docRef.get(source).addOnCompleteListener(new OnCompleteListener<DocumentSnapshot>() {
            @Override
            public void onComplete(@NonNull Task<DocumentSnapshot> task) {
                if (task.isSuccessful()) {
                    // Document found in the offline cache
                    DocumentSnapshot document = task.getResult();
                    android.util.Log.d(TAG, "Cached document data: " + document.getData());
                } else {
                    android.util.Log.d(TAG, "Cached get failed: ", task.getException());
                }
            }
        });

        return null;
    }

    @Override
    public void addUser(String key, Client user) {

    }

    @Override
    public void deleteUser(String key, Client user) {

    }

    @Override
    public void updateProfile(String key, Client user) {

    }

    @Override
    public Client searchUserByID(String id) {
        return null;
    }

    @Override
    public List<Client> searchUserByName(String name) {
        return null;
    }

    @Override
    public List<Client> searchAll() {
        return null;
    }
}
