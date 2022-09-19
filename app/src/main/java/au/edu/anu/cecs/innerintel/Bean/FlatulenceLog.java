package au.edu.anu.cecs.innerintel.Bean;

import java.sql.Date;
import java.sql.Time;

public class FlatulenceLog {
    private int flatulence_id;
    private int lid;
    private int degree;
    private Date date;
    private Time time;


    public FlatulenceLog(int flatulence_id, int lid, int degree, Date date, Time time) {
        this.flatulence_id = flatulence_id;
        this.lid = lid;
        this.degree = degree;
        this.date = date;
        this.time = time;
    }

    public int getFlatulence_id() {
        return flatulence_id;
    }

    public void setFlatulence_id(int flatulence_id) {
        this.flatulence_id = flatulence_id;
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
}
