package au.edu.anu.cecs.innerintel.Bean;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.enumType.MealType;

/**
 * when create a meal log, also should create a log
 * @author Tianqi Tang
 */
public class MealLog {
    private final int logId; // can never edit, once create || this will relate with log by logId
    private MealType mealType;
    private String mealDuration;
    private Set<MealFood> foodItems;
    private String foodPhotos;
    private String moodRecord;

    public MealLog(int logId, MealType mealType, String mealDuration, Set<MealFood> foodItems, String foodPhotos, String moodRecord) {
        this.logId = logId;
        this.mealType = mealType;
        this.mealDuration = mealDuration;
        this.foodItems = foodItems;
        this.foodPhotos = foodPhotos;
        this.moodRecord = moodRecord;
    }

    public MealLog(int logId, MealType mealType) {
        this.logId = logId;
        this.mealType = mealType;
        this.mealDuration = null;
        this.foodItems = null;
        this.foodPhotos = null;
        this.moodRecord = null;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public void setMealDuration(String mealDuration) {
        this.mealDuration = mealDuration;
    }

    public void setFoodItems(Set<MealFood> foodItems) {
        this.foodItems = foodItems;
    }

    public void setFoodPhotos(String foodPhotos) {
        this.foodPhotos = foodPhotos;
    }

    public void setMoodRecord(String moodRecord) {
        this.moodRecord = moodRecord;
    }

    public int getLogId() {
        return logId;
    }

    public MealType getMealType() {
        return mealType;
    }

    public String getMealDuration() {
        return mealDuration;
    }

    public Set<MealFood> getFoodItems() {
        return foodItems;
    }

    public String getFoodPhotos() {
        return foodPhotos;
    }

    public String getMoodRecord() {
        return moodRecord;
    }
}
