package _16_exception_handling_debugging;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    int a,b,c;

    public IllegalTriangleException(int a, int b, int c) throws Exception {

        if(a <= 0 || b <= 0 ||c <= 0) throw new InputMismatchException();
        if(a + b < c || a + c < b || b + c < a) throw new ArithmeticException();

        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "Triangle {" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
