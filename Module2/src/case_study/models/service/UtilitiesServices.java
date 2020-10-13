package case_study.models.service;

import java.security.Provider;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import static case_study.models.service.Services.servicesList;


public class UtilitiesServices {
    public static final String COMMA = ",";
    public static List<UtilitiesServices> utilitiesServicesList = new ArrayList<>();
    NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    String name;
    String price;
    String unit;
    String id = "SVUS";

    public UtilitiesServices(String name, double price, String unit) {
        this.name = name;
        this.price = moneyFormat.format(price);
        this.unit = unit;
        utilitiesServicesList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = moneyFormat.format(price);
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return id + COMMA + name + COMMA + price + COMMA + unit;
    }

    public String showInfo() {
        return "UtilitiesServices{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}
