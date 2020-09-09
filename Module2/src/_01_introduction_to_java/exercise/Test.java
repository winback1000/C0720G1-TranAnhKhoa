package _01_introduction_to_java.exercise;

public class Test {
        public static void main(String[] args) {
            String str = "12";
            switch (str.charAt(1)) {
                case '2':
                    System.out.println("character");
                    break;
                default:
                    System.out.println("number");
            }
        }
    }
