package algo.weatherdata;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Retrieves temperature data from a weather station file.
 */
public class WeatherDataHandler {
    Demo demo = new Demo();
	Map dataHodler = new HashMap<LocalDate, LinkedList<List<String>>>();
    /**
     * Load weather data from file.
     *
     * @param filePath path to file with weather data
     * @return
     * @throws IOException if there is a problem while reading the file
     */
    public void loadData(String filePath) throws IOException {

		String myPath = "C:\\Users\\wiapp\\IdeaProjects\\algoProjekt\\src\\" + filePath;
		List<String> fileData = Files.readAllLines(Paths.get(myPath));
		//TODO: Structure data and put it in appropriate data structure
		Scanner scanner = new Scanner(new File(myPath));

		int counter = 0;
		while (scanner.hasNext()) {

			for (String wholeLine : fileData) {
				String line = scanner.nextLine();
				String[] array = line.split("\\;", 4);
				Scanner lineScanner = new Scanner(line);
				lineScanner.useDelimiter(";");

				String time = array[1];
				String degrees = array[2];
				String approval = array[3];
				String date = array[0].toString();
				LocalDate localDate = LocalDate.parse(date);
				time = array[0];

				dataHodler.put(localDate,wholeLine);

				// Printar ut all datum
				System.out.println(dataHodler.get(localDate));
			}



		}

		scanner.close();
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
        //TODO: Implements method
		int index = 0;
		LocalDate startDate = LocalDate.now();
		dateTo = startDate.plusMonths(2);

		List<LocalDate> listOfDates = startDate.datesUntil(dateTo).collect(Collectors.toList());

		System.out.println(listOfDates.toString());
		if(dataHodler.equals(dateFrom)){


			return Collections.singletonList(dataHodler.get(dateFrom).toString());
		}
		else return Collections.singletonList(dataHodler.get(dateTo).toString());
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