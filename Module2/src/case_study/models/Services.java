package case_study.models;

import case_study.controllers.MainController;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Services implements Comparable<Services>{
    public static List<Services> servicesList = new ArrayList<>();
    String id = new String("SV");
    String name;
    double area;
    double rentCost;
    byte maxPeople;
    String rentType;
    NumberFormat nf = new DecimalFormat("0000");
    final String COMMA = ",";

    public Services(String name, double area, double rentCost, byte maxPeople) {
        this.name = name;
        this.area = area;
        this.rentCost = rentCost;
        this.maxPeople = maxPeople;
        setRentType();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentCost() {
        return rentCost;
    }

    public void setRentCost(double rentCost) {
        this.rentCost = rentCost;
    }

    public byte getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(byte maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType() {
        System.out.println("Please select the rent type");
        System.out.println("1. Year\n2. Month\n3. Week\n4. Day\n5. Hour");
        String selected = MainController.scanner.nextLine();
        switch (selected) {
            case "1":
                this.rentType = "Year";
                break;
            case "2":
                this.rentType = "Month";
                break;
            case "3":
                this.rentType = "Week";
                break;
            case "4":
                this.rentType = "Day";
                break;
            case "5":
                this.rentType = "Hour";
                break;
            default:
                System.out.println("Invalid option, please choose again!");
                setRentType();
                break;
        }
    }

    public abstract String showInfo();

    @Override
    public int compareTo(Services s) {
        return this.name.compareTo(s.getName());
    }
}
