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

import au.edu.anu.cecs.innerintel.Bean.Client;
import au.edu.anu.cecs.innerintel.Bean.User;
import au.edu.anu.cecs.innerintel.dao.UserDao;
import au.edu.anu.cecs.innerintel.utils.FirebaseUtils;

/**
 * Database operations of clients.
 * @author XinyueHu
 */
public class ClientDaoImpl implements UserDao<Client> {

    private static ClientDaoImpl userDao = null;
    private FirebaseFirestore db;
    private FirebaseUser currentUser;
    private Client client;
    private List<Client> clientList;
    private AppCompatActivity act;
    private String TAG = "Clients";

    public ClientDaoImpl(AppCompatActivity act) {
        FirebaseUtils fu = new FirebaseUtils();
        db = fu.getCloudStore();
        currentUser = fu.getCurrentUser();
        this.act = act;
    }


    public String readLog(Client user) {return null;}
    public String changeLog(Client user) {return null;}
    public boolean deleteLog(Client user) {return false;}

    public String showDiseaseHistory(Client user){return null;}
    public String showAllergies(Client user){return null;}


    @Override
    public void addUser(String key, Client user) {
        clientList = searchAll();
        if (clientList.contains(user)){
            Toast.makeText(act.getBaseContext(),
                    "Client already exist", Toast.LENGTH_SHORT).show();
        }else {
            db.collection("Clients").document(key)
                    .set(user)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Log.d(TAG, "Successfully adding new client");
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "Error adding client ", e);
                        }
                    });
        }
    }

    @Override
    public void deleteUser(String key, Client user) {
        db.collection("Clients").document(key)
                .delete()
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Log.d(TAG, "Client successfully deleted!");
                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.w(TAG, "Error deleting client", e);
                    }
                });
    }

    @Override
    public void updateProfile(String key, Client user) {
        clientList = searchAll();
        if (!clientList.contains(user)){
            Toast.makeText(act.getBaseContext(),
                    "The client is not exist", Toast.LENGTH_SHORT).show();
        }else {
            db.collection("Clients").document(key)
                    .set(user)
                    .addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void aVoid) {
                            Log.d(TAG, "successfully updated");
                        }
                    })
                    .addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.w(TAG, "error updating", e);
                        }
                    });

        }
    }

    @Override
    public Client searchUserByID(String id) {
        DocumentReference docRef = db.collection("Clients").document(id);
        docRef.get().addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
            @Override
            public void onSuccess(DocumentSnapshot documentSnapshot) {
                client = new Client();
                client = documentSnapshot.toObject(Client.class);
            }
        });
        return client;
    }

    @Override
    public List<Client> searchUserByName(String name) {
        return null;
    }

    @Override
    public List<Client> searchAll() {
        clientList = new ArrayList<>();
        db.collection("Client")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                clientList.add( document.toObject(Client.class));
                            }
                        } else {
                            Toast.makeText(act.getBaseContext(),
                                    "Oops, the client list is gone", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
        return clientList;
    }
}
