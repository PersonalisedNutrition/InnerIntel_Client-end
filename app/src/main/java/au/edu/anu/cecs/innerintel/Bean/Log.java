package au.edu.anu.cecs.innerintel.Bean;

/**
 * two constructors : difference(contains logtime and logauthority or without them)
 * logId cannot be edit once create
 * @author Tianqi Tang
 */
public class Log {
    private String lid; // can never edit, once create
    private String table_id;
    private String type;
    private String cid;
    private String time;
    private String feedback;
//    private int logAuthority;

//    public Log(int logId, int userID, LogType logType, String logTime, int logAuthority) {
//        this.logId = logId;
//        this.cid = userID;
//        this.logType = logType;
//        this.logTime = logTime;
//        this.logAuthority = logAuthority;
//    }




    //    public Log(int logId, int userID, LogType logType) {
//        this.logId = logId;
//        this.userID = userID;
//        this.logType = logType;
//        this.logTime = null;
//        this.logAuthority = 1;
//    }

    public Log(String lid, String table_id, String type, String cid, String time, String feedback) {
        this.lid = lid;
        this.table_id = table_id;
        this.type = type;
        this.cid = cid;
        this.time = time;
        this.feedback = feedback;
    }

    public String getLid() {
        return lid;
    }

    public String getTable_id() {
        return table_id;
    }

    public void setTable_id(int table_id) {
        this.table_id = String.valueOf(table_id);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

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
