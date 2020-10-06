package case_study.controllers;

import java.util.Scanner;

public class MainController {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mainMenu();
    }
    public static void mainMenu() {
        System.out.println("1.Add New Services");
        System.out.println("2.Show Services");
        System.out.println("3.Add New Customer");
        System.out.println("4.Show Information of Customer");
        System.out.println("5.Add New Booking");
        System.out.println("6.Show Information of Employee");
        System.out.println("7.Exit");
        System.out.println("Please input your selection");
        try {
            switch (Byte.parseByte(scanner.nextLine())) {
                case 1:
                    addNewService();
                    break;
                case 2:
                    showService();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationOfCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationOfEmployee();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("invalid option");
                    mainMenu();
            }
        }
        catch(NumberFormatException e) {
            System.out.println("invalid option");
            mainMenu();
            }
        }

    public static void addNewService() {
        System.out.println("1.Add New Villa");
        System.out.println("2.Add New House");
        System.out.println("3.Add New Room");
        System.out.println("4.Back to Menu");
        System.out.println("5.Exit");
        System.out.println("Please input your selection");
        try {
            switch (Byte.parseByte(scanner.nextLine())) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    mainMenu();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("invalid option");
                    addNewService();
            }
        }
        catch(NumberFormatException e) {
            System.out.println("invalid option");
            addNewService();
        }
    }

    private static void addNewRoom() {
    }

    private static void addNewHouse() {
    }

    private static void addNewVilla() {
    }

    public static void showService() {
        System.out.println("1. Show all Villa");
        System.out.println("2. Show all House");
        System.out.println("3. Show all Room");
        System.out.println("4. Show all Villa Not Duplicate");
        System.out.println("5. Show all House Not Duplicate");
        System.out.println("6. Show all Room Not Duplicate");
        System.out.println("7. Back to Menu");
        System.out.println("8. Exit");
        System.out.println("Please input your selection");
        try {
            switch (Byte.parseByte(scanner.nextLine())) {
                case 1:
                    showAllVilla();
                    break;
                case 2:
                    showAllHouse();
                    break;
                case 3:
                    showAllRoom();
                    break;
                case 4:
                    showAllVillaNotDuplicate();
                    break;
                case 5:
                    showAllHouseNotDuplicate();
                    break;
                case 6:
                    showAllRoomNotDuplicate();
                    break;
                case 7:
                    mainMenu();
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("invalid option");
                    showService();
            }
        }
        catch (NumberFormatException e) {
            System.out.println("invalid option");
            showService();
        }
    }

    private static void showAllRoomNotDuplicate() {
    }

    private static void showAllHouseNotDuplicate() {
    }

    private static void showAllVillaNotDuplicate() {
    }

    private static void showAllRoom() {
    }

    private static void showAllHouse() {
    }

    private static void showAllVilla() {
    }

    public static void addNewCustomer() {

    }
    public static void showInformationOfCustomer() {

    }
    public static void addNewBooking() {

    }
    public static void showInformationOfEmployee() {

    }
}
