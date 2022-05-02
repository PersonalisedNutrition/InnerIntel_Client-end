package au.edu.anu.cecs.innerintel.activity.loginActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import au.edu.anu.cecs.innerintel.R;
import au.edu.anu.cecs.innerintel.utils.InformationResources;


/**
 * @author  Shiyun Zhu
 */
public class LoginActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    InformationResources info = new InformationResources();
    EditText email;
    EditText password;

    Button login;
    Button signUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //initialize the FirebaseAuth instance.
        mAuth = FirebaseAuth.getInstance();




    }

    /**
     * When initializing your Activity,
     * check to see if the user is currently signed in.
     */
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }






    private void updateUI(FirebaseUser currentUser) {
    }




}