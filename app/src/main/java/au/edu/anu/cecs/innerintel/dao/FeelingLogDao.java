package au.edu.anu.cecs.innerintel.dao;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.FeelingLog;
import au.edu.anu.cecs.innerintel.Bean.enumType.FeelingType;


public interface FeelingLogDao {
    //add
    boolean inputFeeling(FeelingLog feelingLog);

    //look up
    Set<FeelingLog> lookUpFeelingLogByType(FeelingType feelingType);

    FeelingLog lookUpFeelingLogById(int logId);

    //edit
    boolean editFeelingType(int logId, FeelingType feelingType);

    boolean editFeelingDescription(int logId, String feelingDescription);

    //delete
    boolean deleteFeelingLogById(int logId);
}
