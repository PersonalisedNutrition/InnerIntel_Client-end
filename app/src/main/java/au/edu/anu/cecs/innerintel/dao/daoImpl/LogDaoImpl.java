package au.edu.anu.cecs.innerintel.dao.daoImpl;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.Log;
import au.edu.anu.cecs.innerintel.dao.LogDao;


/**
 * four main method: add / lookup(search) / update(edit) / delete
 * @author Tianqi Tang
 */
public class LogDaoImpl implements LogDao<LogDao> {

    //Implement singleton design pattern
    private static LogDaoImpl logDao = null;

    public static LogDaoImpl getInstance() {
        if (logDao == null) {
            logDao = new LogDaoImpl();
        }
        return logDao;
    }

    @Override
    public boolean inputLog(LogDao log) {
        return false;
    }

    @Override
    public Set<Log> lookUpLog(String logContent, String searchType) {
        return null;
    }

    @Override
    public boolean editLog(LogDao log) {
        return false;
    }

    @Override
    public boolean deleteLogById(int logId) {
        return false;
    }
}
