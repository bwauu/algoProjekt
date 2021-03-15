package algo.weatherdata;

import java.util.*;

public class Dictionary {

    /* instance variable declaration */
    private Map<Integer, List<String>> dictionary;

    public void setYearAndDate(String yearAndDate) {
        this.yearAndDate = yearAndDate;
    }

    public String getYearAndDate() {
        return this.yearAndDate;
    }

    private String yearAndDate;
    private String time;
    private int temperature;
    private String approval;


    public Dictionary() {
        this.dictionary = new LinkedHashMap<>();
        int index = 0;

        for (Map.Entry<Integer, List<String>> entry : dictionary.entrySet()) {
            dictionary.put(index, Collections.singletonList(yearAndDate));
            System.out.println(dictionary.get(index));
            // Do things with the list
            index++;
        }



    }

    /**
     *
     * @return entrySet() method on this.dictionary
     */
    public Set<Map.Entry<Integer, List<String>>> words() {
        return this.dictionary.entrySet();
    }

    /**
     *
     * @return size of dictionary map as an int.
     */
    public int getSize() {
        return this.dictionary.size();
    }
}