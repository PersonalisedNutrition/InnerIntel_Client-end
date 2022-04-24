package au.edu.anu.cecs.innerintel.Bean;

import au.edu.anu.cecs.innerintel.Bean.enumType.DoodyColor;
import au.edu.anu.cecs.innerintel.Bean.enumType.DoodyState;

/**
 * when create a doody log, also should create a log
 */
public class DoodyLog {
    private final int logId; // can never edit, once create || this will relate with log by logId
    private DoodyState doodyState;
    // add
    private DoodyColor doodyColor;
    private String doodyDuration;
    private String doodySmell;
    private String doodyVolume;
    private String doodyFeeling;

    public DoodyLog(int logId, DoodyState doodyState, DoodyColor doodyColor, String doodyDuration, String doodySmell, String doodyVolume, String doodyFeeling) {
        this.logId = logId;
        this.doodyState = doodyState;
        this.doodyColor = doodyColor;
        this.doodyDuration = doodyDuration;
        this.doodySmell = doodySmell;
        this.doodyVolume = doodyVolume;
        this.doodyFeeling = doodyFeeling;
    }

    public DoodyLog(int logId, DoodyState doodyState, DoodyColor doodyColor) {
        this.logId = logId;
        this.doodyState = doodyState;
        this.doodyColor = doodyColor;
        this.doodyDuration = null;
        this.doodySmell = null;
        this.doodyVolume = null;
        this.doodyFeeling = null;
    }

    public void setDoodyState(DoodyState doodyState) {
        this.doodyState = doodyState;
    }

    public void setDoodyColor(DoodyColor doodyColor) {
        this.doodyColor = doodyColor;
    }

    public void setDoodyDuration(String doodyDuration) {
        this.doodyDuration = doodyDuration;
    }

    public void setDoodySmell(String doodySmell) {
        this.doodySmell = doodySmell;
    }

    public void setDoodyVolume(String doodyVolume) {
        this.doodyVolume = doodyVolume;
    }

    public void setDoodyFeeling(String doodyFeeling) {
        this.doodyFeeling = doodyFeeling;
    }

    public int getLogId() {
        return logId;
    }

    public DoodyState getDoodyState() {
        return doodyState;
    }

    public DoodyColor getDoodyColor() {
        return doodyColor;
    }

    public String getDoodyDuration() {
        return doodyDuration;
    }

    public String getDoodySmell() {
        return doodySmell;
    }

    public String getDoodyVolume() {
        return doodyVolume;
    }

    public String getDoodyFeeling() {
        return doodyFeeling;
    }
}
