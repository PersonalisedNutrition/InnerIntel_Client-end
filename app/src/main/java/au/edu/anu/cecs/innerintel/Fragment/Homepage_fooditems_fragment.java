package au.edu.anu.cecs.innerintel.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nullable;

import au.edu.anu.cecs.innerintel.R;


/**
 * @author Tianqi Tang
 */
public class Homepage_fooditems_fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Homepage_fooditems_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Homepage_fooditems_fragment newInstance(String param1, String param2) {
        Homepage_fooditems_fragment fragment = new Homepage_fooditems_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    private ListView listView;
    private View root;
    private List<Map<String, Object>> foodList;
    private String[] foodname = {"Apple", "Beef", "Juice"};
    SimpleAdapter food;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (root == null) {
            root = inflater.inflate(R.layout.fragment_homepage_fooditems_fragment, container, false);
        }
        initView();
        return root;
    }
    private void initView(){
        foodList = new ArrayList<>();
        for (int i = 0; i < foodname.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("foodname", foodname[i]);
            foodList.add(map);
        }
        listView=root.findViewById(R.id.homepage_lv_food);
        food=new SimpleAdapter(this.getActivity(),foodList, R.layout.homepage_fooditem_lvitem,new String[]{"foodname"},new int[]{R.id.homepage_tv_content});
        listView.setAdapter(food);
    }
}