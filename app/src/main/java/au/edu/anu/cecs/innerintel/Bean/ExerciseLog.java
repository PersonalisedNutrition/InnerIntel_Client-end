package au.edu.anu.cecs.innerintel.Bean;

import java.sql.Date;
import java.sql.Time;

import au.edu.anu.cecs.innerintel.Bean.enumType.ExerciseType;
/**
 * when create a Exercise log, also should create a log
 * @author Tianqi Tang
 */
public class ExerciseLog {
    private int exercise_id;
    private int lid;
    private String exerciseType;
    private Date date;
    private Time time;
    private int duration;

    public ExerciseLog(int exercise_id, int lid, String exerciseType, Date date, Time time, int duration) {
        this.exercise_id = exercise_id;
        this.lid = lid;
        this.exerciseType = exerciseType;
        this.date = date;
        this.time = time;
        this.duration = duration;
    }

    public int getExercise_id() {
        return exercise_id;
    }

    public void setExercise_id(int exercise_id) {
        this.exercise_id = exercise_id;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
