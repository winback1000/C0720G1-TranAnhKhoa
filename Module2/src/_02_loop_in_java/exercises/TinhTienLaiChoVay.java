package _02_loop_in_java.exercises;

import java.util.Scanner;

public class TinhTienLaiChoVay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the investment amount");
        float money = sc.nextFloat();
        System.out.println("Please input the percent profit per year");
        float profit = sc.nextFloat();
        System.out.println("Please input the number of months");
        float month = sc.nextFloat();
        float total_profit = money*profit/1200*month;
        System.out.println("Total profile = "+total_profit);
    }
}
