package au.edu.anu.cecs.innerintel.activity.loginActivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

import au.edu.anu.cecs.innerintel.R;

public class QuestionOneActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{
    TextView birthday, gender;
    Button ques1NextButton;
    String[] genderArry = {"male","female"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question_one);

        initView();

        gender.setOnClickListener(v ->{
            //define dialog box
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setSingleChoiceItems(genderArry,1,((dialogInterface, i) ->{
                gender.setText(genderArry[i]);
                dialogInterface.dismiss();
            } ));builder2.show();
        });
        birthday.setOnClickListener(v -> {
            Calendar calendar = Calendar.getInstance();

            DatePickerDialog dialog = new DatePickerDialog(this,this,
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MARCH),
                    calendar.get(Calendar.DAY_OF_MONTH));
            dialog.show();
        });

        ques1NextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),QuestionTwoActivity.class);
                startActivity(i);
            }
        });

    }


    private void initView() {
        birthday = findViewById(R.id.birthday);
        gender = findViewById(R.id.gender);
        ques1NextButton = findViewById(R.id.ques1NextButton);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        @SuppressLint("DefaultLocale") String desc = String.format("%d-%d-%d",year,month+1,dayOfMonth);
        birthday.setText(desc);
    }

}