package au.edu.anu.cecs.innerintel.activity.loginActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import au.edu.anu.cecs.innerintel.R;

public class SignUpNoteActivity extends AppCompatActivity {
    //sign up as user or nutritionist
    Button signAsU;
    Button signAsN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_note);

        initView();
        signAsN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUpNoteActivity.this,"Coming soon.",Toast.LENGTH_LONG).show();
            }
        });

        signAsU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignUpNoteActivity.this,RegisterActivity.class);
                startActivity(i);
            }
        });
    }


    private void initView(){
        signAsN = findViewById(R.id.signupAsN);
        signAsU = findViewById(R.id.signupAsU);
    }
}