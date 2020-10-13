package case_study.models.service;

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

    public Services(String name, double area, double rentCost, byte maxPeople, String rentType) {
        this.name = name;
        this.area = area;
        this.rentCost = rentCost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public Services(String name) {
        this.name = name;
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

    public abstract String showInfo();

    @Override
    public int compareTo(Services s) {
        return this.name.compareTo(s.getName());
    }
}
