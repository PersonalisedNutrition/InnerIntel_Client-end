package au.edu.anu.cecs.innerintel.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import au.edu.anu.cecs.innerintel.Bean.User;
import au.edu.anu.cecs.innerintel.Bean.enumType.LogType;
import au.edu.anu.cecs.innerintel.Bean.enumType.MealType;
import au.edu.anu.cecs.innerintel.R;

public class AddMealActivity extends AppCompatActivity {
    public User loginUser;
    public LogType logType;
    public Spinner spiMealType;
    public Button btnDate;
    public Button btnTime;
    public TextView tvDate;
    public DatePickerDialog datePickerDialog;
    public TimePickerDialog timePickerDialog;
    public Calendar calendar;

    private List<MealType> mealTypeList = null;
    private ArrayAdapter<MealType> mealTypeAdapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmeal);

//        loginUser = (User) getIntent().getExtras().getSerializable("user");
//        logType = (LogType) getIntent().getExtras().getSerializable("logtype");

        calendar = Calendar.getInstance();

        btnDate = findViewById(R.id.addmeal_btn_time);
        btnTime = findViewById(R.id.addmeal_btn_date);
        tvDate = findViewById(R.id.addmeal_tv_date);

        btnDate.setOnClickListener(allListener);
        btnTime.setOnClickListener(allListener);

        spiMealType = findViewById(R.id.addmeal_spi_mealtype);
        spiMealType.setPrompt("Which meal would you like to add?");
        mealTypeList = new ArrayList<>();
        mealTypeList.add(MealType.BREAKFAST);
        mealTypeList.add(MealType.LUNCH);
        mealTypeList.add(MealType.DINNER);
        mealTypeList.add(MealType.OTHERS);
        mealTypeAdapter = new ArrayAdapter<MealType>(this, R.layout.support_simple_spinner_dropdown_item, mealTypeList);
        spiMealType.setAdapter(mealTypeAdapter);
    }

    private View.OnClickListener allListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.addmeal_btn_date:
                    showCalendarDialog();
                    break;
                case R.id.addmeal_btn_time:
//                    showCalenderDialog();
                    break;
                case R.id.addmeal_btn_addfood:
                    break;
            }
        }
    };

    private void showCalendarDialog() {
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                String calendar = year + "/" + (month + 1) + "/" + day;
                tvDate.setText(calendar);
            }
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
        datePickerDialog.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    }
}