package _17_IO_file_text.sum_int_in_file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumIntegerInFile {
    public static int sum(String filePath) {
        int result = 0;
        try {

            BufferedReader brd = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = brd.readLine()) != null) {
                result += Integer.parseInt(line);
            }
            brd.close();
        } catch (NumberFormatException e) {
            System.out.println("File content is not valid");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("File not found");
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum("src/_17_IO_file_text/sum_int_in_file/numbers.txt"));
    }
}
