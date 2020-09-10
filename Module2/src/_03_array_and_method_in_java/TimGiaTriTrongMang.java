package _03_array_and_method_in_java;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("Enter student's name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean check = false;
        for (int i = 0; i<students.length; i++) {
            if (students[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is: " + (i + 1));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found " + name + " in the list.");
        }
    }
}
