package case_study.common;

import case_study.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static case_study.models.Contract.contractList;
import static case_study.models.Customer.customerList;
import static case_study.models.Employee.employeeList;
import static case_study.models.House.houseList;
import static case_study.models.Room.roomList;
import static case_study.models.UtilitiesServices.utilitiesServicesList;
import static case_study.models.Villa.villaList;

public class Writer {
    public static void csvServiceWriter(String path, List<Services> list){
        try {
            FileWriter cfw = new FileWriter(path);
            BufferedWriter cbw = new BufferedWriter(cfw);
            for (Object o: list) {
                cbw.write(o.toString());
                cbw.newLine();
            }
            cbw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void csvUtilWriter(String path, List<UtilitiesServices> list){
        try {
            FileWriter cfw = new FileWriter(path);
            BufferedWriter cbw = new BufferedWriter(cfw);
            for (Object o: list) {
                cbw.write(o.toString());
                cbw.newLine();
            }
            cbw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void csvContractWriter(String path, List<Contract> list){
        try {
            FileWriter cfw = new FileWriter(path);
            BufferedWriter cbw = new BufferedWriter(cfw);
            for (Object o: list) {
                cbw.write(o.toString());
                cbw.newLine();
            }
            cbw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void csvCustomerWriter(String path, List<Customer> list){
        try {
            FileWriter cfw = new FileWriter(path);
            BufferedWriter cbw = new BufferedWriter(cfw);
            for (Object o: list) {
                cbw.write(o.toString());
                cbw.newLine();
            }
            cbw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void csvEmployeeWriter(String path, List<Employee> list){
        try {
            FileWriter cfw = new FileWriter(path);
            BufferedWriter cbw = new BufferedWriter(cfw);
            for (Object o: list) {
                cbw.write(o.toString());
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
        csvCustomerWriter(FilePath.CUSTOMER, customerList);
    }
    public static void employeeWriter() {
        csvEmployeeWriter(FilePath.EMPLOYEE, employeeList);
    }
    public static void villaWriter() {
        csvServiceWriter(FilePath.VILLA, villaList);
    }
    public static void houseWriter() {
        csvServiceWriter(FilePath.HOUSE, houseList);
    }
    public static void roomWriter() {
        csvServiceWriter(FilePath.ROOM, roomList);
    }
    public static void otherUtilitiesWriter() {
        csvUtilWriter(FilePath.OTHER_UTILITIES, utilitiesServicesList);
    }
    public static void contractWriter() {
        csvContractWriter(FilePath.CONTRACT, contractList);
    }
    public static void allWriter(){
        customerWriter();
        employeeWriter();
        villaWriter();
        houseWriter();
        roomWriter();
        otherUtilitiesWriter();
        contractWriter();
    }
}
