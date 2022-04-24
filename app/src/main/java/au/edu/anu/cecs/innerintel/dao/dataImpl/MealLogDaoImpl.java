package au.edu.anu.cecs.innerintel.dao.dataImpl;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.MealLog;
import au.edu.anu.cecs.innerintel.dao.MealLogDao;


/**
 * four main method: add / lookup(search) / update(edit) / delete
 */
public class MealLogDaoImpl implements MealLogDao {

    //Implement singleton design pattern
    private static MealLogDaoImpl mealLogDao = null;

    public static MealLogDaoImpl getInstance() {
        if (mealLogDao == null) {
            mealLogDao = new MealLogDaoImpl();
        }
        return mealLogDao;
    }

    @Override
    public boolean inputMeal(MealLog mealLog) {
        return false;
    }

    @Override
    public Set<MealLog> lookUpMealLogByType(String mealLogType) {
        return null;
    }

    @Override
    public Set<MealLog> lookUpMealLogByTime(String mealLogDuration) {
        return null;
    }

    @Override
    public Set<MealLog> lookUpMealLogByFoodItems(String foodItems) {
        return null;
    }

    @Override
    public MealLog lookUpMealLogById(int logId) {
        return null;
    }

    @Override
    public boolean editMealDuration(int logId, String mealDuration) {
        return false;
    }

    @Override
    public boolean editFoodItems(int logId, String foodItems) {
        return false;
    }

    @Override
    public boolean editMoodRecord(int logId, String moodRecord) {
        return false;
    }

    @Override
    public boolean deleteMealLogById(int logId) {
        return false;
    }
}
