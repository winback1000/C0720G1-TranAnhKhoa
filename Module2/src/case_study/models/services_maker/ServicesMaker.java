package case_study.models.services_maker;

import case_study.common.Validator;
import case_study.common.exception.NameException;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.UtilitiesServices;
import case_study.models.Villa;

import java.util.Scanner;

public class ServicesMaker {
    static Scanner scr = new Scanner(System.in);
    public static String name;
    public static double area;
    public static double rentCost;
    public static byte maxPeople;
    public static String rentType;

    public static String roomStandard;
    public static String otherUtilities;
    public static double swimmingPoolArea;
    public static byte numberOfFloor;

    public static String freeServices;

    public static void newVilla() {
        setName();
        setArea();
        setRentCost();
        setMaxPeople();
        setRentType();
        setRoomStandard();
        setOtherUtilities();
        setSwimmingPoolArea();
        setNumberOfFloor();
        new Villa(name, area, rentCost,maxPeople, rentType, roomStandard, otherUtilities, swimmingPoolArea, numberOfFloor);
    }
    public static void newHouse() {
        setName();
        setArea();
        setRentCost();
        setMaxPeople();
        setRentType();
        setRoomStandard();
        setOtherUtilities();
        setNumberOfFloor();
        new House(name,area,rentCost,maxPeople,rentType,roomStandard,otherUtilities,numberOfFloor);
    }

    public static void newRoom(){
        setName();
        setArea();
        setRentCost();
        setMaxPeople();
        setRentType();
        setFreeServices();
        new Room(name, area, rentCost,maxPeople,rentType,freeServices);
    }

    public static void setName() {
        String tempName = null;
        boolean corrected = false;
        do {
            try {
                System.out.println("Please input name (example: Nguyen Van Teo)");
                tempName = scr.nextLine();
                corrected = Validator.isValidName(tempName, Validator.NAME_CHECKING);
            } catch (NameException e) {
                System.out.println("Incorrect format, please try again");
            }
        } while (!corrected);
        name = tempName;
    }
    public static void setArea() {
        double temp;
        do {
            System.out.println("Please input area larger than 30:");
            temp = Double.parseDouble(scr.nextLine());
        } while (!Validator.isValidArea(temp));
          area = temp;
    }
    public static void setRentCost() {
        double temp;
        do {
            System.out.println("Please input rent cost larger than 0:");
            temp = Double.parseDouble(scr.nextLine());
        } while (!Validator.isValidRentCost(temp));
        rentCost = temp;
    }
    public static void setMaxPeople() {
        byte temp;
        do {
            System.out.println("Please input the maximum of people lager than 0 and smaller than 20:");
            temp = Byte.parseByte(scr.nextLine());
        } while (!Validator.isValidMaxPeople(temp));
        maxPeople = temp;
    }
    public static void setRentType() {
        boolean correct = true;
        do {
            System.out.println("Please select the rent type:");
            System.out.println("1. Year\n2. Month\n3. Week\n4. Day\n5. Hour");
            String selected = scr.nextLine();
            switch (selected) {
                case "1":
                    rentType = "Year";
                    break;
                case "2":
                    rentType = "Month";
                    break;
                case "3":
                    rentType = "Week";
                    break;
                case "4":
                    rentType = "Day";
                    break;
                case "5":
                    rentType = "Hour";
                    break;
                default:
                    System.out.println("Invalid option, please choose again!");
                    correct = false;
            }
        } while (!correct);
    }
    public static void setRoomStandard() {
        boolean correct = true;
        do {
            System.out.println("Please select the room standard:");
            System.out.println("1. Basic\n2. High service\n3. Superior\n4. Deluxe\n");
            String selected = scr.nextLine();
            switch (selected) {
                case "1":
                    roomStandard = "Basic";
                    break;
                case "2":
                    roomStandard = "High service";
                    break;
                case "3":
                    roomStandard = "Superior";
                    break;
                case "4":
                    roomStandard = "Deluxe";
                    break;
                default:
                    System.out.println("Invalid option, please choose again!");
                    correct = false;
            }
        } while (!correct);
    }
    public static void setOtherUtilities() {
        System.out.println("Please describe the other utilities  ");
        otherUtilities = scr.nextLine();
    }
    public static void setSwimmingPoolArea() {
        double temp;
        do {
            System.out.println("Please input swimming pool area larger than 30:");
            temp = Double.parseDouble(scr.nextLine());
        } while (!Validator.isValidArea(temp));
        swimmingPoolArea = temp;
    }
    public static void setNumberOfFloor() {
        byte temp;
        do {
            System.out.println("Please input the number of floor lager than 0:");
            temp = Byte.parseByte(scr.nextLine());
        } while (!Validator.isValidFloor(temp));
        numberOfFloor = temp;
    }
    public static void setFreeServices() {
        boolean correct = true;
        int selected = 0;
        do {
            for (int index = 0; index < UtilitiesServices.utilitiesServicesList.size(); index++) {
                System.out.println((index + 1) + ". " + UtilitiesServices.utilitiesServicesList.get(index).getName());
            }
            System.out.println("Please select the free service");
            try {
                selected = Integer.parseInt(scr.nextLine());
                if (selected<0 || selected > UtilitiesServices.utilitiesServicesList.size()) {
                    System.out.println("incorrect input, please try again");
                    correct = false;
                }
            } catch (Exception e) {
                System.out.println("incorrect input, please try again");
                correct = false;
            }
        } while(!correct);
        freeServices = UtilitiesServices.utilitiesServicesList.get(selected-1).getName();
    }
}

