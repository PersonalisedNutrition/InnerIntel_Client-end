package au.edu.anu.cecs.innerintel.Bean;


/**
 * The entity class of food data.
 * @author Shiyun Zhu, Xinyue Hu
 */
public class Food {
    private String foodID;
    private String foodType;
    private String foodName;
    private String description;
    private String foodPictureURL;
    private float energy;
    private float water;
    private float protein;
    private float fat;
    private float sugar;
    private float Fe;
    private float Mg;
    private float Ca;
    private float VitaminA;
    private float VitaminB;
    private float VitaminC;
    private float VitaminD;
    private float VitaminE;

    //Different constructor to instantiate.
    public Food(){}
    public Food(String foodID, String foodType, String foodName,
                String foodPictureURL) {
        this.foodID = foodID;
        this.foodType = foodType;
        this.foodName = foodName;
        this.foodPictureURL = foodPictureURL;
    }

    public Food(String foodID, String foodType, String foodName,
                String description,
                String foodPictureURL) {
        this.foodID = foodID;
        this.foodType = foodType;
        this.foodName = foodName;
        this.description = description;
        this.foodPictureURL = foodPictureURL;
    }

    public Food(String foodID, String foodType, String foodName, String description, String foodPictureURL,
                float energy, float water, float protein, float fat, float sugar, float fe, float mg, float ca, float vitaminA, float vitaminB, float vitaminC, float vitaminD, float vitaminE) {
        this.foodID = foodID;
        this.foodType = foodType;
        this.foodName = foodName;
        this.description = description;
        this.foodPictureURL = foodPictureURL;
        this.energy = energy;
        this.water = water;
        this.protein = protein;
        this.fat = fat;
        this.sugar = sugar;
        Fe = fe;
        Mg = mg;
        Ca = ca;
        VitaminA = vitaminA;
        VitaminB = vitaminB;
        VitaminC = vitaminC;
        VitaminD = vitaminD;
        VitaminE = vitaminE;
    }

    public String getFoodID() {
        return foodID;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFoodPictureURL() {
        return foodPictureURL;
    }

    public void setFoodPictureURL(String foodPictureURL) {
        this.foodPictureURL = foodPictureURL;
    }

    public float getEnergy() {
        return energy;
    }

    public void setEnergy(float energy) {
        this.energy = energy;
    }

    public float getWater() {
        return water;
    }

    public void setWater(float water) {
        this.water = water;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public float getFat() {
        return fat;
    }

    public void setFat(float fat) {
        this.fat = fat;
    }

    public float getSugar() {
        return sugar;
    }

    public void setSugar(float sugar) {
        this.sugar = sugar;
    }

    public float getFe() {
        return Fe;
    }

    public void setFe(float fe) {
        Fe = fe;
    }

    public float getMg() {
        return Mg;
    }

    public void setMg(float mg) {
        Mg = mg;
    }

    public float getCa() {
        return Ca;
    }

    public void setCa(float ca) {
        Ca = ca;
    }

    public float getVitaminA() {
        return VitaminA;
    }

    public void setVitaminA(float vitaminA) {
        VitaminA = vitaminA;
    }

    public float getVitaminB() {
        return VitaminB;
    }

    public void setVitaminB(float vitaminB) {
        VitaminB = vitaminB;
    }

    public float getVitaminC() {
        return VitaminC;
    }

    public void setVitaminC(float vitaminC) {
        VitaminC = vitaminC;
    }

    public float getVitaminD() {
        return VitaminD;
    }

    public void setVitaminD(float vitaminD) {
        VitaminD = vitaminD;
    }

    public float getVitaminE() {
        return VitaminE;
    }

    public void setVitaminE(float vitaminE) {
        VitaminE = vitaminE;
    }



    //TODO: Further modify and improve the method
    public void counter(){};
    public void present(){};
    public void cookingMethods(){};

}
