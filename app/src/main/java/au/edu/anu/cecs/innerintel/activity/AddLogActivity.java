package au.edu.anu.cecs.innerintel.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

import au.edu.anu.cecs.innerintel.Bean.User;
import au.edu.anu.cecs.innerintel.Bean.enumType.LogType;
import au.edu.anu.cecs.innerintel.R;

public class AddLogActivity extends AppCompatActivity {
    Button btnAddMeal;
    User loginUser;
    LogType logType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addlog);

        loginUser = null;
        logType = LogType.MEAL;

        btnAddMeal = findViewById(R.id.log_btn_addMeal);
        btnAddMeal.setOnClickListener(allListener);
    }

    private View.OnClickListener allListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(getApplicationContext(), AddMealActivity.class);
            intent.putExtra("user", (Serializable) loginUser);
            intent.putExtra("logtype", logType);
            startActivity(intent);
        }
    };
}