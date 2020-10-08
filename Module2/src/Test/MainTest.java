package Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainTest {


    public static void main(String[] args) {
        String input = "0933123456";

        String number = input.replaceFirst("(\\d{4})(\\d{3})(\\d+)", "$1-$2-$3");

        System.out.println(number);
    }
}
