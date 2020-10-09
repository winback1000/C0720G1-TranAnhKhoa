package case_study.models.maker;

import case_study.common.Validator;
import case_study.common.exception.*;
import case_study.controllers.main_menu.ShowServices;
import case_study.controllers.main_menu.show_services.ShowAllServices;
import case_study.models.Services;
import case_study.models.UtilitiesServices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HumanMaker {
    static Scanner scr = new Scanner(System.in);
    public static String name;
    public static String dateOfBirth;
    public static String phoneNumber;
    public static String email;
    public static String gender;
    public static String address;
    public static String identityNumber;

    public static String customerType;
    public static String rentType;
    public static List<UtilitiesServices> otherUtility = new ArrayList<>();
    public static String contract;

    public static byte level;
    public static String position;
    public static double salary;



    public static void addNewCustomer() {
        ServicesMaker.setName();
        setDateOfBirth();
        setPhoneNumber();
        setEmail();
        setGender();
        setAddress();
        setCustomerType();
        setRentType();




    }

    public static void setDateOfBirth() {
        String temp = null;
        boolean corrected = false;
        do {
            try {
                System.out.println("Please input date of birth (example: mm-dd-yyyy), with age larger than 18");
                temp = scr.nextLine();
                corrected = Validator.isValidDate(temp, Validator.DOB_CHECKING);

            } catch (BirthdayException e) {
                System.out.println("Customer is too young, please input again");
            } catch (DateFormatException e) {
                System.out.println("Wrong date format, please input again");
            }
        } while (!corrected);
        dateOfBirth = temp;
    }
    public static void setPhoneNumber() {
        String tempNum = null;
        boolean corrected = false;
        do {
            try {
                System.out.println("Please input the phone number with 10 digital");
                tempNum = scr.nextLine();
                corrected = Validator.isValidPhoneNumber(tempNum);

            } catch (Exception e) {
                System.out.println("Invalid phone number, please try again");
            }
        } while (!corrected);
        phoneNumber = tempNum;
    }
    public static void setEmail() {
        String tempEmail = null;
        boolean corrected = false;
        do {
            try {
                System.out.println("Please input the email address( example: ab.c@ab.c");
                tempEmail = scr.nextLine();
                corrected = Validator.isValidEmail(tempEmail);

            } catch (EmailException e) {
                System.out.println("Invalid email, please try again");;
            }
        } while (!corrected);
        email = tempEmail;
    }
    public static void setGender() {
        String temp = null;
        boolean corrected = true;
        do {
            try {
                System.out.println("Please input the email address( example: ab.c@ab.c");
                temp = scr.nextLine();
                gender = Validator.isValidGender(temp);

            } catch (GenderException e) {
                System.out.println("Invalid Gender, please try again");
                corrected = false;
            }
        } while (!corrected);
    }
    public static void setAddress() {
        System.out.println("Please input the address");
        address = scr.nextLine();
    }
    public static void setIdentityNumber() {
        String temp = null;
        boolean corrected = false;
        do {
            try {
                System.out.println("Please input the phone number with 10 digital");
                temp = scr.nextLine();
                corrected = Validator.isValidIdCard(temp);

            } catch (Exception e) {
                System.out.println("Invalid ID number, please try again");
            }
        } while (!corrected);
        identityNumber = temp;
    }
    public static void setCustomerType() {
        String temp = null;
        boolean corrected = false;
        do {
            try {
                System.out.println("Please input the customer type( Member | Silver | Gold | Platinum | Diamond )");
                temp = scr.nextLine();
                corrected = Validator.isValidCustomerType(temp);

            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
            }
        } while (!corrected);
        customerType = temp;
    }
    public static void setRentType() {
        ShowAllServices.showList(Services.servicesList);
        rentType = ShowAllServices.IdSelection(Services.servicesList);
    }
}
