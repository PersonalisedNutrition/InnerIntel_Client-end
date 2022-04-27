package au.edu.anu.cecs.innerintel.Bean;
/**
 * The entity class of allergies
 * @author XinyueHu
 */
public class Allergies {
    private final int aid;
    private int uid;
    private String allergicFood;
    private String allergicDrug;

    public Allergies(int aid, int uid) {
        this.aid = aid;
        this.uid = uid;
    }

    public int getAid() {
        return aid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
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
