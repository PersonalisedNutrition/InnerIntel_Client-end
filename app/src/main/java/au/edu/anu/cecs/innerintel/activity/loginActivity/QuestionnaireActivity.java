package au.edu.anu.cecs.innerintel.activity.loginActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import au.edu.anu.cecs.innerintel.R;
import au.edu.anu.cecs.innerintel.activity.HomepageActivity;

public class QuestionnaireActivity extends AppCompatActivity {
    Button quesStartButton;
    Button quesSkipButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire);
        initView();

        quesSkipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i  = new Intent(getApplicationContext(), HomepageActivity.class);
                startActivity(i);
            }
        });

        quesStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),QuestionOneActivity.class);
                startActivity(i);
            }
        });
    }

    public void initView(){
        quesSkipButton = findViewById(R.id.quesSkipButton);
        quesStartButton = findViewById(R.id.quesStartButton);
    }
}