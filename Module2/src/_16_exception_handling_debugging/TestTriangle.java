package _16_exception_handling_debugging;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {

        inputTriangle();
    }

    private static void inputTriangle() {
        Scanner scanner = new Scanner(System.in);
        boolean needCheck = false;
        do {
            try {
                System.out.println("please input 1st edge");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.println("please input 2nd edge");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println("please input 3rd edge");
                int c = Integer.parseInt(scanner.nextLine());
                new MakeTriangle(a, b, c);
            } catch (ArithmeticException e) {
                System.err.println("please do not input negative value");
                needCheck = true;
            } catch (IllegalTriangleException e) {
                System.err.println("Can not make any triangle with these edges");
                needCheck = true;
            } catch (NumberFormatException e) {
                System.err.println("please input number only");
                needCheck = true;
            }
        } while (needCheck);
    }
}
