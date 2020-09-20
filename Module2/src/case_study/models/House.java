package case_study.models;

public class House extends Services {

    public House() {
        this.name = "House";
    }

    public House(String id, double usableArea, double rentCost, byte maxPeople, String rentType) {
        super(id, usableArea, rentCost, maxPeople, rentType);
        this.name = "House";
    }

    @Override
    public String showInfo() {
        return "House{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
