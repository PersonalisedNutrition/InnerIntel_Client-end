package au.edu.anu.cecs.innerintel.dao;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.enumType.ExerciseType;


public interface ExerciseLogDao {
    //add
    boolean inputExercise(ExerciseType exerciseType);

    //look up
    Set<ExerciseType> lookUpExerciseLogByType(ExerciseType exerciseType);

    ExerciseType lookUpExerciseLogById(int logId);

    //edit
    boolean editExerciseType(int logId, ExerciseType exerciseType);

    boolean editExerciseDescription(int logId, String exerciseDescription);

    //delete
    boolean deleteExerciseLogById(int logId);
}
