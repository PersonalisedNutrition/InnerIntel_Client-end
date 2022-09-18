package au.edu.anu.cecs.innerintel.Bean;

import java.sql.Date;
import java.sql.Time;

/**
 * two constructors : difference(contains logtime and logauthority or without them)
 * logId cannot be edit once create
 * @author Tianqi Tang,Xinyue Hu,Hengtong Wu
 */
public class Log {
    private int lid; // can never edit, once create
    private int table_id;
    private String type;
    private int cid;

    private Date date;
    private Time time;

    private boolean flag;
    private String feedback;

    public Log(int lid, int table_id, String type, int cid, Date date, Time time, boolean flag, String feedback) {
        this.lid = lid;
        this.table_id = table_id;
        this.type = type;
        this.cid = cid;
        this.date = date;
        this.time = time;
        this.flag = flag;
        this.feedback = feedback;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getTable_id() {
        return table_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = table_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
