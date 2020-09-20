package case_study.models;

public class Room extends Services {

    public Room() {
        this.name = "House";
    }

    public Room(String id, double usableArea, double rentCost, byte maxPeople, String rentType) {
        super(id, usableArea, rentCost, maxPeople, rentType);
        this.name = "House";
    }

    @Override
    public String showInfo() {
        return "Room{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", usableArea=" + usableArea +
                ", rentCost=" + rentCost +
                ", maxPeople=" + maxPeople +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
