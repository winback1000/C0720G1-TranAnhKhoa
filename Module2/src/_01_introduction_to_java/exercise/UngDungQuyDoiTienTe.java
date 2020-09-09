package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class UngDungQuyDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the amount of money in Vietnam Dong");
        float vnd = sc.nextFloat();
        float usd = vnd/23000;
        System.out.println(vnd + " VND = "+usd+" USD");
    }
}
