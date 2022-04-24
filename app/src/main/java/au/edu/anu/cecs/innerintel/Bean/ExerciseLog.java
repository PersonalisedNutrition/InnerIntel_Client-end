package au.edu.anu.cecs.innerintel.Bean;

import au.edu.anu.cecs.innerintel.Bean.enumType.ExerciseType;
/**
 * when create a Exercise log, also should create a log
 * @author Tianqi Tang
 */
public class ExerciseLog {
    private final int logId; // can never edit, once create || this will relate with log by logId
    private ExerciseType exerciseType;
    private String exerciseDescription;

    public ExerciseLog(int logId, ExerciseType exerciseType) {
        this.logId = logId;
        this.exerciseType = exerciseType;
        this.exerciseDescription = null;
    }

    public ExerciseLog(int logId, ExerciseType exerciseType, String exerciseDescription) {
        this.logId = logId;
        this.exerciseType = exerciseType;
        this.exerciseDescription = exerciseDescription;
    }

    public void setExerciseType(ExerciseType exerciseType) {
        this.exerciseType = exerciseType;
    }

    public void setExerciseDescription(String exerciseDescription) {
        this.exerciseDescription = exerciseDescription;
    }

    public int getLogId() {
        return logId;
    }

    public ExerciseType getExerciseType() {
        return exerciseType;
    }

    public String getExerciseDescription() {
        return exerciseDescription;
    }
}
