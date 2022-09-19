package au.edu.anu.cecs.innerintel.Bean;

import java.sql.Date;
import java.sql.Time;

public class FaecesLog {
    private int faeces_id;
    private int lid;
    private int faecesType;
    private Date date;
    private Time time;

    public FaecesLog(int faeces_id, int lid, int faecesType, Date date, Time time) {
        this.faeces_id = faeces_id;
        this.lid = lid;
        this.faecesType = faecesType;
        this.date = date;
        this.time = time;
    }

    public int getFaeces_id() {
        return faeces_id;
    }

    public void setFaeces_id(int faeces_id) {
        this.faeces_id = faeces_id;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getFaecesType() {
        return faecesType;
    }

    public void setFaecesType(int faecesType) {
        this.faecesType = faecesType;
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
