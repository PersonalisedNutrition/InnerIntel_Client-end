package au.edu.anu.cecs.innerintel.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import au.edu.anu.cecs.innerintel.Adapter.HomepageViewPagerAdapter;
import au.edu.anu.cecs.innerintel.Fragment.Homepage_daily_fragment;
import au.edu.anu.cecs.innerintel.Fragment.Homepage_fooditems_fragment;
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
        fragmentList.add(new Homepage_fooditems_fragment());

        HomepageViewPagerAdapter viewPagerAdapter = new HomepageViewPagerAdapter(getSupportFragmentManager(), fragmentList);
        ViewPager viewPager = findViewById(R.id.homepage_viewPager);
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
    }
}