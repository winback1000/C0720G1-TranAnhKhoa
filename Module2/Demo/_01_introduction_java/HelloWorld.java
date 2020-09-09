package _01_introduction_java;

import java.util.Scanner;

public class HelloWorld {
    public static int number = 5; //camel case
    public static final double NUMBER_PI = 3.14;

    public static void main(String[] args) {
        //System.out.println("number: "+number);

//        if (NUMBER_PI == 3.15) {
//            System.out.println("OK");
//        } else if (NUMBER_PI == 3.16) {
//            System.out.println("OK1");
//        } else {
//            System.out.println("NG");
//        }

//        int a = 5;
//        int b = 5;
//        String c = new String("5"); //(heap - stack)
//        String d = new String("5");
//        System.out.println(c==d);

        //a = a + 1;
        //System.out.println("a: " + (a++)); // phep tinh duoc thuc hien truoc
//        System.out.println("a: " + (++a)); // tang a len truoc
//        System.out.println("a: " + a);

//        int number = 10;
//        switch (number){
//            case 1:
//                System.out.println("1");
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//            case 4:
//                System.out.println("4");
//            default:
//                System.out.println("0");
//        }

        //System.out.printf("toi co %d qua %s",8,"cam");
//        System.out.println("a");
//        System.out.print("b");

        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so a: ");
        int a = scanner.nextInt();
        System.out.printf("a: "+a);



    }
}
