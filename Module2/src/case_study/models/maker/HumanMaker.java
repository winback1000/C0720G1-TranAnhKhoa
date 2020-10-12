package case_study.models.maker;

import case_study.common.Validator;
import case_study.common.exception.*;
import case_study.common.ShowList;
import case_study.controllers.main_menu.add_new_customer.AddNewContract;
import case_study.models.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static case_study.models.Contract.contractList;
import static case_study.models.UtilitiesServices.utilitiesServicesList;

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
        setName();
        setDateOfBirth();
        setPhoneNumber();
        setEmail();
        setGender();
        setAddress();
        setIdentityNumber();
        setCustomerType();
        setRentType();
        setOtherUtility();
        setContract();
        new Customer(name,dateOfBirth,phoneNumber,email,gender,address,identityNumber,rentType,customerType,otherUtility,contract);
    }
    public static void addNewEmployee (){
        setName();
        setDateOfBirth();
        setPhoneNumber();
        setEmail();
        setGender();
        setAddress();
        setEmployeeLevel();
        setEmployeePosition();
        setEmployeeSalary();
        new Employee(name,dateOfBirth,phoneNumber,email,gender,address,identityNumber,level,position,salary);
    }
    public static void setName() {
        String tempName = null;
        boolean corrected;
        do {
            corrected = true;
            try {
                System.out.println("Please input name (example: Nguyen Van Hau)");
                tempName = scr.nextLine();
                corrected = Validator.isValidName(tempName, Validator.HUMAN_NAME_CHECKING);
            } catch (NameException e) {
                System.out.println("Incorrect format, please try again");
                corrected = false;
            }
        } while (!corrected);
        name = tempName;
    }
    public static void setDateOfBirth() {
        String temp = null;
        boolean corrected = false;
        do {
            try {
                System.out.println("Please input date of birth (example: mm-dd-yyyy), with age larger than 18");
                temp = scr.nextLine();
                corrected = Validator.isValidDateOfBirth(temp, Validator.DOB_CHECKING);

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
                System.out.println("Please input the email address( example: ab.c@ab.c)");
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
                System.out.println("Please input the gender( Male, Female, Unknown)");
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
                System.out.println("Please input the ID number with 9 digital");
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
        ShowList.showServicesList(Services.servicesList);
        rentType = ShowList.idSelection(Services.servicesList);
    }
    public static void setOtherUtility() {
        boolean available;
            while( utilitiesServicesList.size() == 0) {
                System.out.println("There is not any available utility, please add new one");
                ServicesMaker.newUtilityService();
            }
            do {
                available = true;
            try {
                ShowList.showListUtilities(utilitiesServicesList);
                ShowList.SelectFromList(utilitiesServicesList);
                otherUtility.add(utilitiesServicesList.get(ShowList.selection - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Incorrect selection, please try again");
                available = false;
            }
        } while (!available);
    }
    public static void setContract() {
        boolean available;
        while (contractList.size() == 0) {
            System.out.println("There is not any available contract, please add new one");
            AddNewContract.newContract();
        }
        do {
            available = true;
            try {
                ShowList.showContractList(contractList);
                ShowList.SelectFromList(contractList);
                contract = contractList.get(ShowList.selection - 1).getId();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Incorrect selection, please try again");
                available = false;
            }
        } while (!available);
    }
    public static void setEmployeeLevel() {
        boolean correct = true;
        do {
            try {
                System.out.println("Please input the level of employee(1-4)");
                level = Byte.parseByte(scr.nextLine());
                if (level <0 || level > 4) {
                    System.out.println("invalid input, please try again");
                    correct = false;
                }
            } catch (Exception e) {
                System.out.println("invalid input, please try again");
                correct = false;
            }
        } while (!correct);
    }
    public static void setEmployeePosition() {
        String temp = null;
        boolean corrected = false;
        do {
            try {
                System.out.println("Please input the position ( Junior|Senior|Supervisor|Leader|Manager )");
                temp = scr.nextLine();
                corrected = Validator.isValidNameType(temp,Validator.POSITION_CHECKING);

            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
            }
        } while (!corrected);
        position = temp;
    }
    public static void setEmployeeSalary() {
        boolean correct = true;
        do {
            try {
                System.out.println("Please input the salary of employee (larger than 0)");
                salary = Double.parseDouble(scr.nextLine());
                if (salary <0 ) {
                    System.out.println("invalid input, please try again");
                    correct = false;
                }
            } catch (Exception e) {
                System.out.println("invalid input, please try again");
                correct = false;
            }
        } while (!correct);
    }
}
