package au.edu.anu.cecs.innerintel.Bean;

import au.edu.anu.cecs.innerintel.Bean.enumType.LogType;

/**
 * two constructors : difference(contains logtime and logauthority or without them)
 * logId cannot be edit once create
 * @author Tianqi Tang
 */
public class Log {
    private final int logId; // can never edit, once create
    private int tableId;
    private int cid;
    private LogType logType;
    private String logTime;
    private String feedback;
//    private int logAuthority;

//    public Log(int logId, int userID, LogType logType, String logTime, int logAuthority) {
//        this.logId = logId;
//        this.cid = userID;
//        this.logType = logType;
//        this.logTime = logTime;
//        this.logAuthority = logAuthority;
//    }


    public Log(int logId, int tableId, int cid, LogType logType, String logTime, String feedback) {
        this.logId = logId;
        this.tableId = tableId;
        this.cid = cid;
        this.logType = logType;
        this.logTime = logTime;
        this.feedback = feedback;
    }

    public int getLogId() {
        return logId;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public LogType getLogType() {
        return logType;
    }

    public void setLogType(LogType logType) {
        this.logType = logType;
    }

    public String getLogTime() {
        return logTime;
    }

    public void setLogTime(String logTime) {
        this.logTime = logTime;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }


    //    public Log(int logId, int userID, LogType logType) {
//        this.logId = logId;
//        this.userID = userID;
//        this.logType = logType;
//        this.logTime = null;
//        this.logAuthority = 1;
//    }

//    public void setLogType(LogType logType) {
//        this.logType = logType;
//    }
//
//    public void setLogTime(String logTime) {
//        this.logTime = logTime;
//    }
//
//    public void setUserID(int userID) {
//        this.userID = userID;
//    }
//
//    public int getUserID() {
//        return userID;
//    }
//
//    public void setLogAuthority(int logAuthority) {
//        this.logAuthority = logAuthority;
//    }
//
//    public int getLogId() {
//        return logId;
//    }
//
//    public LogType getLogType() {
//        return logType;
//    }
//
//    public String getLogTime() {
//        return logTime;
//    }
//
//    public int getLogAuthority() {
//        return logAuthority;
//    }
}
