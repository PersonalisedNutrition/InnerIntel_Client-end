package au.edu.anu.cecs.innerintel.Bean;
/**
 * The entity class of nutritionist
 * @author XinyueHu
 */
import java.util.LinkedList;


public class Nutritionist extends User {
    private final int nid;
    private String intro;
    private LinkedList<Client> conClients;

    public Nutritionist(String uid, int nid, String intro, LinkedList<Client> conClients
                        ) {
        super(uid);
        this.nid = nid;
        this.intro = intro;
        this.conClients = conClients;

    }

    public Nutritionist(String uid, int nid, String intro) {
        super(uid);
        this.nid = nid;
        this.intro = intro;
    }

    public int getNid() {
        return nid;
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


    //TODO Nutritionist method needs to be modified.
    public Log readReport(){return null;}
    public void chatWithClient(){}
    public String sendAdvices() {return null;}
    public int countClients(LinkedList<Client> li){
        return li.size();
    }
    public void countReports(){}


}
