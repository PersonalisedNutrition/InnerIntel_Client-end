package au.edu.anu.cecs.innerintel.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import au.edu.anu.cecs.innerintel.Bean.User;
import au.edu.anu.cecs.innerintel.Bean.enumType.LogType;
import au.edu.anu.cecs.innerintel.Bean.enumType.MealType;
import au.edu.anu.cecs.innerintel.R;

/**
 * Interact the add meal page
 *
 * @author Shuyi Chen
 */
public class AddMealActivity extends AppCompatActivity {
    public User loginUser;
    public LogType logType;
    public Spinner spiMealType;
    public Button btnDate;
    public Button btnTime;
    public Button btnAddFood;
    public Button btnLoadRecipe;
    public Button btnAddMeal;
    public Button btnAddRecipe;
    public TextView tvDate;
    public TextView tvTime;

    public DatePickerDialog datePickerDialog;
    public TimePickerDialog timePickerDialog;
    public Calendar calendar;
    public AlertDialog alertDialog;
    public AlertDialog alertDialogIn;

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
        btnAddFood = findViewById(R.id.addmeal_btn_addfood);
        btnLoadRecipe = findViewById(R.id.addmeal_btn_loadrecipe);
        btnAddRecipe = findViewById(R.id.addmeal_btn_addrecipe);
        btnAddMeal = findViewById(R.id.addmeal_btn_addmeal);

        tvDate = findViewById(R.id.addmeal_tv_date);
        tvTime = findViewById(R.id.addmeal_tv_time);

        btnDate.setOnClickListener(allListener);
        btnTime.setOnClickListener(allListener);
        btnAddFood.setOnClickListener(allListener);
        btnLoadRecipe.setOnClickListener(allListener);
        btnAddRecipe.setOnClickListener(allListener);
        btnAddMeal.setOnClickListener(allListener);

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
                    showTimeDialog();
                    break;
                case R.id.addmeal_btn_addfood:
                    Intent intent = new Intent();
                    intent.setClass(getApplicationContext(), AddFoodActivity.class);
//                    intent.putExtra("user", (Serializable) loginUser);
//                    intent.putExtra("logtype", logType);
                    startActivity(intent);
                    break;
                case R.id.addmeal_btn_loadrecipe:
                    break;
                case R.id.addmeal_btn_addrecipe:
                    alertDialog = new AlertDialog.Builder(AddMealActivity.this)
                            .setTitle("New Recipe")
                            .setMessage("Do you want to add this meal as a new recipe?")
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    View view = getLayoutInflater().inflate(R.layout.dialogedittext, null);
                                    final EditText editText = view.findViewById(R.id.dialog_edittext);
                                    alertDialogIn = new AlertDialog.Builder(AddMealActivity.this)
                                            .setTitle("Enter the label name")
                                            .setView(view)
                                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialogInterface, int i) {
                                                    alertDialogIn.dismiss();
                                                }
                                            })
                                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialogInterface, int i) {
                                                    String content = editText.getText().toString();
                                                    Toast.makeText(AddMealActivity.this,content, Toast.LENGTH_SHORT).show();
                                                    alertDialogIn.dismiss();
                                                }
                                            }).create();
                                    alertDialogIn.show();
                                    alertDialog.dismiss();
                                }
                            })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {
                                    alertDialog.dismiss();
                                }
                            }).create();
                    alertDialog.show();
                    break;
                case R.id.addmeal_btn_addmeal:
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

    private void showTimeDialog() {
        timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int hour, int minute) {
                String time = hour + ":" + minute;
                tvTime.setText(time);
            }
        }, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), true);
        timePickerDialog.show();
    }
}