package au.edu.anu.cecs.innerintel.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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
public class Homepage_daily_fragment extends Fragment {
    private ListView listView;
    private View root;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Homepage_daily_fragment() {
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
    public static Homepage_daily_fragment newInstance(String param1, String param2) {
        Homepage_daily_fragment fragment = new Homepage_daily_fragment();
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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        if (root == null) {
            root = inflater.inflate(R.layout.fragment_homepage_daily_fragment, container, false);
        }
        initView();
        return root;
    }
    private SimpleAdapter adapter;
    private List<Map<String, Object>> lists;
    private String[] theme = {"Calorie", "Water", "Suger"};
    private String[] content = {"123", "123", "123"};
    private String[] cal = {"KJ", "G", "T"};
    private int imageViews = R.mipmap.ic_launcher;
    private Button generate;
    private void initView(){
        lists = new ArrayList<>();
        for (int i = 0; i < theme.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("image", imageViews);
            map.put("theme", theme[i]);
            map.put("content", content[i]);
            map.put("cal",cal[i]);
            lists.add(map);
        }
        generate=root.findViewById(R.id.homepage_bt_dailysub);
        adapter=new SimpleAdapter(this.getActivity(),lists,R.layout.homepage_daily_lvitem,new
                String[] {"image","theme","content","cal"},new int[]{R.id.homepage_dalit_img,R.id.homepage_tv_theme,R.id.homepage_tv_num,R.id.homepage_daily_cal});
        listView=(ListView) root.findViewById(R.id.homepage_lv_daily);
        listView.setAdapter(adapter);
    }
}