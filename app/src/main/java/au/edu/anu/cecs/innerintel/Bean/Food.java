package au.edu.anu.cecs.innerintel.Bean;

import au.edu.anu.cecs.innerintel.Bean.enumType.FoodType;

/**
 * The entity class of food data.
 * @author Shiyun Zhu
 */
public class Food {
    FoodType foodType;
    String foodName;
    String foodPictureURL;
    String foodInfo;
    int foodMeasurement;


    //Different constructor to instantiate.
    public Food(FoodType foodType, String foodName, String foodPictureURL, String foodInfo, int foodMeasurement) {
        this.foodType = foodType;
        this.foodName = foodName;
        this.foodPictureURL = foodPictureURL;
        this.foodInfo = foodInfo;
        this.foodMeasurement = foodMeasurement;
    }

    public Food(FoodType foodType, String foodName, int foodMeasurement) {
        this.foodType = foodType;
        this.foodName = foodName;
        this.foodMeasurement = foodMeasurement;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getFoodPictureURL() {
        return foodPictureURL;
    }

    public String getFoodInfo() {
        return foodInfo;
    }

    public int getFoodMeasurement() {
        return foodMeasurement;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setFoodPictureURL(String foodPictureURL) {
        this.foodPictureURL = foodPictureURL;
    }

    public void setFoodInfo(String foodInfo) {
        this.foodInfo = foodInfo;
    }

    public void setFoodMeasurement(int foodMeasurement) {
        this.foodMeasurement = foodMeasurement;
    }

    //TODO: Further modify and improve the method
    public void counter(){};
    public void present(){};
    public void cookingMethods(){};

}
