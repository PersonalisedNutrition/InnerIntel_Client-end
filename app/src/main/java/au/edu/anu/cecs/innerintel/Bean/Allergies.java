package au.edu.anu.cecs.innerintel.Bean;
/**
 * The entity class of allergies
 * @author XinyueHu
 */
public class Allergies {
    private int allergyID;
    private int cid;
    private String allergicFood;
    private String allergicDrug;

    public Allergies(){}

    public Allergies(int allergyID, int cid) {
        this.allergyID = allergyID;
        this.cid = cid;
    }

    public int getAllergyID() {
        return allergyID;
    }

    public int getCid() {
        return cid;
    }

    public void setUid(int cid) {
        this.cid = cid;
    }

    public String getAllergicFood() {
        return allergicFood;
    }

    public void setAllergicFood(String allergicFood) {
        this.allergicFood = allergicFood;
    }

    public String getAllergicDrug() {
        return allergicDrug;
    }

    public void setAllergicDrug(String allergicDrug) {
        this.allergicDrug = allergicDrug;
    }
}
