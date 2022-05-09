package au.edu.anu.cecs.innerintel.activity.loginActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import au.edu.anu.cecs.innerintel.R;

public class QuestionThreeActivity extends AppCompatActivity {
    Button question3NextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_three);
        initView();
        question3NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),ProfileActivity.class);
                startActivity(i);
            }
        });
    }

    private void initView(){
        question3NextButton = findViewById(R.id.ques3NextButton);
    }
}