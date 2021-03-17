package algo.weatherdata;

import java.awt.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class Demo {
    HashMap demoHashMap;

    {
        demoHashMap = new HashMap<Integer, LinkedList>();
    }

    public Demo(int index, String date, String time, String degrees, String approval) {
    }


    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getApproval() {
        return approval;
    }

    public void setApproval(String approval) {
        this.approval = approval;
    }

    private int key;

    private String date;
    private String time;
    private String temperature;
    private String approval;



    public Demo() {

    }


    /*
    @Override
    public String toString() {
        return "Demo [key=" + key + ", date=" + date
                + ", time=" + time
                + ", temparture=" + temperature + ", approval=" + approval + "]";
    }
    */

}