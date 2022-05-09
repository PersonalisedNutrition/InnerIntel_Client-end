package au.edu.anu.cecs.innerintel.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

import au.edu.anu.cecs.innerintel.R;
import au.edu.anu.cecs.innerintel.activity.AddLogActivity;
import au.edu.anu.cecs.innerintel.activity.HomepageActivity;
import au.edu.anu.cecs.innerintel.activity.LogPageActivity;
import au.edu.anu.cecs.innerintel.activity.MessageActivity;

public class MePageActivity extends AppCompatActivity {
    private boolean testMode = true;


    Button meSteButton, meEditButton;
    ListView listView;
    ArrayList<String> meInfo = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me_page);

        addInfo();
        listView = findViewById(R.id.meListview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,meInfo);
        listView.setAdapter(arrayAdapter);
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setLabelVisibilityMode(1);
        bottomNavigationView.getMenu().getItem(4).setChecked(true);
        bottomNavigationView.setItemIconSize(115);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }




    private void addInfo(){ meInfo.add("Name: admin");
        meInfo.add("Name: admin");
        meInfo.add("Email: admin@gmail.com");
        meInfo.add("Nationality: Australia");
        meInfo.add("Height: 180cm");
        meInfo.add("Weight: 70kg");

        meInfo.add("Blood Type: B");
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
}