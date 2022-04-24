package au.edu.anu.cecs.innerintel.dao;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.DoodyLog;
import au.edu.anu.cecs.innerintel.Bean.enumType.DoodyColor;
import au.edu.anu.cecs.innerintel.Bean.enumType.DoodyState;


public interface DoodyLogDao {
    //add
    boolean inputDoody(DoodyLog doodyLog);

    //look up
    Set<DoodyLog> lookUpDoodyLogByDoodyState(DoodyState doodyState);

    Set<DoodyLog> lookUpDoodyLogByDoodyColor(DoodyColor doodyColor);

    DoodyLog lookUpDoodyLogById(int logId);

    //edit
    boolean editDoodyDuration(int logId, String doodyDuration);

    boolean editDoodySmell(int logId, String doodySmell);

    boolean editDoodyVolume(int logId, String doodyVolume);

    boolean editDoodyFeeling(int logId, String doodyFeeling);

    boolean editDoodyState(int logId, DoodyState doodyState);

    boolean editDoodyColor(int logId, DoodyColor doodyColor);

    //delete
    boolean deleteDoodyLogById(int logId);
}
