package au.edu.anu.cecs.innerintel.activity.loginActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Context;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.security.identity.CipherSuiteNotSupportedException;
import android.text.InputType;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GetTokenResult;

import java.io.Serializable;

import au.edu.anu.cecs.innerintel.Bean.Client;
import au.edu.anu.cecs.innerintel.Bean.enumType.BloodType;
import au.edu.anu.cecs.innerintel.Bean.enumType.UserRole;
import au.edu.anu.cecs.innerintel.R;
import au.edu.anu.cecs.innerintel.activity.HomepageActivity;
import au.edu.anu.cecs.innerintel.utils.InformationResources;


/**
 * @author  Shiyun Zhu
 */
public class LoginActivity extends AppCompatActivity
{
//     boolean testMode = true;

    //define the TAG to show the process of the programme
//    private static final String TAG = "EmailPassword";
    //
    private FirebaseAuth mAuth;
//    EditText loginEmail;
//    EditText loginPassword;
//    Button loginButton;
//    Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setTitle("Login Account");

        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowCustomEnabled(true);

        EditText loginEmail = (EditText)findViewById(R.id.loginEmail);
        EditText loginPassword = (EditText)findViewById(R.id.loginPassword);
        Button loginButton = (Button)findViewById(R.id.loginButton);
        Button signUpButton = (Button)findViewById(R.id.signupButton);
        TextView pswRec=(TextView)findViewById(R.id.pswRec);



//        //init the views
//        initView();

        //initialize the FirebaseAuth instance.
        mAuth = FirebaseAuth.getInstance();
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email=loginEmail.getText().toString().trim();
                String password=loginPassword.getText().toString().trim();
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
                    loginEmail.setError("Invalid email");
                    loginEmail.setFocusable(true);
                }else {
                    signIn(email,password);
                    loginEmail.setText("");
                    loginPassword.setText("");
                }
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this,SignUpNoteActivity.class);
                startActivity(i);
            }
        });

        pswRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pswRecover();
            }
        });
    }


//    /**
//     * define the initView to init views
//     */
//    public void initView(){
//        loginEmail = findViewById(R.id.loginEmail);
//        loginPassword = findViewById(R.id.userPassword);
//        loginButton = findViewById(R.id.loginButton);
//        signUpButton = findViewById(R.id.signupButton);
//    }

    private void pswRecover() {
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setTitle("Password Recover");
        LinearLayout linearLayout=new LinearLayout(this);
        EditText emailPr=new EditText(this);
        emailPr.setHint("Email");
        emailPr.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);


        linearLayout.addView(emailPr);
        linearLayout.setPadding(20,20,20,20);
        builder.setView(linearLayout);

        builder.setPositiveButton("Recover", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String email=emailPr.getText().toString().trim();
                beginRecover(email);
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.create().show();


    }

    private void beginRecover(String email) {
        mAuth.sendPasswordResetEmail(email)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(getApplicationContext(), "send Email", Toast.LENGTH_SHORT).show();
                        }else {
                            Toast.makeText(getApplicationContext(), "failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });


    }


    /**
     * define the method to login with email and password
     * @param email emails to sign in
     * @param password password to sign in
     */
    private void signIn(String email, String password) {
//        Log.d(TAG, "signIn:" + email);
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
//                            Log.d(TAG, "signInWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            Toast.makeText(getApplicationContext(), "Login now\n"+user.getEmail(), Toast.LENGTH_SHORT).show();
                            Intent i = new Intent(getApplicationContext(), HomepageActivity.class);
                            //need pass user id to next activity
                            startActivity(i);
                        } else {
                            // If sign in fails, display a message to the user.
//                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(LoginActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }



//===================================================================================
//         BUILD USER ONLY FOR TEST !!!
//         The email is : admin@gamil.com
//         The password is : 123456
//===================================================================================
    public Client client;
    private void buildUser(){
        client = new Client();
        client.setName("admin");
        client.setEmail("admin@gmail.com");
        client.setPsd("123456");
        client.setAge(33);
        client.setSex("female");
        client.setBloodType(BloodType.B);
        client.setAllergies(null);
        client.setHeight(180);
        client.setWeight(70);
        client.setCountry("Australia");
        client.setRole(UserRole.Client);
    }

    private void login () {

        Toast.makeText(getApplicationContext(), "Login Successfully", Toast.LENGTH_LONG).show();
        Intent i = new Intent(LoginActivity.this, HomepageActivity.class);
        i.putExtra("userForTest", (Serializable) client);
        startActivity(i);

    }


//==================================================================================
//==================================================================================

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }


}