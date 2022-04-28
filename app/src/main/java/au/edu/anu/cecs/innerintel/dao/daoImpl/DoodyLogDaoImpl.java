package au.edu.anu.cecs.innerintel.dao.daoImpl;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.DoodyLog;
import au.edu.anu.cecs.innerintel.Bean.Log;
import au.edu.anu.cecs.innerintel.dao.LogDao;


/**
 * four main method: add / lookup(search) / update(edit) / delete
 * @author Tianqi Tang
 */
public class DoodyLogDaoImpl implements LogDao<DoodyLog> {

    //Implement singleton design pattern
    private static DoodyLogDaoImpl doodyLogDao = null;

    public static DoodyLogDaoImpl getInstance() {
        if (doodyLogDao == null) {
            doodyLogDao = new DoodyLogDaoImpl();
        }
        return doodyLogDao;
    }

    @Override
    public boolean inputLog(DoodyLog log) {
        return false;
    }

    @Override
    public Set<Log> lookUpLog(String logContent, String searchType) {
        return null;
    }

    @Override
    public boolean editLog(DoodyLog log) {
        return false;
    }

    @Override
    public boolean deleteLogById(int logId) {
        return false;
    }
}
