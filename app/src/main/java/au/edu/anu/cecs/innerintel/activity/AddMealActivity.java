package au.edu.anu.cecs.innerintel.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

import au.edu.anu.cecs.innerintel.Bean.User;
import au.edu.anu.cecs.innerintel.Bean.enumType.LogType;
import au.edu.anu.cecs.innerintel.Bean.enumType.MealType;
import au.edu.anu.cecs.innerintel.R;

public class AddMealActivity extends AppCompatActivity {
    User loginUser;
    LogType logType;
    MealType mealType;
    Spinner spiMealType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmeal);

        loginUser = (User) getIntent().getExtras().getSerializable("user");
        logType = (LogType) getIntent().getExtras().getSerializable("logtype");

        spiMealType = findViewById(R.id.addmeal_spi_mealtype);
        spiMealType.setPrompt("");
    }
}