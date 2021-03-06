package case_study.models.service;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Room extends Services {

    public static int roomNum = 0;
    public static List<Services> roomList = new ArrayList<>();
    public static TreeSet<String> roomNameList = new TreeSet<>();
    String freeServices;

    public Room(String name, double area, double rentCost, byte maxPeople,String rentType, String freeServices) {
        super(name, area, rentCost, maxPeople, rentType);
        roomNum++;
        this.id = this.id + "RO-" + nf.format(roomNum);
        this.freeServices = freeServices;
        roomList.add(this);
        servicesList.add(this);
        roomNameList.add(this.name);
    }


    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(UtilitiesServices freeServices) {
        this.freeServices = freeServices.getName();
    }
    @Override
    public String toString() {
        return this.getId()+COMMA+name + COMMA + area + COMMA + rentCost + COMMA + maxPeople + COMMA + rentType + COMMA + freeServices;
    }

    @Override
    public String showInfo() {
        return "Room{" +
                "id=" + id +
                ", Name='" + name + '\'' +
                ", Area=" + area +
                ", Rent cost =" + rentCost +
                ", Maximum people =" + maxPeople +
                ", Rent type ='" + rentType + '\'' +
                "Free services ='" + freeServices + '\'' +
                "} ";
    }
}
