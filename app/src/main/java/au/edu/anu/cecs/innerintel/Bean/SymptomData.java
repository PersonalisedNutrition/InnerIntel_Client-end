package au.edu.anu.cecs.innerintel.Bean;

import au.edu.anu.cecs.innerintel.Bean.enumType.SymptomType;

/**
 * The entity class of symptom data.
 * @author Shiyun Zhu
 */
public class SymptomData {
    SymptomType symptomType;
    String symptomName;
    String symptomInfo;
    int symptomMeasurement;

    public SymptomData(SymptomType symptomType, String symptomName, String symptomInfo, int symptomMeasurement) {
        this.symptomType = symptomType;
        this.symptomName = symptomName;
        this.symptomInfo = symptomInfo;
        this.symptomMeasurement = symptomMeasurement;
    }

    public SymptomType getSymptomType() {
        return symptomType;
    }

    public void setSymptomType(SymptomType symptomType) {
        this.symptomType = symptomType;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }

    public String getSymptomInfo() {
        return symptomInfo;
    }

    public void setSymptomInfo(String symptomInfo) {
        this.symptomInfo = symptomInfo;
    }

    public int getSymptomMeasurement() {
        return symptomMeasurement;
    }

    public void setSymptomMeasurement(int symptomMeasurement) {
        this.symptomMeasurement = symptomMeasurement;
    }

    //TODO: need be filled
    public void symptomCounter(){};
    public void symptomPresent(){};
}
