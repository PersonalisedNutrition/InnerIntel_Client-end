package au.edu.anu.cecs.innerintel.Bean;



public class SleepLog {
    private String sleep_id;
    private String lid; // can never edit, once create || this will relate with log by logId
    private String quality;
    private String start_time;
    private String duration;

    public SleepLog(String sleep_id, String lid, String quality, String start_time, String duration) {
        this.sleep_id = sleep_id;
        this.lid = lid;
        this.quality = quality;
        this.start_time = start_time;
        this.duration = duration;
    }

    public String getSleep_id() {
        return sleep_id;
    }

    public void setSleep_id(String sleep_id) {
        this.sleep_id = sleep_id;
    }

    public String getLid() {
        return lid;
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
