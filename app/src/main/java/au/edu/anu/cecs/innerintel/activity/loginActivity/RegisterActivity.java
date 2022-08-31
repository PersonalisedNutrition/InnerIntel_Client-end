package au.edu.anu.cecs.innerintel.activity.loginActivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
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

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Create Account");

        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);



        mAuth = FirebaseAuth.getInstance();

//        initView();
        EditText email_edit=(EditText) findViewById(R.id.userEmail);
        EditText psw_edit=(EditText) findViewById(R.id.userPassword);
        Button btSignUp=(Button) findViewById(R.id.signup);
        TextView change_to_log=(TextView)findViewById(R.id.change_to_log);



        btSignUp.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("LongLogTag")
            @Override
            public void onClick(View view) {
                String email=email_edit.getText().toString().trim();
                String psw=psw_edit.getText().toString().trim();

                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    email_edit.setError("Invalid Email");
                    email_edit.setFocusable(true);
                }else {
                    registerUser(email,psw);
                    email_edit.setText("");
                    psw_edit.setText("");
                }
//                if (testMode){
//                    Intent i = new Intent(getApplicationContext(),QuestionnaireActivity.class);
//                    startActivity(i);
//
//                }else{
//                    if (password.getText().toString()==passwordRetype.getText().toString()){
//                        createAccount(email.getText().toString(),password.getText().toString());
//                        Log.d(TAG,"Successful creation. Please return to login");
//                    }else{
//                        Toast.makeText(getApplicationContext(),"The entered passwords are inconsistent",Toast.LENGTH_LONG).show();
//                    }
//                }

            }
        });

        change_to_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(intent);
            }
        });
    }

//    /**
//     *init views
//     */
//    private void initView(){
//        userName = findViewById(R.id.userName);
//        email = findViewById(R.id.userEmail);
//        password = findViewById(R.id.userPassword);
////        passwordRetype = findViewById(R.id.password_retype);
//        btSignUp = findViewById(R.id.signup);
//    }



    /**
     * define the method to sign up with emails
     * @param email email to sign up with
     * @param psw password to sign up with
     */
//    private void createAccount(String email, String password) {
//
//        mAuth.createUserWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @SuppressLint("LongLogTag")
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            // Sign in success, update UI with the signed-in user's information
//                            Log.d(TAG, "createUserWithEmail:success");
//                            FirebaseUser user = mAuth.getCurrentUser();
//
//
//                        } else {
//                            // If sign in fails, display a message to the user.
//                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
//                            Toast.makeText(RegisterActivity.this, "Authentication failed.",
//                                    Toast.LENGTH_SHORT).show();
//
//
//                        }
//                    }
//                });
//
//    }
    private void registerUser(String email, String psw) {
        mAuth.createUserWithEmailAndPassword(email,psw)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            FirebaseUser user=mAuth.getCurrentUser();


                            Toast.makeText(getApplicationContext(), "Register now\n"+user.getEmail(), Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(getApplicationContext(),QuestionnaireActivity.class);
                            startActivity(i);
                        }else {
                            Toast.makeText(getApplicationContext(), "Authentication failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}

