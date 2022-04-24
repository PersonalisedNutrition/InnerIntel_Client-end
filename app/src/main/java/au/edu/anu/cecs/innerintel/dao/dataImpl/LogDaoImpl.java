package au.edu.anu.cecs.innerintel.dao.dataImpl;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.Log;
import au.edu.anu.cecs.innerintel.dao.LogDao;


/**
 * four main method: add / lookup(search) / update(edit) / delete
 */
public class LogDaoImpl implements LogDao {

    //Implement singleton design pattern
    private static LogDaoImpl logDao = null;

    public static LogDaoImpl getInstance() {
        if (logDao == null) {
            logDao = new LogDaoImpl();
        }
        return logDao;
    }

    @Override
    public boolean inputLog(Log log) {
        return false;
    }

    @Override
    public Set<Log> lookUpLogByType(String logType) {
        return null;
    }

    @Override
    public Set<Log> lookUpLogByTime(String logTime) {
        return null;
    }

    @Override
    public Set<Log> lookUpLogByAuthority(int logAuthority) {
        return null;
    }

    @Override
    public Log lookUpLogById(int logId) {
        return null;
    }

    @Override
    public boolean editLogType(int logId, String logType) {
        return false;
    }

    @Override
    public boolean editLogTime(int logId, String logTime) {
        return false;
    }

    @Override
    public boolean editLogAuthority(int logId, int logAuthority) {
        return false;
    }

    @Override
    public boolean deleteLogById(int logId) {
        return false;
    }
}
