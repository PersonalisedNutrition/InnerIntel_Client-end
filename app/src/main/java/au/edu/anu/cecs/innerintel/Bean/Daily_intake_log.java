package au.edu.anu.cecs.innerintel.Bean;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import au.edu.anu.cecs.innerintel.Bean.enumType.Location;
import au.edu.anu.cecs.innerintel.Bean.enumType.MealType;

/**
 * when create a daily intake log, also should create a log
 *
 * @author Tianqi Tang,Xinyue Hu
 */
public class Daily_intake_log {
    private int lid; // can never edit, once create || this will relate with log by logId
    private Date date;
    private Time time;
    private MealFood foodItems;
    private Location location;
    private String foodPhotos;

    public Daily_intake_log(int lid, Date date, Time time, MealFood foodItems, Location location, String foodPhotos) {
        this.lid = lid;
        this.date = date;
        this.time = time;
        this.foodItems = foodItems;
        this.location = location;
        this.foodPhotos = foodPhotos;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public MealFood getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(MealFood foodItems) {
        this.foodItems = foodItems;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getFoodPhotos() {
        return foodPhotos;
    }

    public void setFoodPhotos(String foodPhotos) {
        this.foodPhotos = foodPhotos;
    }
}
