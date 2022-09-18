package au.edu.anu.cecs.innerintel.Bean;

import au.edu.anu.cecs.innerintel.Bean.enumType.CookingMethod;
import au.edu.anu.cecs.innerintel.Bean.enumType.Unit;

import java.util.HashMap;

/**
 * Food contains in a meal
 *
 * @author Shuyi Chen
 */
public class MealFood {
    private int MealFood_id;

    private Food food;

    private int portion_size;

    private Unit unit;

    private String drink_size;

    private CookingMethod cookingMethod;

    private String Cooking_fats_added;


    public MealFood(int mealFood_id, Food food, int portion_size, Unit unit, String drink_size, CookingMethod cookingMethod, String cooking_fats_added) {
        MealFood_id = mealFood_id;
        this.food = food;
        this.portion_size = portion_size;
        this.unit = unit;
        this.drink_size = drink_size;
        this.cookingMethod = cookingMethod;
        Cooking_fats_added = cooking_fats_added;
    }

    public int getMealFood_id() {
        return MealFood_id;
    }

    public void setMealFood_id(int mealFood_id) {
        MealFood_id = mealFood_id;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getPortion_size() {
        return portion_size;
    }

    public void setPortion_size(int portion_size) {
        this.portion_size = portion_size;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getDrink_size() {
        return drink_size;
    }

    public void setDrink_size(String drink_size) {
        this.drink_size = drink_size;
    }

    public CookingMethod getCookingMethod() {
        return cookingMethod;
    }

    public void setCookingMethod(CookingMethod cookingMethod) {
        this.cookingMethod = cookingMethod;
    }


    public String getCooking_fats_added() {
        return Cooking_fats_added;
    }

    public void setCooking_fats_added(String cooking_fats_added) {
        Cooking_fats_added = cooking_fats_added;
    }
}

