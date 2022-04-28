package au.edu.anu.cecs.innerintel.dao.daoImpl;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.Log;
import au.edu.anu.cecs.innerintel.Bean.MealLog;
import au.edu.anu.cecs.innerintel.dao.LogDao;


/**
 * four main method: add / lookup(search) / update(edit) / delete
 * @author Tianqi Tang
 */
public class MealLogDaoImpl implements LogDao<MealLog> {

    //Implement singleton design pattern
    private static MealLogDaoImpl mealLogDao = null;

    public static MealLogDaoImpl getInstance() {
        if (mealLogDao == null) {
            mealLogDao = new MealLogDaoImpl();
        }
        return mealLogDao;
    }

    @Override
    public boolean inputLog(MealLog log) {
        return false;
    }

    @Override
    public Set<Log> lookUpLog(String logContent, String searchType) {
        return null;
    }

    @Override
    public boolean editLog(MealLog log) {
        return false;
    }

    @Override
    public boolean deleteLogById(int logId) {
        return false;
    }
}
