package case_study.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Villa extends Services {

    public static int villaNum = 0;
    public static List<Villa> villaList = new ArrayList<>();
    public static TreeSet<String> villaNameList = new TreeSet<>();
    String roomStandard;
    String otherUtilities;
    double swimmingPoolArea;
    byte numberOfFloor;

    public Villa(String name, double area, double rentCost, byte maxPeople, String rentType, String roomStandard, String otherUtilities, double swimmingPoolArea, byte numberOfFloor) {
        super(name, area, rentCost, maxPeople, rentType);
        villaNum++;
        this.id = this.id + "VL-" + nf.format(villaNum);
        this.roomStandard = roomStandard;
        this.otherUtilities = otherUtilities;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloor = numberOfFloor;
        villaList.add(this);
        servicesList.add(this);
        villaNameList.add(this.name);
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

    public double getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(float swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public byte getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(byte numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return id + COMMA + name + COMMA + area + COMMA + rentCost + COMMA + maxPeople + COMMA + rentType + COMMA + roomStandard + COMMA + otherUtilities + COMMA + swimmingPoolArea + COMMA + numberOfFloor;
    }

    @Override
    public String showInfo() {
        return "Villa{" +
                " id=" + id +
                ", Name='" + name + '\'' +
                ", Area=" + area +
                ", Rent Cost=" + rentCost +
                ", Max People=" + maxPeople +
                ", Rent Type='" + rentType + '\'' +
                ", Room Standard='" + roomStandard + '\'' +
                ", Other Utilities='" + otherUtilities + '\'' +
                ", Swimming Pool Area=" + swimmingPoolArea +
                ", Number Of Floor=" + numberOfFloor +
                "} ";
    }
}
