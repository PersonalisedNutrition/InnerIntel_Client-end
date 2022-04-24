package au.edu.anu.cecs.innerintel.dao;

import java.io.InputStream;
import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.Log;
/**
 * @author Tianqi Tang
 */
public interface LogDao<T> {

    //add
    boolean inputLog(T log);

    //look up
    Set<Log> lookUpLog(String logContent,String searchType);

    //edit
    boolean editLog(T log);

    //delete
    boolean deleteLogById(int logId);
}
