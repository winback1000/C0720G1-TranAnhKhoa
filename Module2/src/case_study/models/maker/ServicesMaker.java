package case_study.models.maker;

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
    public static double price;
    public static String unit;

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
    public static void newUtilityService() {
        setUtilityServiceName();
        setUtilityServicePrice();
        setUtilityServiceUnit();
        new UtilitiesServices(name, price, unit);

    }
    public static void setName() {
        String tempName = null;
        boolean corrected;
        do {
            try {
                System.out.println("Please input name (example: Summer)");
                tempName = scr.nextLine();
                corrected = Validator.isValidName(tempName, Validator.SERVICE_NAME_CHECKING);
            } catch (NameException e) {
                System.out.println("Incorrect format, please try again");
                corrected = false;
            }
        } while (!corrected);
        name = tempName;
    }
    public static void setArea() {
     area = Validator.getDoubleValue("Please input the area larger than 30 :",30);
    }
    public static void setRentCost() {
        boolean correct = true;
        double temp = 0;
        do {
            try {
                System.out.println("Please input rent cost larger than 0:");
                temp = Double.parseDouble(scr.nextLine());
                if (temp <= 0) correct = false;
            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
                correct = false;
            }
        } while (!correct);
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
        swimmingPoolArea = Validator.getDoubleValue("Please input the area of swimming pool larger than 30 :",30);
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
    public static void setUtilityServiceName() {
        String temp = null;
        boolean corrected = false;
        do {
            try {
                System.out.println("Please input the name of the service ( Massage|Karaoke|Food|Drink|Car )");
                temp = scr.nextLine();
                corrected = Validator.isValidNameType(temp,Validator.UTILITIES_NAME_CHECKING);

            } catch (Exception e) {
                System.out.println("Invalid input, please try again");
            }
        } while (!corrected);
        name = temp;
    }
    public static void setUtilityServicePrice() {
        price = Validator.getDoubleValue("Please input the price of the utility servce :", 0);
    }
    public static void setUtilityServiceUnit() {
        System.out.println("Please input the unit of this utility service");
        unit = scr.nextLine();
    }
}

