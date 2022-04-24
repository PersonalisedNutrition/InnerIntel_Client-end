package au.edu.anu.cecs.innerintel.dao;

import java.io.InputStream;
import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.Log;

public interface LogDao {

    //add
    boolean inputLog(Log log);

    //look up
    Set<Log> lookUpLogByType(String logType);

    Set<Log> lookUpLogByTime(String logTime);

    Set<Log> lookUpLogByAuthority(int logAuthority);

    Log lookUpLogById(int logId);

    //edit
    boolean editLogType(int logId, String logType);

    boolean editLogTime(int logId, String logTime);

    boolean editLogAuthority(int logId, int logAuthority);

    //delete
    boolean deleteLogById(int logId);
}
