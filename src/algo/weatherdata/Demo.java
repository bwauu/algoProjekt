package algo.weatherdata;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

class Demo {
    Map<Integer,Demo> map=new HashMap<Integer, Demo>();


    private int key;

    private LocalDate date;
    private LocalTime time;
    private int temperature;
    private Boolean approval;



    public Demo() {

    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Boolean getApproval() {
        return approval;
    }

    public void setApproval(Boolean approval) {
        this.approval = approval;
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