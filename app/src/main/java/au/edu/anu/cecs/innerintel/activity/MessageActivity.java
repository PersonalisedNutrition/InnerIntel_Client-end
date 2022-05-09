package au.edu.anu.cecs.innerintel.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import au.edu.anu.cecs.innerintel.R;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setLabelVisibilityMode(1);
        bottomNavigationView.getMenu().getItem(3).setChecked(true);
        bottomNavigationView.setItemIconSize(115);
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
                case R.id.navigation_me:
                    intent= new Intent(getApplicationContext(), MePageActivity.class);
                    startActivity(intent);
            }
            return false;
        }
    };

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}

