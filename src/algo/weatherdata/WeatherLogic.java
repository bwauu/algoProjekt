package algo.weatherdata;

import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WeatherLogic {

public Map<LocalDate, LinkedList> mapcreater() throws IOException {

    String fileName = "smhi-opendata.csv";

        return null;
    }




    public static int avarage (int[] n) {

        int sum = 0;

        for (int i : n) {
            sum += i;
        }

        return sum/n.length;
    }



}
