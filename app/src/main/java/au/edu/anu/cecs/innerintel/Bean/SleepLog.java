package au.edu.anu.cecs.innerintel.Bean;



public class SleepLog {
    private int sleep_id;
    private final int lid; // can never edit, once create || this will relate with log by logId
    private String quality;
    private String start_time;
    private String duration;

    public SleepLog(int sleep_id, int lid, String quality, String start_time, String duration) {
        this.sleep_id = sleep_id;
        this.lid = lid;
        this.quality = quality;
        this.start_time = start_time;
        this.duration = duration;
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
