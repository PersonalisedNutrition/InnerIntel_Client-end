package au.edu.anu.cecs.innerintel.Bean;

import au.edu.anu.cecs.innerintel.Bean.enumType.FeelingType;

/**
 * when create a Feeling log, also should create a log
 * @author Tianqi Tang
 */
public class FeelingLog {
    private final int logId; // can never edit, once create || this will relate with log by logId
    private FeelingType feelingType;
    private String feelingDescription;

    public FeelingLog(int logId, FeelingType feelingType, String feelingDescription) {
        this.logId = logId;
        this.feelingType = feelingType;
        this.feelingDescription = feelingDescription;
    }

    public FeelingLog(int logId, FeelingType feelingType) {
        this.logId = logId;
        this.feelingType = feelingType;
        this.feelingDescription = null;
    }

    public void setFeelingType(FeelingType feelingType) {
        this.feelingType = feelingType;
    }

    public void setFeelingDescription(String feelingDescription) {
        this.feelingDescription = feelingDescription;
    }

    public int getLogId() {
        return logId;
    }

    public FeelingType getFeelingType() {
        return feelingType;
    }

    public String getFeelingDescription() {
        return feelingDescription;
    }
}
