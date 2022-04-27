package au.edu.anu.cecs.innerintel.dao.dataImpl;


import au.edu.anu.cecs.innerintel.Bean.Client;
import au.edu.anu.cecs.innerintel.dao.UserDataDao;

/**
 * Database operations of clients.
 * @author XinyueHu
 */
public class ClientDaoImpl implements UserDataDao<Client> {

    //Implement singleton design pattern
    private static ClientDaoImpl userDao = null;

    public static ClientDaoImpl getInstance() {
        if (userDao == null) {
            userDao = new ClientDaoImpl();
        }
        return userDao;
    }

    public String readLog(Client user) {return null;}
    public String changeLog(Client user) {return null;}
    public boolean deleteLog(Client user) {return false;}

    public String showDiseaseHistory(Client user){return null;}
    public String showAllergies(Client user){return null;}

    @Override
    public boolean addUser(Client user) {
        return false;
    }

    @Override
    public boolean deleteUser(Client user) {
        return false;
    }

    @Override
    public boolean updateProfile(Client user) {
        return false;
    }

    @Override
    public Client searchUser(String msg) {
        return null;
    }
}
