package au.edu.anu.cecs.innerintel.Bean;

import java.io.Serializable;
/**
 * The entity class of disease
 * @author XinyueHu
 */
public class Disease implements Serializable {
     private final int did; // once created never change.
     private int uid;
     private String StartTime;
     private String EndTime;
     private String type;
     private String medicine;

    public Disease(int did, int uid) {
        this.did = did;
        this.uid = uid;
    }

    public Disease(int did, int uid, String startTime,
                   String endTime, String type, String medicine) {
        this.did = did;
        this.uid = uid;
        StartTime = startTime;
        EndTime = endTime;
        this.type = type;
        this.medicine = medicine;
    }

    public int getDid() {
        return did;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

}
