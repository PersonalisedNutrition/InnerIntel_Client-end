package au.edu.anu.cecs.innerintel.dao.dataImpl;

import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.DoodyLog;
import au.edu.anu.cecs.innerintel.Bean.enumType.DoodyColor;
import au.edu.anu.cecs.innerintel.Bean.enumType.DoodyState;
import au.edu.anu.cecs.innerintel.dao.DoodyLogDao;


/**
 * four main method: add / lookup(search) / update(edit) / delete
 */
public class DoodyLogDaoImpl implements DoodyLogDao {

    //Implement singleton design pattern
    private static DoodyLogDaoImpl doodyLogDao = null;

    public static DoodyLogDaoImpl getInstance() {
        if (doodyLogDao == null) {
            doodyLogDao = new DoodyLogDaoImpl();
        }
        return doodyLogDao;
    }

    @Override
    public boolean inputDoody(DoodyLog doodyLog) {
        return false;
    }

    @Override
    public Set<DoodyLog> lookUpDoodyLogByDoodyState(DoodyState doodyState) {
        return null;
    }

    @Override
    public Set<DoodyLog> lookUpDoodyLogByDoodyColor(DoodyColor doodyColor) {
        return null;
    }

    @Override
    public DoodyLog lookUpDoodyLogById(int logId) {
        return null;
    }

    @Override
    public boolean editDoodyDuration(int logId, String doodyDuration) {
        return false;
    }

    @Override
    public boolean editDoodySmell(int logId, String doodySmell) {
        return false;
    }

    @Override
    public boolean editDoodyVolume(int logId, String doodyVolume) {
        return false;
    }

    @Override
    public boolean editDoodyFeeling(int logId, String doodyFeeling) {
        return false;
    }

    @Override
    public boolean editDoodyState(int logId, DoodyState doodyState) {
        return false;
    }

    @Override
    public boolean editDoodyColor(int logId, DoodyColor doodyColor) {
        return false;
    }

    @Override
    public boolean deleteDoodyLogById(int logId) {
        return false;
    }
}
