package au.edu.anu.cecs.innerintel.Bean;


import java.util.Date;

import au.edu.anu.cecs.innerintel.Bean.enumType.BloodType;
import au.edu.anu.cecs.innerintel.Bean.enumType.Unit;
import au.edu.anu.cecs.innerintel.Bean.enumType.UserRole;

/**
 * The entity class of user
 * @author XinyueHu
 * @author ShiyunZhu
 */
public class User {
    private final String uid; // one user has only one uid.
    private String psd;
    private String name;
    private String sex;
    private String email;
    private UserRole role;
    private String img;
    private String securityQuestions;



    private String country;
    private Unit unit;
    private String zipCode;

    //be like "1999-05-22"
    private Date birthday;
    private int height;
    private int weight;
    private BloodType bloodType;

    private String allergen;
    private String medicalHistory;


    public User(String uid) { this.uid = uid; }

    public User(String uid, String name,
                String sex, String email, UserRole role, String img) {
        this.uid = uid;
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.role = role;
        this.img = img;
    }

    public String getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPsd() {
        return psd;
    }

    public void setPsd(String psd) {
        this.psd = psd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSecurityQuestions() {
        return securityQuestions;
    }

    public void setSecurityQuestions(String securityQuestions) {
        this.securityQuestions = securityQuestions;
    }



    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }


    //TODO User implementation methods need to be complete later.
    public void signUp() {}
    public void login() {}
    public void setPersonalInfo() {}
    public void getPersonalInfo() {}
    public void changePersonalInfo() {}

}
