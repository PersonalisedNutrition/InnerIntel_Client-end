package au.edu.anu.cecs.innerintel.dao.daoImpl;

import android.nfc.Tag;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.app.AppCompatActivity;
import au.edu.anu.cecs.innerintel.Bean.Food;
import au.edu.anu.cecs.innerintel.dao.FoodDao;
import au.edu.anu.cecs.innerintel.utils.FirebaseUtils;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

/**
 * This class is the implementation of
 * basic database operations of food data
 * @author Shiyun Zhu
 * @author Xinyue Hu
 */
public class FoodDaoImpl implements FoodDao {
    private final FirebaseFirestore db;
    private List<Food> foodList;
    private AppCompatActivity act;

    public FoodDaoImpl(AppCompatActivity act) {
        FirebaseUtils fu = new FirebaseUtils();
        db = fu.getCloudStore();
        this.act = act;
    }


    @Override
    public void add(String key, Food f) throws SQLException {
        foodList = searchAll();
        if (foodList.contains(f)){
            Toast.makeText(act.getBaseContext(),
                    "Food already exist", Toast.LENGTH_SHORT).show();
        }else {
            db.collection("Food").document(key)
                    .set(f)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Log.d("food", "Successfully adding new food");
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w("food", "Error adding food ", e);
                        }
                    });
        }

    }

    @Override
    public void update(String key,Food f) throws SQLException {
        foodList = searchAll(); // Get all food data
        if (!foodList.contains(f)){
            Toast.makeText(act.getBaseContext(),
                    "The food is not exist", Toast.LENGTH_SHORT).show();
        }else {
            db.collection("Food").document(key)
                    .set(f)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Log.d("food", "successfully updated");
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w("food", "error updating", e);
                        }
                    });

        }
    }

    @Override
    public void delete(String key) throws SQLException {
        db.collection("Food").document(key)
                .delete()
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d("food", "food successfully deleted!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w("food", "Error deleting food", e);
                    }
                });
    }

    @Override
    public List<Food> searchByName(String foodName) throws SQLException {
        foodList = new ArrayList<>();
        db.collection("Food")
                .whereEqualTo("foodName", foodName)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                foodList.add( document.toObject(Food.class));
                            }
                        } else {
                            Toast.makeText(act.getBaseContext(),
                                    "Sorry, cannot find the food", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        return foodList;
    }

    @Override
    public List<Food> searchByType(String foodType) throws SQLException {
        foodList = new ArrayList<>();
        db.collection("Food")
                .whereEqualTo("foodType", foodType)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                foodList.add( document.toObject(Food.class));
                            }
                        } else {
                            Toast.makeText(act.getBaseContext(),
                                    "Sorry, cannot find this type of food", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        return foodList;
    }

    @Override
    public List<Food> searchAll() throws SQLException {
        foodList = new ArrayList<>();
        db.collection("Food")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                foodList.add( document.toObject(Food.class));
                            }
                        } else {
                            Toast.makeText(act.getBaseContext(),
                                    "Oops, the food list is gone", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        return foodList;
    }




}
