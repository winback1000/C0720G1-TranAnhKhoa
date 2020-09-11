package _02_loop_in_java.exercises;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean menu = true;
//        loop_menu:
        while (menu) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i<4; i++) {
                        for (int j = 0; j <7 ;j++) {
                            System.out.print("* \t");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i<5; i++) {
                        for (int j = 0; j <4-i ;j++) {
                            System.out.print("\t");
                        }
                        for (int k = 0; k<=i;k++) {
                            System.out.print("*\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i<6; i++) {
                        for (int j = 0; j <=4-i ;j++) {
                            System.out.print("\t");
                        }
                        for (int k = 0; k<=2*i;k++) {
                            System.out.print("*\t");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    menu = false;
                    break;
                default:
                    System.out.println("invalid number!");
            }
        }
    }
}
