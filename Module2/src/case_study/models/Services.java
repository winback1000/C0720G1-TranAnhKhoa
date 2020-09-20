package case_study.models;

public abstract class Services {
    String id;
    String name;
    double usableArea;
    double rentCost;
    byte maxPeople;
    String rentType;

    public Services() {}

    public Services(String id, double usableArea, double rentCost, byte maxPeople, String rentType) {
        this.id = id;
        this.usableArea = usableArea;
        this.rentCost = rentCost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
