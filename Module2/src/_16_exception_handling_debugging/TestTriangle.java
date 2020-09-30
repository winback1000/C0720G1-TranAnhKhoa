package _16_exception_handling_debugging;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {

        inputTriangle();
    }

    private static void inputTriangle() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("please input 1st edge");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.println("please input 2nd edge");
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("please input 3rd edge");
            int c = Integer.parseInt(scanner.nextLine());
            IllegalTriangleException triangle = new IllegalTriangleException(a,  b, c);

        } catch (InputMismatchException e) {
            System.out.println("please do not input negative value");
            inputTriangle();
        } catch (ArithmeticException e) {
            System.out.println("Can not make any triangle with these edges");
            inputTriangle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
