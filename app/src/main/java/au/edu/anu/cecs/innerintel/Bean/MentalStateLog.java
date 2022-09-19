package au.edu.anu.cecs.innerintel.Bean;

import java.sql.Date;
import java.sql.Time;

public class MentalStateLog {
    private int mental_state_id;
    private int lid; // can never edit, once create || this will relate with log by logId
    private int quality;
    private Date date;
    private Time time;

    public MentalStateLog(int mental_state_id, int lid, int quality, Date date, Time time) {
        this.mental_state_id = mental_state_id;
        this.lid = lid;
        this.quality = quality;
        this.date = date;
        this.time = time;
    }

    public int getMental_state_id() {
        return mental_state_id;
    }

    public void setMental_state_id(int mental_state_id) {
        this.mental_state_id = mental_state_id;
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
}
