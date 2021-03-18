package algo.weatherdata;

import java.time.LocalDate;

public class WeatherBook {

    private LocalDate date;
    private String time;
    private double degree;
    private String approved;

    public WeatherBook(LocalDate date, String time, double degree, String approved) {
        this.date = date;
        this.time = time;
        this.degree = degree;
        this.approved = approved;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getDegree() {
        return degree;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }

    public String isApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    @Override
    public String toString() {
        return date + "," + time + "," + degree + "," + approved;
    }
}
