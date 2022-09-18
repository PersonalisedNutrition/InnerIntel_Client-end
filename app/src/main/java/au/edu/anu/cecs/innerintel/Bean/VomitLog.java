package au.edu.anu.cecs.innerintel.Bean;

import java.sql.Date;
import java.sql.Time;

/**
 * The vomit log is an optional log for user to record.
 * @author Xinyue Hu
 */
public class VomitLog {
    private int vomit_id;
    private int lid;
    private Date date;
    private Time time;
    private String frequency;


    public VomitLog(int vomit_id, int lid, Date date, Time time, String frequency) {
        this.vomit_id = vomit_id;
        this.lid = lid;
        this.date = date;
        this.time = time;
        this.frequency = frequency;
    }

    public int getVomit_id() {
        return vomit_id;
    }

    public void setVomit_id(int vomit_id) {
        this.vomit_id = vomit_id;
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
