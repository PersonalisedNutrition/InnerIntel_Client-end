package au.edu.anu.cecs.innerintel.Bean;
/**
 * The entity class of nutritionist
 * @author XinyueHu
 */
import java.util.LinkedList;


public class Nutritionist extends User {
    private String intro;
    private LinkedList<Client> conClients;
    private LinkedList<Log> reports;

    public Nutritionist(String uid, String intro, LinkedList<Client> conClients,
                        LinkedList<Log> reports) {
        super(uid);
        this.intro = intro;
        this.conClients = conClients;
        this.reports = reports;
    }

    public Nutritionist(String uid, String intro) {
        super(uid);
        this.intro = intro;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public LinkedList<Client> getConClients() {
        return conClients;
    }

    public void setConClients(LinkedList<Client> conClients) {
        this.conClients = conClients;
    }

    public LinkedList<Log> getReports() {
        return reports;
    }

    public void setReports(LinkedList<Log> reports) {
        this.reports = reports;
    }

    //TODO Nutritionist method needs to be modified.
    public Log readReport(){return null;}
    public void chatWithClient(){}
    public String sendAdvices() {return null;}
    public int countClients(LinkedList<Client> li){
        return li.size();
    }
    public void countReports(){}


}
