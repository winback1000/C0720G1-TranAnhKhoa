package case_study.models;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public abstract class Services {
    public static List<Services> servicesList = new ArrayList<>();
    String id;
    String name;
    double usableArea;
    double rentCost;
    byte maxPeople;
    String rentType;
    NumberFormat nf = new DecimalFormat("0000");

    public Services(String name, double usableArea, double rentCost, byte maxPeople, String rentType) {
        this.name = name;
        this.usableArea = usableArea;
        this.rentCost = rentCost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
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

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
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

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public abstract String showInfo();

}
