package au.edu.anu.cecs.innerintel.dao.daoImpl;

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

import au.edu.anu.cecs.innerintel.Bean.Client;
import au.edu.anu.cecs.innerintel.Bean.Log;
import au.edu.anu.cecs.innerintel.Bean.Nutritionist;
import au.edu.anu.cecs.innerintel.Bean.User;
import au.edu.anu.cecs.innerintel.dao.UserDao;
import au.edu.anu.cecs.innerintel.utils.FirebaseUtils;

/**
 * Database operations of nutritionists.
 * @author XinyueHu
 */
public class NutritionistDaoImpl implements UserDao<Nutritionist> {

    //Implement singleton design pattern
    private static NutritionistDaoImpl userDao = null;
    private FirebaseFirestore db;
    private FirebaseUser currentUser;
    private List<Nutritionist> nutritionists;
    private Nutritionist nutritionist;
    private String TAG = "Nutritionist";
    private AppCompatActivity act;

    public NutritionistDaoImpl(AppCompatActivity act) {
        FirebaseUtils fu = new FirebaseUtils();
        db = fu.getCloudStore();
        currentUser = fu.getCurrentUser();
        this.act = act;
    }


    public Log readReport(){return null;}


    @Override
    public void addUser(String key, Nutritionist user) {
        nutritionists = searchAll();
        if (nutritionists.contains(user)){
            Toast.makeText(act.getBaseContext(),
                    "Nutritionist already exist", Toast.LENGTH_SHORT).show();
        }else {
            db.collection("Nutritionists").document(key)
                    .set(user)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            android.util.Log.d(TAG, "Successfully adding new nutritionist");
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            android.util.Log.w(TAG, "Error adding nutritionist ", e);
                        }
                    });
        }
    }

    @Override
    public void deleteUser(String key, Nutritionist user) {
        db.collection("Nutritionists").document(key)
                .delete()
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        android.util.Log.d(TAG, "Nutritionist successfully deleted!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        android.util.Log.w(TAG, "Error deleting nutritionist", e);
                    }
                });
    }

    @Override
    public void updateProfile(String key, Nutritionist user) {
        nutritionists = searchAll();
        if (!nutritionists.contains(user)){
            Toast.makeText(act.getBaseContext(),
                    "The nutritionist is not exist", Toast.LENGTH_SHORT).show();
        }else {
            db.collection("Nutritionists").document(key)
                    .set(user)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            android.util.Log.d(TAG, "successfully updated");
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            android.util.Log.w(TAG, "error updating", e);
                        }
                    });

        }
    }

    @Override
    public Nutritionist searchUserByID(String id) {
        DocumentReference docRef = db.collection("Nutritionists").document(id);
        docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                nutritionist = new Nutritionist();
                nutritionist = documentSnapshot.toObject(Nutritionist.class);
            }
        });
        return nutritionist;
    }

    @Override
    public List<Nutritionist> searchUserByName(String name) {
        return null;
    }

    @Override
    public List<Nutritionist> searchAll() {
        nutritionists = new ArrayList<>();
        db.collection("Nutritionists")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                nutritionists.add( document.toObject(Nutritionist.class));
                            }
                        } else {
                            Toast.makeText(act.getBaseContext(),
                                    "Oops, the nutritionist list is gone", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        return nutritionists;
    }
}
