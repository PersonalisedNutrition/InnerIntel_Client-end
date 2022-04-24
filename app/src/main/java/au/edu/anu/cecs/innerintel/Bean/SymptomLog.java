package au.edu.anu.cecs.innerintel.Bean;

import au.edu.anu.cecs.innerintel.Bean.enumType.SymptomType;

/**
 * when create a Symptom log, also should create a log
 *
 * @author Tianqi Tang
 */
public class SymptomLog {
    private final int logId; // can never edit, once create || this will relate with log by logId
    private SymptomType symptomType;
    private String symptomDuration;
    private String symptomDescription;

    public SymptomLog(int logId, SymptomType symptomType, String symptomDuration, String symptomDescription) {
        this.logId = logId;
        this.symptomType = symptomType;
        this.symptomDuration = symptomDuration;
        this.symptomDescription = symptomDescription;
    }

    public SymptomLog(int logId, SymptomType symptomType) {
        this.logId = logId;
        this.symptomType = symptomType;
        this.symptomDuration = null;
        this.symptomDescription = null;
    }

    public void setSymptomType(SymptomType symptomType) {
        this.symptomType = symptomType;
    }

    public void setSymptomDuration(String symptomDuration) {
        this.symptomDuration = symptomDuration;
    }

    public void setSymptomDescription(String symptomDescription) {
        this.symptomDescription = symptomDescription;
    }

    public int getLogId() {
        return logId;
    }

    public SymptomType getSymptomType() {
        return symptomType;
    }

    public String getSymptomDuration() {
        return symptomDuration;
    }

    public String getSymptomDescription() {
        return symptomDescription;
    }
}
