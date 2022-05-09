package au.edu.anu.cecs.innerintel.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import au.edu.anu.cecs.innerintel.Adapter.AddFoodFoodItemsViewPageAdapter;
import au.edu.anu.cecs.innerintel.Adapter.HomePageFoodItemsViewPageAdapter;
import au.edu.anu.cecs.innerintel.Fragment.FoodItems_fragment;
import au.edu.anu.cecs.innerintel.R;
/**
 * Interact the add food page
 *
 * @author Shuyi Chen
 */
public class AddFoodActivity extends AppCompatActivity {
    List<Fragment> fragmentList = new ArrayList<>();
    AddFoodFoodItemsViewPageAdapter foodItemsAdapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addfood);

        fragmentList.add(new FoodItems_fragment());
        foodItemsAdapter = new AddFoodFoodItemsViewPageAdapter(getSupportFragmentManager(), fragmentList);

        viewPager = findViewById(R.id.addfood_viewPager);
        viewPager.setAdapter(foodItemsAdapter);
    }
}

