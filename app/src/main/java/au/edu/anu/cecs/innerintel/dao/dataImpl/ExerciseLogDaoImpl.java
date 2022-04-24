package au.edu.anu.cecs.innerintel.dao.dataImpl;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.ExerciseLog;
import au.edu.anu.cecs.innerintel.Bean.Log;
import au.edu.anu.cecs.innerintel.Bean.enumType.ExerciseType;
import au.edu.anu.cecs.innerintel.dao.LogDao;


/**
 * four main method: add / lookup(search) / update(edit) / delete
 * @author Tianqi Tang
 */
public class ExerciseLogDaoImpl implements LogDao<ExerciseLog> {

    //Implement singleton design pattern
    private static ExerciseLogDaoImpl exerciseLogDao = null;

    public static ExerciseLogDaoImpl getInstance() {
        if (exerciseLogDao == null) {
            exerciseLogDao = new ExerciseLogDaoImpl();
        }
        return exerciseLogDao;
    }

    @Override
    public boolean inputLog(ExerciseLog log) {
        return false;
    }

    @Override
    public Set<Log> lookUpLog(String logContent, String searchType) {
        return null;
    }

    @Override
    public boolean editLog(ExerciseLog log) {
        return false;
    }

    @Override
    public boolean deleteLogById(int logId) {
        return false;
    }
}
