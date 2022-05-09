package au.edu.anu.cecs.innerintel.activity.loginActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.util.Objects;

import au.edu.anu.cecs.innerintel.Bean.User;
import au.edu.anu.cecs.innerintel.R;

public class RegisterActivity extends AppCompatActivity {

    boolean testMode = true;

    public static final String TAG = "Sign up with EmailPassword";

    private FirebaseAuth mAuth;

    EditText userName, email, password, passwordRetype;

    Button btSignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        mAuth = FirebaseAuth.getInstance();

        initView();

        btSignUp.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("LongLogTag")
            @Override
            public void onClick(View view) {
                if (testMode){
                    Intent i = new Intent(getApplicationContext(),QuestionnaireActivity.class);
                    startActivity(i);

                }else{
                    if (password.getText().toString()==passwordRetype.getText().toString()){
                        createAccount(email.getText().toString(),password.getText().toString());
                        Log.d(TAG,"Successful creation. Please return to login");
                    }else{
                        Toast.makeText(getApplicationContext(),"The entered passwords are inconsistent",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

    /**
     *init views
     */
    private void initView(){
        userName = findViewById(R.id.userName);
        email = findViewById(R.id.userEmail);
        password = findViewById(R.id.userPassword);
        passwordRetype = findViewById(R.id.password_retype);
        btSignUp = findViewById(R.id.signup);
    }

    /**
     * define the method to sign up with emails
     * @param email email to sign up with
     * @param password password to sign up with
     */
    private void createAccount(String email, String password) {

        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @SuppressLint("LongLogTag")
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();


                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(RegisterActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();


                        }
                    }
                });

    }

}