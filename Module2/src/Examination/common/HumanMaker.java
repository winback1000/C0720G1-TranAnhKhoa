package Examination.common;

import Examination.models.Class;
import Examination.models.Student;
import Examination.models.Teacher;
import java.util.Scanner;

import static Examination.models.Class.classList;


public class HumanMaker<corrected> {
    static Scanner scr = new Scanner(System.in);
    public static String name;
    public static String dateOfBirth;
    public static String phoneNumber;
    public static String gender;
    public static int classId;

    public static void newStudent() {
        setName();
        setDateOfBirth();
        setGender();
        setPhoneNumber();
        setClassId();
        new Student(name,dateOfBirth,gender,phoneNumber,classId);
    }
    public static void newTeacher(){
        setName();
        setDateOfBirth();
        setGender();
        setPhoneNumber();
        new Teacher(name,dateOfBirth,gender,phoneNumber);
    }
    public static void setName() {
        String tempName = null;
        boolean corrected;
    do {
            System.out.println("Please input name (example: Nguyen Van Hau)");
            tempName = scr.nextLine();
            corrected = Validator.isValidName(tempName, Validator.HUMAN_NAME_CHECKING);
        } while (!corrected);
        name = tempName;
    }
    public static void setDateOfBirth() {
        String temp = null;
        boolean corrected;
        do {
            System.out.println("Please input date of birth (example: mm-dd-yyyy)");
            temp = scr.nextLine();
            corrected = Validator.isValidDateOfBirth(temp, Validator.DOB_CHECKING);
        } while (!corrected);
        dateOfBirth = temp;
    }
    public static void setGender() {
        String temp = null;
        boolean corrected;
        do {
            System.out.println("Please input the gender( Male, Female, Unknown)");
            temp = scr.nextLine();
            corrected = Validator.isValidGender(temp);
        } while (!corrected);
        gender = temp;
    }
    public static void setPhoneNumber() {
        String tempNum = null;
        boolean correct;
            do {
                System.out.println("Please input the phone number with 10 digital");
                tempNum = scr.nextLine();
                correct = Validator.isValidPhoneNumber(tempNum);
            } while (!correct);
        phoneNumber = tempNum;
    }
    public static void setClassId() {
        int tempNum = 0;
        boolean corrected = false;
        do {
            try {
                System.out.println("Please input the class id");
                tempNum = Integer.parseInt(scr.nextLine());
                for (Class cl: classList) {
                    if (cl.getId() == tempNum) {
                        corrected = true;
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid class id, please try again");
                corrected = false;
            }
        } while (!corrected);
        classId = tempNum;
    }

}
