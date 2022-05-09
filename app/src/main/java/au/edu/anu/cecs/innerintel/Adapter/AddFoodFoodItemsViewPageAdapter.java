package au.edu.anu.cecs.innerintel.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Add food page adapter
 *
 * @author Shuyi Chen
 */
public class AddFoodFoodItemsViewPageAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;

    public AddFoodFoodItemsViewPageAdapter(FragmentManager manager, List<Fragment> fragments) {
        super(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.fragments = fragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments == null ? 0 : fragments.size();
    }
}
