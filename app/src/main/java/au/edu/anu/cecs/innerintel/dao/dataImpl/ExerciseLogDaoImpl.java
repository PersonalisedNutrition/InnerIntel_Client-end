package au.edu.anu.cecs.innerintel.dao.dataImpl;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.enumType.ExerciseType;
import au.edu.anu.cecs.innerintel.dao.ExerciseLogDao;


/**
 * four main method: add / lookup(search) / update(edit) / delete
 */
public class ExerciseLogDaoImpl implements ExerciseLogDao {

    //Implement singleton design pattern
    private static ExerciseLogDaoImpl exerciseLogDao = null;

    public static ExerciseLogDaoImpl getInstance() {
        if (exerciseLogDao == null) {
            exerciseLogDao = new ExerciseLogDaoImpl();
        }
        return exerciseLogDao;
    }

    @Override
    public boolean inputExercise(ExerciseType exerciseType) {
        return false;
    }

    @Override
    public Set<ExerciseType> lookUpExerciseLogByType(ExerciseType exerciseType) {
        return null;
    }

    @Override
    public ExerciseType lookUpExerciseLogById(int logId) {
        return null;
    }

    @Override
    public boolean editExerciseType(int logId, ExerciseType exerciseType) {
        return false;
    }

    @Override
    public boolean editExerciseDescription(int logId, String exerciseDescription) {
        return false;
    }

    @Override
    public boolean deleteExerciseLogById(int logId) {
        return false;
    }
}
