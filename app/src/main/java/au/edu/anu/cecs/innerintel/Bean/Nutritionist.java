package au.edu.anu.cecs.innerintel.Bean;

import java.util.LinkedList;
import java.util.List;

public class Nutritionist extends User {
    private String intro;
    private List<Client> conClients;
    private LinkedList<String> reports;  //TODO here String must be replaced by Log.class
    public Nutritionist(String uid, String name, String sex, String email, String role, String img) {
        super(uid, name, sex, email, role, img);
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public List<Client> getConClients() {
        return conClients;
    }

    public void setConClients(List<Client> conClients) {
        this.conClients = conClients;
    }

    public LinkedList<String> getReports() {
        return reports;
    }

    public void setReports(LinkedList<String> reports) {
        this.reports = reports;
    }

    // TODO void must be replaced by Log.class
    public void readReport(){}
    public void chatWithClient(){}
    public String sendAdvices() {return null;}
    public int countClients(List<Client> li){
        return li.size();
    }
    public void countReports(){}


}
