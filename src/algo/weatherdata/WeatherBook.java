package algo.weatherdata;

import java.security.Key;
import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

public class WeatherBook {
    private WeatherBook weatherBook;

    public WeatherBook(String date, String time, String degree, String approved) {
        this.date = date;
        this.time = time;
        this.degree = degree;
        this.approved = approved;
    }

    private String date;
    private String time;
    private String degree;
    private String approved;

    public WeatherBook(Object attributes) {

    }


    public static WeatherBook createBook(String[] metadata) {

        String date = metadata[0];
        String time = metadata[1];
        String degree = metadata[2];
        String approved = metadata[3];


        // create and return book of this metadata
        return new WeatherBook(date, time, degree,approved);
    }

    public String getDate() {
        return date;
    }




    @Override
    public String toString() {
        return date + "," + time + "," + degree + "," + approved;
    }
}
