package au.edu.anu.cecs.innerintel.dao.daoImpl;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;

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
import java.util.Map;

import au.edu.anu.cecs.innerintel.Bean.Log;
import au.edu.anu.cecs.innerintel.Bean.Nutritionist;
import au.edu.anu.cecs.innerintel.dao.UserDao;
/**
 * Database operations of nutritionists.
 * @author XinyueHu
 * @author Shiyun Zhu
 */
public class NutritionistDaoImpl implements UserDao<Nutritionist> {
    FirebaseFirestore db;
    //Implement singleton design pattern
    private static NutritionistDaoImpl userDao = null;

    private NutritionistDaoImpl(){
        this.db = FirebaseFirestore.getInstance();
    }

    public static NutritionistDaoImpl getInstance() {
        if (userDao == null) {
            userDao = new NutritionistDaoImpl();
        }
        return userDao;
    }

    public Log readReport(){return null;}

    @Override
    public boolean addUser(Nutritionist usr) {

        String TAG = "add nutritionist";
        // Create a new user with a first and last name
        Map<String, Object> user = new HashMap<>();
        user.put("name", usr.getName());
        user.put("phone", usr.getPhone());
        user.put("intro", usr.getIntro());
        user.put("country",usr.getCountry());
        user.put("img",usr.getImg());


        // Add a new document with a generated ID
        db.collection("users")
                .add(user)
                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                    @Override
                    public void onSuccess(DocumentReference documentReference) {
                        android.util.Log.d(TAG, "DocumentSnapshot added with ID: " + documentReference.getId());
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        android.util.Log.w(TAG, "Error adding document", e);
                    }
                });

        return false;
    }

    @Override
    public boolean deleteUser(Nutritionist usr) {
        String TAG = "delete nutritionist";
        db.collection("nutritionist").document(String.valueOf(usr.getNid()))
                .delete()
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        android.util.Log.d(TAG, "DocumentSnapshot successfully deleted!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        android.util.Log.w(TAG, "Error deleting document", e);
                    }
                });


        return false;
    }

    @Override
    public boolean updateProfile(Nutritionist usr) {
        String TAG = "update Profile of nutritionist";

        DocumentReference washingtonRef = db.collection("nutritionist").document(String.valueOf(usr.getNid()));
        // Set the element field of the user
        washingtonRef
                .update("conClients", usr.getConClients())

                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @SuppressLint("LongLogTag")
                    @Override
                    public void onSuccess(Void aVoid) {
                        android.util.Log.d(TAG, "DocumentSnapshot successfully updated!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @SuppressLint("LongLogTag")
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        android.util.Log.w(TAG, "Error updating document", e);
                    }
                });

        return false;
    }

    @Override
    public Nutritionist searchUser(String msg) {

        String TAG = "search nutritionist";
        DocumentReference docRef = db.collection("nutritionist").document(String.valueOf("msg"));

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
}
