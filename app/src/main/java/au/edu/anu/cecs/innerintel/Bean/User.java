package au.edu.anu.cecs.innerintel.Bean;

public class User {
    private String uid;
    private String psd;
    private String name;
    private String sex;
    private String email;
    private String role;
    private String img;
    private String securityQuestions;

    public User(String uid, String name,
                String sex, String email, String role, String img) {
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

    public void setUid(String uid) {
        this.uid = uid;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
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

    public void signUp() {}
    public void login() {}
    public void setPersonalInfo() {}
    public void getPersonalInfo() {}
    public void changePersonalInfo() {}

}
