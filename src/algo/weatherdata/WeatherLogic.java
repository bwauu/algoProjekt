package algo.weatherdata;


import java.util.ArrayList;

public class WeatherLogic {

    public double average(ArrayList n) {

        double[] da = new double[n.size()];

        for(int i = 0; i <da.length; i++) {
            da[i] = (double) n.get(i);
        }


        double sum = 0;

        for (double i : da) {
            sum += i;
        }



        return sum/n.size();
    }

    public int isMissing(ArrayList n) {

        int totalMeaseure = 24;

        return totalMeaseure - n.size();
    }


}