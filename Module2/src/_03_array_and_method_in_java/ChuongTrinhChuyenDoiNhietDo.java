package _03_array_and_method_in_java;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static float convertCtoF (float c) {
        return 9*c/5;
    }
    public static float convertFtoC (float f) {
        return 5*f/9;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float fahrenheit;
        float celsius;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please input the Fahrenheit");
                    fahrenheit = input.nextFloat();
                    System.out.println(fahrenheit +" F = " + convertFtoC(fahrenheit) +" C");
                    break;
                case 2:
                    System.out.println("Please input the Celsius");
                    celsius = input.nextFloat();
                    System.out.println(celsius +"C = " + convertCtoF(celsius) +" F");
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);
    }
    }

