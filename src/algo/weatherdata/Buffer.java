/*
package algo.weatherdata;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Buffer {
    List<List<String>> records = new ArrayList<>();
try (
    BufferedReader br = new BufferedReader(new FileReader("book.csv")))
    private static final String COMMA_DELIMITER =";";

    {
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(COMMA_DELIMITER);
            records.add(Arrays.asList(values));
        }
    }
}
*/