package au.edu.anu.cecs.innerintel.activity.loginActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import au.edu.anu.cecs.innerintel.R;

public class QuestionTwoActivity extends AppCompatActivity {
    Button quest2NextButton;
    TextView height, weight, bloodType;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_two);
        initView();

        quest2NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i =new Intent(getApplicationContext(),QuestionThreeActivity.class);
                startActivity(i);
            }
        });

    }

    private  void initView(){
        quest2NextButton = findViewById(R.id.ques2NextButton);
        height = findViewById(R.id.height);
        weight = findViewById(R.id.weight);
        bloodType = findViewById(R.id.bloodType);
    }
}