package au.edu.anu.cecs.innerintel.dao.dataImpl;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.FeelingLog;
import au.edu.anu.cecs.innerintel.Bean.Log;
import au.edu.anu.cecs.innerintel.Bean.enumType.FeelingType;
import au.edu.anu.cecs.innerintel.dao.LogDao;


/**
 * four main method: add / lookup(search) / update(edit) / delete
 * @author Tianqi Tang
 */
public class FeelingLogDaoImpl implements LogDao<FeelingLog> {

    //Implement singleton design pattern
    private static FeelingLogDaoImpl feelingLogDao = null;

    public static FeelingLogDaoImpl getInstance() {
        if (feelingLogDao == null) {
            feelingLogDao = new FeelingLogDaoImpl();
        }
        return feelingLogDao;
    }

    @Override
    public boolean inputLog(FeelingLog log) {
        return false;
    }

    @Override
    public Set<Log> lookUpLog(String logContent, String searchType) {
        return null;
    }

    @Override
    public boolean editLog(FeelingLog log) {
        return false;
    }

    @Override
    public boolean deleteLogById(int logId) {
        return false;
    }
}
