package au.edu.anu.cecs.innerintel.Bean;

import au.edu.anu.cecs.innerintel.Bean.enumType.CookingMethod;
import au.edu.anu.cecs.innerintel.Bean.enumType.Unit;

/**
 * Food contains in a meal
 *
 * @author Shuyi Chen
 */
public class MealFood {
    private Food food;
    private int amount;
    private Unit unit;
    private CookingMethod cookingMethod;

    public MealFood(Food food, int amount, Unit unit, CookingMethod cookingMethod) {
        this.food = food;
        this.amount = amount;
        this.unit = unit;
        this.cookingMethod = cookingMethod;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public CookingMethod getCookingMethod() {
        return cookingMethod;
    }

    public void setCookingMethod(CookingMethod cookingMethod) {
        this.cookingMethod = cookingMethod;
    }
}

