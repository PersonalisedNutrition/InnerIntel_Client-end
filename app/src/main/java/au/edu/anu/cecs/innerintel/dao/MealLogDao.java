package au.edu.anu.cecs.innerintel.dao;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.MealLog;


public interface MealLogDao {
    //add
    boolean inputMeal(MealLog mealLog);

    //look up
    Set<MealLog> lookUpMealLogByType(String mealLogType);

    Set<MealLog> lookUpMealLogByTime(String mealLogDuration);

    Set<MealLog> lookUpMealLogByFoodItems(String foodItems);

    MealLog lookUpMealLogById(int logId);

    //edit
    boolean editMealDuration(int logId, String mealDuration);

    boolean editFoodItems(int logId, String foodItems);

    boolean editMoodRecord(int logId, String moodRecord);

    //delete
    boolean deleteMealLogById(int logId);
}
