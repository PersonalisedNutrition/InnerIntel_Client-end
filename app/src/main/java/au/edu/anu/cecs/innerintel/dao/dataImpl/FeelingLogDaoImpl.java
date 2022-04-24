package au.edu.anu.cecs.innerintel.dao.dataImpl;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.FeelingLog;
import au.edu.anu.cecs.innerintel.Bean.enumType.FeelingType;
import au.edu.anu.cecs.innerintel.dao.FeelingLogDao;


/**
 * four main method: add / lookup(search) / update(edit) / delete
 */
public class FeelingLogDaoImpl implements FeelingLogDao {

    //Implement singleton design pattern
    private static FeelingLogDaoImpl feelingLogDao = null;

    public static FeelingLogDaoImpl getInstance() {
        if (feelingLogDao == null) {
            feelingLogDao = new FeelingLogDaoImpl();
        }
        return feelingLogDao;
    }

    @Override
    public boolean inputFeeling(FeelingLog feelingLog) {
        return false;
    }

    @Override
    public Set<FeelingLog> lookUpFeelingLogByType(FeelingType feelingType) {
        return null;
    }

    @Override
    public FeelingLog lookUpFeelingLogById(int logId) {
        return null;
    }

    @Override
    public boolean editFeelingType(int logId, FeelingType feelingType) {
        return false;
    }

    @Override
    public boolean editFeelingDescription(int logId, String feelingDescription) {
        return false;
    }

    @Override
    public boolean deleteFeelingLogById(int logId) {
        return false;
    }
}
