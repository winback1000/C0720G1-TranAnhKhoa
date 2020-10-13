package case_study.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static case_study.models.Contract.contractList;
import static case_study.models.human.Customer.customerList;
import static case_study.models.human.Employee.employeeList;
import static case_study.models.service.House.houseList;
import static case_study.models.service.Room.roomList;
import static case_study.models.service.Services.servicesList;
import static case_study.models.service.UtilitiesServices.utilitiesServicesList;
import static case_study.models.service.Villa.villaList;

public class Writer {
    public static void csvWriter(String path, List<?> list){
        try {
            FileWriter cfw = new FileWriter(path);
            BufferedWriter cbw = new BufferedWriter(cfw);
            for (Object s: list) {
                cbw.write(s.toString());
                cbw.newLine();
            }
            cbw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void datWriter(String path, ArrayList<Object> list) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void customerWriter() {
        csvWriter(FilePath.CUSTOMER, customerList);
    }
    public static void employeeWriter() {
        csvWriter(FilePath.EMPLOYEE, employeeList);
    }
    public static void villaWriter() {
        csvWriter(FilePath.VILLA, villaList);
    }
    public static void servicesWriter() {
        csvWriter(FilePath.SERVICES, servicesList);
    }
    public static void houseWriter() {
        csvWriter(FilePath.HOUSE, houseList);
    }
    public static void roomWriter() {
        csvWriter(FilePath.ROOM, roomList);
    }
    public static void otherUtilitiesWriter() {
        csvWriter(FilePath.OTHER_UTILITIES, utilitiesServicesList);
    }
    public static void contractWriter() {
        csvWriter(FilePath.CONTRACT, contractList);
    }
    public static void allWriter(){
        customerWriter();
        employeeWriter();
        servicesWriter();
        otherUtilitiesWriter();
        contractWriter();
    }
}
