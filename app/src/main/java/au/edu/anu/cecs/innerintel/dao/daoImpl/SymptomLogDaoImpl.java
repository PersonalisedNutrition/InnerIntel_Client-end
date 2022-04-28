package au.edu.anu.cecs.innerintel.dao.daoImpl;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.Log;
import au.edu.anu.cecs.innerintel.Bean.SymptomLog;
import au.edu.anu.cecs.innerintel.dao.LogDao;

/**
 * four main method: add / lookup(search) / update(edit) / delete
 * @author Tianqi Tang
 */
public class SymptomLogDaoImpl implements LogDao<SymptomLog> {

    //Implement singleton design pattern
    private static SymptomLogDaoImpl symptomLogDao = null;

    public static SymptomLogDaoImpl getInstance() {
        if (symptomLogDao == null) {
            symptomLogDao = new SymptomLogDaoImpl();
        }
        return symptomLogDao;
    }

    @Override
    public boolean inputLog(SymptomLog log) {
        return false;
    }

    @Override
    public Set<Log> lookUpLog(String logContent, String searchType) {
        return null;
    }

    @Override
    public boolean editLog(SymptomLog log) {
        return false;
    }

    @Override
    public boolean deleteLogById(int logId) {
        return false;
    }
}
