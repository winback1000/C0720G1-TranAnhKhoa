package case_study.models;

public class Villa extends Services {

    public Villa() {
        this.name = "Villa";
    }

    public Villa(String id, double usableArea, double rentCost, byte maxPeople, String rentType) {
        super(id, usableArea, rentCost, maxPeople, rentType);
        this.name = "Villa";
    }

    @Override
    public String showInfo() {
        return "Villa{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
