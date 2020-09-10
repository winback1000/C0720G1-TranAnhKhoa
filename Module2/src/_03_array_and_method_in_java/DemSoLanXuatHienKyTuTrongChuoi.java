package _03_array_and_method_in_java;

import java.util.Scanner;

public class DemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the string");
        String str = sc.nextLine();
        System.out.println("input the character to check");
        String character = sc.nextLine();
        byte count = 0;
        for (byte i = 0; i<str.length(); i++) {
            if(str.charAt(i) == character.charAt(0)) {
                count++;
            }
        }
        System.out.printf("the character %s appears %d in the string %s", character.charAt(0), count, str);
    }
}
