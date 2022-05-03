package au.edu.anu.cecs.innerintel.utils;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.*;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseAuth;

/**
 * The utilities of Firebase
 * @author Xinyue Hu
 */
public class FirebaseUtils {

    /**
     * Get current user from Firebase
     * @return Firebase user
     */
    public FirebaseUser getCurrentUser(){
        FirebaseAuth mAuth = FirebaseAuth.getInstance();
        return mAuth.getCurrentUser();
    }

    /**
     * Get cloud database reference
     * @return database reference
     */
    public FirebaseFirestore getCloudStore(){
        return FirebaseFirestore.getInstance();
    }


}
