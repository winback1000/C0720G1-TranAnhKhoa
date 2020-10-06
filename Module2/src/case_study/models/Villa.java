package case_study.models;

import java.util.ArrayList;
import java.util.List;

public class Villa extends Services {
    public static int villaNum = 0;
    public static List<Villa> villaList = new ArrayList<>();

    public Villa(String name, double usableArea, double rentCost, byte maxPeople, String rentType) {
        super(name, usableArea, rentCost, maxPeople, rentType);
        villaNum++;
        this.id = "SVVL-"+nf.format(villaNum);
        villaList.add(this);
        servicesList.add(this);
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
