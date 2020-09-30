package _16_exception_handling_debugging;

import java.util.InputMismatchException;

public class MakeTriangle {
    int a,b,c;
    public MakeTriangle(int a, int b, int c) throws IllegalTriangleException {
        if(a <= 0 || b <= 0 ||c <= 0) throw new ArithmeticException();
        if(a + b < c || a + c < b || b + c < a) throw new IllegalTriangleException();
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
