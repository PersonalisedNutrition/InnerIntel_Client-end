package au.edu.anu.cecs.innerintel.Bean;

import java.io.Serializable;
/**
 * The entity class of disease
 * @author XinyueHu
 */
public class Disease implements Serializable {
     private int diseaseID; // once created never change.
     private int cid;
     private String StartTime;
     private String EndTime;
     private String type;
     private String medicine;

    public Disease(){}

    public Disease(int diseaseID, int cid) {
        this.diseaseID = diseaseID;
        this.cid = cid;
    }

    public Disease(int diseaseID, int cid, String startTime,
                   String endTime, String type, String medicine) {
        this.diseaseID = diseaseID;
        this.cid = cid;
        StartTime = startTime;
        EndTime = endTime;
        this.type = type;
        this.medicine = medicine;
    }

    public int getDiseaseID() {
        return diseaseID;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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
