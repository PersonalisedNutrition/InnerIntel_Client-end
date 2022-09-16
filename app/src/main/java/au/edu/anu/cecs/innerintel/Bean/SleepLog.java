package au.edu.anu.cecs.innerintel.Bean;



public class SleepLog {
    private final int logId; // can never edit, once create || this will relate with log by logId
    private int sleepId;
    private String quality;
    private String start_time;
    private String duration;

    public SleepLog(int logId, int sleepId, String quality, String start_time, String duration) {
        this.logId = logId;
        this.sleepId = sleepId;
        this.quality = quality;
        this.start_time = start_time;
        this.duration = duration;
    }


    public int getLogId() {
        return logId;
    }

    public int getSleepId() {
        return sleepId;
    }

    public void setSleepId(int sleepId) {
        this.sleepId = sleepId;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
