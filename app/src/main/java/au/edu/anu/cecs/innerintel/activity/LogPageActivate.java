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

import au.edu.anu.cecs.innerintel.Adapter.LogPageViewPageAdapter;
import au.edu.anu.cecs.innerintel.Fragment.LogPage_doody_fragment;
import au.edu.anu.cecs.innerintel.Fragment.LogPage_feelings_fragment;
import au.edu.anu.cecs.innerintel.Fragment.LogPage_meals_fragment;
import au.edu.anu.cecs.innerintel.Fragment.LogPage_symptom_fragment;
import au.edu.anu.cecs.innerintel.R;

/**
 * @author Tianqi Tang
 */
public class LogPageActivate extends AppCompatActivity {
    private List<Fragment> fragmentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_page_activate);

        fragmentList.add(new LogPage_meals_fragment());
        fragmentList.add(new LogPage_symptom_fragment());
        fragmentList.add(new LogPage_doody_fragment());
        fragmentList.add(new LogPage_feelings_fragment());

        LogPageViewPageAdapter viewPageAdapter = new LogPageViewPageAdapter(getSupportFragmentManager(), fragmentList);
        ViewPager viewPager = findViewById(R.id.logpage_viewPager);
        viewPager.setAdapter(viewPageAdapter);
        RadioGroup radioGroup = findViewById(R.id.logpage_rg_title);
        RadioButton meals=findViewById(R.id.logpage_rb_maels);
        RadioButton symptom=findViewById(R.id.logpage_rb_symptom);
        RadioButton doody=findViewById(R.id.logpage_rb_doody);
        RadioButton feeling=findViewById(R.id.logpage_rb_feelings);
        meals.setTextColor(getResources().getColor(R.color.mainColor));
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.logpage_rb_maels:
                        viewPager.setCurrentItem(0);
                        meals.setTextColor(getResources().getColor(R.color.mainColor));
                        symptom.setTextColor(Color.parseColor("#979595"));
                        doody.setTextColor(Color.parseColor("#979595"));
                        feeling.setTextColor(Color.parseColor("#979595"));
                        break;
                    case R.id.logpage_rb_symptom:
                        viewPager.setCurrentItem(1);
                        symptom.setTextColor(getResources().getColor(R.color.mainColor));
                        meals.setTextColor(Color.parseColor("#979595"));
                        doody.setTextColor(Color.parseColor("#979595"));
                        feeling.setTextColor(Color.parseColor("#979595"));
                        break;
                    case R.id.logpage_rb_doody:
                        viewPager.setCurrentItem(2);
                        doody.setTextColor(getResources().getColor(R.color.mainColor));
                        meals.setTextColor(Color.parseColor("#979595"));
                        feeling.setTextColor(Color.parseColor("#979595"));
                        symptom.setTextColor(Color.parseColor("#979595"));
                        break;
                    case R.id.logpage_rb_feelings:
                        viewPager.setCurrentItem(3);
                        feeling.setTextColor(getResources().getColor(R.color.mainColor));
                        meals.setTextColor(Color.parseColor("#979595"));
                        symptom.setTextColor(Color.parseColor("#979595"));
                        doody.setTextColor(Color.parseColor("#979595"));
                        break;
                }
            }
        });
    }
}