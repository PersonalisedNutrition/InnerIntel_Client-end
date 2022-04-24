package au.edu.anu.cecs.innerintel.Bean;

import au.edu.anu.cecs.innerintel.Bean.enumType.UserRole;

/**
 * The entity class of client
 * @author XinyueHu
 */
public class Client extends User {
    private int Height;
    private int Weight;
    private int age;
    private String bloodType;
    private String logInfo;

    public Client(String uid, String name, String sex, String email, UserRole role, String img) {
        super(uid, name, sex, email, role, img);
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
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
