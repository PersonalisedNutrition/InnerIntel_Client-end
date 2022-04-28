package au.edu.anu.cecs.innerintel.Bean;

import au.edu.anu.cecs.innerintel.Bean.enumType.DoodyColor;
import au.edu.anu.cecs.innerintel.Bean.enumType.DoodyState;

/**
 * The entity class of doody data.
 * @author Shiyun Zhu
 */
public class Doody {
    DoodyState doodyState;
    DoodyColor doodyColor;

    String doodyInfo;

    public Doody(DoodyState doodyState, DoodyColor doodyColor, String doodyInfo) {
        this.doodyState = doodyState;
        this.doodyColor = doodyColor;
        this.doodyInfo = doodyInfo;
    }

    public Doody(DoodyState doodyState, DoodyColor doodyColor) {
        this.doodyState = doodyState;
        this.doodyColor = doodyColor;
    }

    public DoodyState getDoodyState() {
        return doodyState;
    }

    public DoodyColor getDoodyColor() {
        return doodyColor;
    }

    public String getDoodyInfo() {
        return doodyInfo;
    }

    public void setDoodyState(DoodyState doodyState) {
        this.doodyState = doodyState;
    }

    public void setDoodyColor(DoodyColor doodyColor) {
        this.doodyColor = doodyColor;
    }

    public void setDoodyInfo(String doodyInfo) {
        this.doodyInfo = doodyInfo;
    }
}
