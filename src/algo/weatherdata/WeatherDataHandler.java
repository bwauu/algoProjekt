package algo.weatherdata;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Retrieves temperature data from a weather station file.
 */
public class WeatherDataHandler {
    private static final String COMMA_DELIMITER = ";";

    public List<WeatherBook> getRecords() {
        return records;
    }

    List<WeatherBook> records;

    {
        records = new ArrayList<>();
    }

    NavigableMap<LocalDate, List> /*LinkedList<List<String>>> */dataHodler = new TreeMap<>();
    Map x = new TreeMap();

    public static WeatherBook createBook(String[] metadata) {
        String date = metadata[0];
        String time = metadata[1];
        String degree = metadata[2];
        String approved = metadata[3];

        // create and return book of this metadata
        return new WeatherBook(date, time, degree, approved);
    }

    /**
     * Load weather data from file.
     *
     * @param filePath path to file with weather data
     * @return
     * @throws IOException if there is a problem while reading the file
     */
    public List<WeatherBook> loadData(String filePath) throws IOException {

        String fileName = "smhi-opendata.csv";
        String myPath = "C:\\Users\\wiapp\\IdeaProjects\\algoProjekt\\src\\smhi-opendata.csv";
        Path pathToFile = Paths.get(fileName);
        //TODO: Structure data and put it in appropriate data structure

        try (BufferedReader br = Files.newBufferedReader(Path.of(myPath),
                StandardCharsets.US_ASCII)) {
            String line;
            int index = 0;
            while ((line = br.readLine()) != null) {


                String[] attributes = line.split(";");


                WeatherBook weatherBook =   WeatherBook.createBook(attributes);
                //HELP US
                records.add(weatherBook);
                System.out.println(records.get(index));

                index++;
                line = br.readLine();

                // adding book into ArrayList


            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return records;
    }


    /**
     * Search for average temperature for all dates between the two dates (inclusive).
     * Result is sorted by date (ascending). When searching from 2000-01-01 to 2000-01-03
     * the result should be:
     * 2000-01-01 average temperature: 0.42 degrees Celsius
     * 2000-01-02 average temperature: 2.26 degrees Celsius
     * 2000-01-03 average temperature: 2.78 degrees Celsius
     *
     * @param dateFrom start date (YYYY-MM-DD) inclusive
     * @param dateTo   end date (YYYY-MM-DD) inclusive
     * @return average temperature for each date, sorted by date
     */
    public List<String> averageTemperatures(LocalDate dateFrom, LocalDate dateTo) {
        List<LocalDate> result = new LinkedList<>();
        String dateFromStringed = dateFrom.toString();


        ListIterator<WeatherBook> iteratior = records.listIterator();
        while (iteratior.hasNext()) {
            if (iteratior.next().toString().contains(dateFrom.toString())) {
                System.out.println(iteratior.next());
            }

        }

        return null;
    }


    /**
     * Search for missing values between the two dates (inclusive) assuming there
     * should be 24 measurement values for each day (once every hour). Result is
     * sorted by number of missing values (descending). When searching from
     * 2000-01-01 to 2000-01-03 the result should be:
     * 2000-01-02 missing 1 values
     * 2000-01-03 missing 1 values
     * 2000-01-01 missing 0 values
     *
     * @param dateFrom start date (YYYY-MM-DD) inclusive
     * @param dateTo   end date (YYYY-MM-DD) inclusive
     * @return dates with missing values together with number of missing values for each date, sorted by number of missing values (descending)
     */
    public List<String> missingValues(LocalDate dateFrom, LocalDate dateTo) {
        //TODO: Implements method
        return null;
    }

    /**
     * Search for percentage of approved values between the two dates (inclusive).
     * When searching from 2000-01-01 to 2000-01-03 the result should be:
     * Approved values between 2000-01-01 and 2000-01-03: 32.86 %
     *
     * @param dateFrom start date (YYYY-MM-DD) inclusive
     * @param dateTo   end date (YYYY-MM-DD) inclusive
     * @return period and percentage of approved values for the period
     */
    public List<String> approvedValues(LocalDate dateFrom, LocalDate dateTo) {
        //TODO: Implements method
        return null;
    }
}