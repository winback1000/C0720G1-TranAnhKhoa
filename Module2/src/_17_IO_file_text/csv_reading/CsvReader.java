package _17_IO_file_text.csv_reading;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CsvReader {
    public static final String filePath = "src/_17_IO_file_text/csv_reading/Nations.csv";
    public static ArrayList<String[]> readCsvFile (String filePath) {
        ArrayList<String[]> nationList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bfr = new BufferedReader(fileReader);

            String[] list;
            String line;
            while ((line = bfr.readLine()) != null) {
                list = line.split(",");
                nationList.add(list);
            }
            bfr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nationList;
    }
    public static void main(String[] args) {
        for (String[] nation: readCsvFile(filePath)) {
            System.out.println(nation[5]);
        }
    }
}
