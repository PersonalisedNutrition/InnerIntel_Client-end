package au.edu.anu.cecs.innerintel.Bean;


import au.edu.anu.cecs.innerintel.Bean.enumType.UserRole;

/**
 * The entity class of user
 * @author XinyueHu
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

    public User(String uid) {
        this.uid = uid;
    }

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
    //TODO User implementation methods need to be complete later.
    public void signUp() {}
    public void login() {}
    public void setPersonalInfo() {}
    public void getPersonalInfo() {}
    public void changePersonalInfo() {}

}
