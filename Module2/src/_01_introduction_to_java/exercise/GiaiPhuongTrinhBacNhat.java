package _01_introduction_to_java.exercise;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x + b = c', please enter constants");
        Scanner sc = new Scanner(System.in);
        System.out.print("a :");
        double a = sc.nextDouble();
        System.out.println("b : ");
        double b = sc.nextDouble();
        System.out.println("c : ");
        double c = sc.nextDouble();
        if (a != 0) {
            double result = (c-b)/a;
            System.out.printf("The result is : %f", result);
        } else {
            if (c == b) {
                System.out.println("The result is all x!");
            } else {
                System.out.println("No result");
            }
        }
    }
}
