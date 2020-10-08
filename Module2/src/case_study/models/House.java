package case_study.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class House extends Services {

    public static int houseNum = 0;
    public static List<House> houseList = new ArrayList<>();
    public static TreeSet<String> houseNameList = new TreeSet<>();
    String roomStandard;
    String otherUtilities;
    byte numberOfFloor;

    public House(String name, double area, double rentCost, byte maxPeople, String rentType, String roomStandard, String otherUtilities, byte numberOfFloor) {
        super(name, area, rentCost, maxPeople, rentType);
        houseNum++;
        this.id = this.id + "HO-" + nf.format(houseNum);
        this.roomStandard = roomStandard;
        this.otherUtilities = otherUtilities;
        this.numberOfFloor = numberOfFloor;
        houseList.add(this);
        servicesList.add(this);
        houseNameList.add(this.name);
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherUtilities() {
        return otherUtilities;
    }

    public void setOtherUtilities(String otherUtilities) {
        this.otherUtilities = otherUtilities;
    }

    public byte getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(byte numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }
    @Override
    public String toString() {
        return id + COMMA + name + COMMA + area + COMMA + rentCost + COMMA + maxPeople + COMMA + rentType + COMMA + roomStandard + COMMA + otherUtilities + COMMA + numberOfFloor;
    }
    @Override
    public String showInfo() {
        return "House{" +
                ", id=" + id +
                ", Name='" + name + '\'' +
                ", Area=" + area +
                ", Rent Cost=" + rentCost +
                ", Max People=" + maxPeople +
                ", Rent Type='" + rentType + '\'' +
                ", Room Standard='" + roomStandard + '\'' +
                ", Other Utilities='" + otherUtilities + '\'' +
                ", Number Of Floor=" + numberOfFloor +
                "} ";
    }
}
