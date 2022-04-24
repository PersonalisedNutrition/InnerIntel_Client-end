package au.edu.anu.cecs.innerintel.dao;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.SymptomLog;

public interface SymptomLogDao {
    //add
    boolean inputSymptom(SymptomLog symptomLog);

    //look up
    Set<SymptomLog> lookUpSymptomLogByType(String symptomLogType);

    Set<SymptomLog> lookUpSymptomLogByDuration(String symptomLogDuration);

    SymptomLog lookUpSymptomLogById(int logId);

    //edit
    boolean editSymptomType(int logId, String symptomType);

    boolean editSymptomDuration(int logId, String symptomDuration);

    boolean editSymptomDescription(int logId, String symptomDescription);

    //delete
    boolean deleteSymptomLogById(int logId);
}
