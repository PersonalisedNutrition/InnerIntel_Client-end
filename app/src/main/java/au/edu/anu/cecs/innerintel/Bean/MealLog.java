package au.edu.anu.cecs.innerintel.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.enumType.MealType;

/**
 * when create a meal log, also should create a log
 *
 * @author Tianqi Tang
 */
public class MealLog {
    private final int logId; // can never edit, once create || this will relate with log by logId
    private MealType mealType;
    private String startTime;
    private String mealDuration;
    private MealFood foodItems;
    private String moodRecord;
    private String foodPhotos;

    public MealLog(int logId, MealType mealType, String startTime, String mealDuration, MealFood foodItems, String moodRecord, String foodPhotos) {
        this.logId = logId;
        this.mealType = mealType;
        this.startTime = startTime;
        this.mealDuration = mealDuration;
        this.foodItems = foodItems;
        this.moodRecord = moodRecord;
        this.foodPhotos = foodPhotos;
    }

    public MealLog(int logId, MealType mealType, String startTime) {
        this.logId = logId;
        this.mealType = mealType;
        this.startTime = startTime;
        this.mealDuration = null;
        this.foodItems = null;
        this.moodRecord = null;
        this.foodPhotos = null;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public void setMealDuration(String mealDuration) {
        this.mealDuration = mealDuration;
    }

    public void setFoodItems(MealFood foodItems) {
        this.foodItems = foodItems;
    }

    public void setMoodRecord(String moodRecord) {
        this.moodRecord = moodRecord;
    }

    public void setFoodPhotos(String foodPhotos) {
        this.foodPhotos = foodPhotos;
    }

    public int getLogId() {
        return logId;
    }

    public MealType getMealType() {
        return mealType;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getMealDuration() {
        return mealDuration;
    }

    public MealFood getFoodItems() {
        return foodItems;
    }

    public String getMoodRecord() {
        return moodRecord;
    }

    public String getFoodPhotos() {
        return foodPhotos;
    }
}
