package au.edu.anu.cecs.innerintel.Bean;

import java.sql.Date;
import java.sql.Time;

public class DiscomfortLog {
    private int discomfort_id;
    private int lid; // can never edit, once create || this will relate with log by logId
    private int degree;
    private Date date;
    private Time time;
    private String description;

    public DiscomfortLog(int discomfort_id, int lid, int degree, Date date, Time time, String description) {
        this.discomfort_id = discomfort_id;
        this.lid = lid;
        this.degree = degree;
        this.date = date;
        this.time = time;
        this.description = description;
    }

    public int getDiscomfort_id() {
        return discomfort_id;
    }

    public void setDiscomfort_id(int discomfort_id) {
        this.discomfort_id = discomfort_id;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
