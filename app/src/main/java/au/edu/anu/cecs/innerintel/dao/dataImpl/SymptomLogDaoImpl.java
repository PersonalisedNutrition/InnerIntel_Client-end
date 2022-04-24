package au.edu.anu.cecs.innerintel.dao.dataImpl;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.SymptomLog;
import au.edu.anu.cecs.innerintel.dao.SymptomLogDao;

/**
 * four main method: add / lookup(search) / update(edit) / delete
 */
public class SymptomLogDaoImpl implements SymptomLogDao {

    //Implement singleton design pattern
    private static SymptomLogDaoImpl symptomLogDao = null;

    public static SymptomLogDaoImpl getInstance() {
        if (symptomLogDao == null) {
            symptomLogDao = new SymptomLogDaoImpl();
        }
        return symptomLogDao;
    }

    @Override
    public boolean inputSymptom(SymptomLog symptomLog) {
        return false;
    }

    @Override
    public Set<SymptomLog> lookUpSymptomLogByType(String symptomLogType) {
        return null;
    }

    @Override
    public Set<SymptomLog> lookUpSymptomLogByDuration(String symptomLogDuration) {
        return null;
    }

    @Override
    public SymptomLog lookUpSymptomLogById(int logId) {
        return null;
    }

    @Override
    public boolean editSymptomType(int logId, String symptomType) {
        return false;
    }

    @Override
    public boolean editSymptomDuration(int logId, String symptomDuration) {
        return false;
    }

    @Override
    public boolean editSymptomDescription(int logId, String symptomDescription) {
        return false;
    }

    @Override
    public boolean deleteSymptomLogById(int logId) {
        return false;
    }
}
