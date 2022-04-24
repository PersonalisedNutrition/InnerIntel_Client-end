package au.edu.anu.cecs.innerintel.Bean;


import au.edu.anu.cecs.innerintel.Bean.enumType.BloodType;

/**
 * The entity class of client
 * @author XinyueHu
 */
public class Client extends User {
    private int height;
    private int weight;
    private int age;
    private BloodType bloodType;
    private String logInfo;

    public Client(String uid,int height,int weight,int age,
                  BloodType bloodType, String loginfo) {
        super(uid);
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.bloodType = bloodType;
        this.logInfo = loginfo;
    }

    public Client(String uid,int height,int weight,int age,
                  BloodType bloodType) {
        super(uid);
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.bloodType = bloodType;
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

    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }

    //TODO Client implementation methods need to be complete later.
    public void recordBodyInfo(){}
    public void recordDailyInput() {}
    public String readLog() { return null;}
    public String changeLog() {return null;}
    public String deleteLog() {return null;}
    public String getAdvice() {return null;}
    public String readNutritionistInfo() {return null;}
    public int addNutritionist() {return 0;}


}
