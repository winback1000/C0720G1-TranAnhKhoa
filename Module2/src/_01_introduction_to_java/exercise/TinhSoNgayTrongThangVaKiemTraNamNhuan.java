package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class TinhSoNgayTrongThangVaKiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input the year");
        int year = scanner.nextInt();
        System.out.println("please input the month");
        int month = scanner.nextInt();
        switch (month) {
            case 2:
                if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                    System.out.println("This month has 29 days");
                } else {
                    System.out.println("this month has 28 days");
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
            default:
                System.out.print("invalid month");
        }
    }
}
