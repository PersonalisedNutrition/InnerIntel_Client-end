package au.edu.anu.cecs.innerintel.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import au.edu.anu.cecs.innerintel.R;

/**
 * @author Tianqi Tang
 */
public class LogDetailActivity extends AppCompatActivity {
    private ListView listView;
    private Button edit;
    private Button delete;
    private SimpleAdapter adapter;
    private List<Map<String, Object>> lists;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_detail);
        getContent();
        edit = findViewById(R.id.logdetail_btn_edit);
        delete = findViewById(R.id.logdetail_btn_delete);
        listView = findViewById(R.id.logdetail_lv_food);
        imageView = findViewById(R.id.logdetail_im_image);
        adapter = new SimpleAdapter(LogDetailActivity.this, lists, R.layout.logdetail_food_content_item, new
                String[]{"name", "amount"}, new int[]{R.id.logdetail_tv_detail1, R.id.logdetail_tv_detail2});
        listView.setAdapter(adapter);

    }

    private void getContent() {
        String[] name = {"Date", "Time", "Type", "Banana", "Egg", "Apple"};
        String[] amount = {"23/04/2022", "8:00", "Breakfast", "300g", "1", "250g"};
        lists = new ArrayList<>();
        for (int i = 0; i < name.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("name", name[i]);
            map.put("amount", amount[i]);
            lists.add(map);
        }
    }

    private void prepareData() {
    }
}