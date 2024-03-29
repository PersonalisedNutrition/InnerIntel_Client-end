package au.edu.anu.cecs.innerintel.Bean;

import java.sql.Date;
import java.sql.Time;



public class SleepLog {
    private int sleep_id;
    private int lid; // can never edit, once create || this will relate with log by logId
    private int quality;
    private Date date;
    private Time time;
    private int quantity;
    private String sleep_note;

    public SleepLog(int sleep_id, int lid, int quality, Date date, Time time, int quantity, String sleep_note) {
        this.sleep_id = sleep_id;
        this.lid = lid;
        this.quality = quality;
        this.date = date;
        this.time = time;
        this.quantity = quantity;
        this.sleep_note = sleep_note;
    }

    public int getSleep_id() {
        return sleep_id;
    }

    public void setSleep_id(int sleep_id) {
        this.sleep_id = sleep_id;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSleep_note() {
        return sleep_note;
    }

    public void setSleep_note(String sleep_note) {
        this.sleep_note = sleep_note;
    }
}
