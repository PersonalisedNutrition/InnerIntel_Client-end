package au.edu.anu.cecs.innerintel.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.Serializable;

import au.edu.anu.cecs.innerintel.Bean.User;
import au.edu.anu.cecs.innerintel.Bean.enumType.LogType;
import au.edu.anu.cecs.innerintel.R;

/**
 * Interact the add log page
 *
 * @author Shuyi Chen
 */
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
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setLabelVisibilityMode(1);
        bottomNavigationView.getMenu().getItem(2).setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Intent intent;
            switch (item.getItemId()) {
                case R.id.navigation_homepage:
                    intent= new Intent(getApplicationContext(), HomepageActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_logs:
                    intent= new Intent(getApplicationContext(), LogPageActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_add:
                    intent= new Intent(getApplicationContext(), AddLogActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_message:
                    intent= new Intent(getApplicationContext(), MessageActivity.class);
                    startActivity(intent);
                    return true;

            }
            return false;
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
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