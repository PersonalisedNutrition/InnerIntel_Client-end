package au.edu.anu.cecs.innerintel.Bean;



import au.edu.anu.cecs.innerintel.Bean.enumType.BloodType;

import java.util.LinkedList;

/**
 * The entity class of client
 * @author XinyueHu
 */
public class Client extends User {
    private int height;
    private int weight;
    private int age;
    private BloodType bloodType;
    private Allergies allergies;
    private LinkedList<Disease> DiseaseHistory;
    private LinkedList<Log> logs;

    public Client(String uid,int height,int weight,int age,
                  BloodType bloodType) {
        super(uid);
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.bloodType = bloodType;
    }

    public Allergies getAllergies() {
        return allergies;
    }

    public void setAllergies(Allergies allergies) {
        this.allergies = allergies;
    }

    public LinkedList<Disease> getDiseaseHistory() {
        return DiseaseHistory;
    }

    public void setDiseaseHistory(LinkedList<Disease> diseaseHistory) {
        DiseaseHistory = diseaseHistory;
    }

    public LinkedList<Log> getLogs() {
        return logs;
    }

    public void setLogs(LinkedList<Log> logs) {
        this.logs = logs;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
       this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }



    //TODO Client implementation methods need to be complete later.
    public void recordBodyInfo(){}
    public void recordDailyInput() {}
    public String getAdvice() {return null;}
    public String readNutritionistInfo() {return null;}
    public int addNutritionist() {return 0;}


}
