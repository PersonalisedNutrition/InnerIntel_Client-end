package au.edu.anu.cecs.innerintel.Bean;


import au.edu.anu.cecs.innerintel.Bean.enumType.UserRole;

/**
 * The entity class of user
 * @author XinyueHu, Shiyun Zhu
 */
public class User {
    private String uid; // one user has only one uid.
    private String psd;
    private String name;
    private String sex;
    private String country;
    private String postalCode;
    private String phone;
    private String email;
    private UserRole role;
    private String img;

    public User(String uid) {
        this.uid = uid;
    }

    public User(){}

    public User(String uid, String name,
                String sex, String country, String postalCode, String phone, String email, UserRole role, String img) {
        this.uid = uid;
        this.name = name;
        this.sex = sex;
        this.country = country;
        this.postalCode = postalCode;
        this.phone = phone;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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


    //TODO User implementation methods need to be complete later.
    public void signUp() {}
    public void login() {}
    public void setPersonalInfo() {}
    public void getPersonalInfo() {}
    public void changePersonalInfo() {}

}
