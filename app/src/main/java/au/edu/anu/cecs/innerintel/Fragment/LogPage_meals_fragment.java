package au.edu.anu.cecs.innerintel.Fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import au.edu.anu.cecs.innerintel.R;
import au.edu.anu.cecs.innerintel.activity.LogDetailActivity;

/**
 * @author Tianqi Tang
 */
public class LogPage_meals_fragment extends Fragment {
    private ListView listView;
    private View root;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public LogPage_meals_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LogPage_meals_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LogPage_meals_fragment newInstance(String param1, String param2) {
        LogPage_meals_fragment fragment = new LogPage_meals_fragment();
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

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (root == null) {
            root = inflater.inflate(R.layout.fragment_log_page_meals, container, false);
        }
        initView();
        return root;
    }
    private SimpleAdapter adapter;
    private List<Map<String, Object>> lists;
    private String[] date = {"2022/4/23", "2022/4/14", "2022/4/25"};
    private String[] time = {"10:00", "11:00", "12:00"};
    private String[] type = {"Breakfast", "Lunch", "Dinner"};
    private void initView(){
        lists = new ArrayList<>();
        for (int i = 0; i < date.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("data", date[i]);
            map.put("time", time[i]);
            map.put("type", type[i]);
            lists.add(map);
        }
        adapter=new SimpleAdapter(this.getActivity(),lists,R.layout.logpage_meal_fragment_item,new
                String[] {"data","time","type"},new int[]{R.id.logpage_item_date,R.id.logpage_item_time,R.id.logpage_item_type});
        listView=(ListView) root.findViewById(R.id.logpage_lv_mealsfrag);
        listView.setAdapter(adapter);

        //click
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), LogDetailActivity.class);
                startActivity(intent);
            }
        });
    }
}