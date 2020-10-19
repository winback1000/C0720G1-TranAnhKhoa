package Examination;

import Examination.common.HumanMaker;
import Examination.common.Writer;
import Examination.exception.NotFoundStudentException;
import Examination.models.Human;
import Examination.models.Student;
import Examination.models.Teacher;

import java.util.Scanner;

import static Examination.common.FilePath.STUDENT_PATH;
import static Examination.common.Reader.*;
import static Examination.models.Student.studentList;
import static Examination.models.Teacher.teacherList;

public class MainController {
    static Scanner scr = new Scanner(System.in);

    public static void mainMenu() throws NotFoundStudentException {
        System.out.println("1. Add new student");
        System.out.println("2. Delete Student");
        System.out.println("3. Check Student list");
        System.out.println("4. Check teacher information");
        System.out.println("5. Search for a student");
        System.out.println("6. Exit");
        System.out.println("Please select an option");
        String selection = scr.nextLine();
        switch (selection) {
            case "1":
                HumanMaker.newStudent();
                Writer.csvWriter(STUDENT_PATH, studentList);
                mainMenu();
                break;
            case "2":
                try {
                    deleteStudent();
                } catch (NotFoundStudentException e) {
                    e.printStackTrace();
                }
                mainMenu();
                break;
            case "3":
                for (Student std : studentList) {
                    System.out.println(std.showInfo());
                }
                mainMenu();
                break;
            case "4":
                System.out.println("please input the teacher ID");
                int temp = Integer.parseInt(scr.nextLine());
                for (Teacher teacher : teacherList) {
                    if (teacher.getId() == temp) {
                        System.out.println(teacher.showInfo());
                    }
                }
                mainMenu();
                break;
            case "5":
                System.out.println("please input the name");
                String tempName = scr.nextLine();
                for (Student std : studentList) {
                    if (std.getName().contains(tempName)) {
                        System.out.println(std.showInfo());
                    }
                }
                mainMenu();
                break;
            case "6":
                System.exit(0);
            default:
                System.out.println("wrong selection, please try again");
                mainMenu();
        }
    }


    private static void deleteStudent() throws NotFoundStudentException {
        int index = -1;
        System.out.println("Please enter the student ID");
        int tempId = Integer.parseInt(scr.nextLine());
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == tempId) {
                index = i;
                System.out.println(studentList.get(i));
            }
        }
        if (index != -1) {
            System.out.println("1. Yes");
            System.out.println("2. No");
            String selected = scr.nextLine();
            switch (selected) {
                case "1":
                    studentList.remove(index);
                    Writer.csvWriter(STUDENT_PATH, studentList);
                    for (Student std : studentList) {
                        System.out.println(std.showInfo());
                    }
                    break;
                case "2":
                    mainMenu();
                    break;
                default:
                    System.out.println("invalid input");
                    deleteStudent();
            }
        } else {
            throw new NotFoundStudentException("This student is not valid");
        }
    }

    public static void main(String[] args) {
        classReader();
        teacherReader();
        studentReader();
        try {
            mainMenu();
        } catch (NotFoundStudentException e) {
            e.printStackTrace();
        }
    }
}

