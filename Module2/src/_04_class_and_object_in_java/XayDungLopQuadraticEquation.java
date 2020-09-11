package _04_class_and_object_in_java;

public class XayDungLopQuadraticEquation {
    static class QuadraticEquation {
        double a;
        double b;
        double c;
        QuadraticEquation(double m, double n, double p) {
            a = m;
            b = n;
            c = p;
        }
        double getDiscriminant() {
            return  Math.pow(b,2) - (4 * a * c);
        }
        double getRoot1() {
            return (-b+Math.sqrt(getDiscriminant()))/(2*a);
        }
        double getRoot2() {
            return (-b-Math.sqrt(getDiscriminant()))/(2*a);
        }
        String result() {
            if (a == 0) {
                return "The equation has one root: "+ ((-c)/b);
            } else if (getDiscriminant() <0) {
                return "The equation has no root";
            } else if(getDiscriminant() == 0) {
                return "The equation has one root: " + getRoot1();
            } else {
                return "The equation has two root: \n" +getRoot1()+"\n"+getRoot2();
            }
        }
    }
    public static void main(String[] args) {
        QuadraticEquation test = new QuadraticEquation(1,3,1);
        System.out.println(test.result());
    }
}
