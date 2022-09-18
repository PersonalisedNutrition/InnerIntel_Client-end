package au.edu.anu.cecs.innerintel.Bean;


import java.sql.Date;
import java.sql.Time;

/**
 * The reflux log is an optional log for user to record.
 * @author Xinyue Hu
 */
public class RefluxLog {
    private int reflux_id;
    private int lid;
    private Date date;
    private Time time;
    private String frequency;

    public RefluxLog(int reflux_id, int lid, Date date, Time time, String frequency) {
        this.reflux_id = reflux_id;
        this.lid = lid;
        this.date = date;
        this.time = time;
        this.frequency = frequency;
    }

    public int getReflux_id() {
        return reflux_id;
    }

    public void setReflux_id(int reflux_id) {
        this.reflux_id = reflux_id;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
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

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }
}
