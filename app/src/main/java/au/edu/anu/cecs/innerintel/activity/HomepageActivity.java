package au.edu.anu.cecs.innerintel.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import au.edu.anu.cecs.innerintel.Adapter.HomePageFoodItemsViewPageAdapter;
import au.edu.anu.cecs.innerintel.Fragment.Homepage_daily_fragment;
import au.edu.anu.cecs.innerintel.Fragment.FoodItems_fragment;
import au.edu.anu.cecs.innerintel.R;


/**
 * @author Tianqi Tang
 */
public class HomepageActivity extends AppCompatActivity {
    private List<Fragment> fragmentList = new ArrayList<>();

    @Override
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.setContentView(R.layout.activity_homepage);

        fragmentList.add(new Homepage_daily_fragment());
        fragmentList.add(new FoodItems_fragment());

        HomePageFoodItemsViewPageAdapter viewPagerAdapter = new HomePageFoodItemsViewPageAdapter(getSupportFragmentManager(), fragmentList);
        ViewPager viewPager = findViewById(R.id.addfood_viewPager);
        viewPager.setAdapter(viewPagerAdapter);
        RadioGroup radioGroup = findViewById(R.id.homepage_rg);
        RadioButton daily=findViewById(R.id.homepage_rb_daily);
        RadioButton fooditem=findViewById(R.id.homepage_rb_fooditems);
        daily.setTextColor(getResources().getColor(R.color.mainColor));
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.homepage_rb_daily:
                        viewPager.setCurrentItem(0);
                        daily.setTextColor(getResources().getColor(R.color.mainColor));
                        fooditem.setTextColor(Color.parseColor("#979595"));
                        break;
                    case R.id.homepage_rb_fooditems:
                        viewPager.setCurrentItem(1);
                        fooditem.setTextColor(getResources().getColor(R.color.mainColor));
                        daily.setTextColor(Color.parseColor("#979595"));
                        break;
                }
            }
        });
        BottomNavigationView bottomNavigationView=findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_homepage:
                    Intent intent = new Intent(getApplicationContext(), HomepageActivity.class);
                    startActivity(intent);
                    return true;
                case R.id.navigation_logs:
                    Intent intent1= new Intent(getApplicationContext(), LogPageActivity.class);

                    startActivity(intent1);
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