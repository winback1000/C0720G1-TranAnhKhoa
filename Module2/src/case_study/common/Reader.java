package case_study.common;

import case_study.models.*;
import case_study.models.human.Customer;
import case_study.models.human.Employee;
import case_study.models.service.House;
import case_study.models.service.Room;
import case_study.models.service.UtilitiesServices;
import case_study.models.service.Villa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static case_study.models.service.UtilitiesServices.utilitiesServicesList;

public class Reader {
    public static FileReader cfr;
    public static BufferedReader cbr;
    public static String line;
    public static String[] lineList;


    public static void customerReader() {
        try {
            cfr = new FileReader(FilePath.CUSTOMER);
            cbr = new BufferedReader(cfr);
            while ((line = cbr.readLine()) != null) {
                lineList = line.split(",");
                new Customer(lineList[0],lineList[1],lineList[2],lineList[3],lineList[4],lineList[5],lineList[6],lineList[7],lineList[8],readUtilitiesForCustomer(lineList[9]),lineList[10]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File is empty or broken");
        }
    }
    public static void employeeReader() {
        try {
            cfr = new FileReader(FilePath.EMPLOYEE);
            cbr = new BufferedReader(cfr);
            while ((line = cbr.readLine()) != null) {
                lineList = line.split(",");
                new Employee(lineList[0],lineList[1],lineList[2],lineList[3],lineList[4],lineList[5],lineList[6],Byte.parseByte(lineList[7]),lineList[8],Double.parseDouble(lineList[9]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File is empty or broken");
        }
    }

    public static void contractReader() {
        try {
            cfr = new FileReader(FilePath.CONTRACT);
            cbr = new BufferedReader(cfr);
            while ((line = cbr.readLine()) != null) {
                lineList = line.split(",");
                new Contract(lineList[0],lineList[1],Double.parseDouble(lineList[2].substring(1)),Double.parseDouble(lineList[3].substring(1)));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File is empty or broken");
        }
    }
    public static List<UtilitiesServices> readUtilitiesForCustomer(String str) {
        List<UtilitiesServices> utilList = new ArrayList<>();
        String[] utilArr = str.split("\\+");
        for (String name: utilArr) {
            for (UtilitiesServices us: utilitiesServicesList) {
                if(us.getName().equals(name)) {
                    utilList.add(us);
                }
            }
        }
        return utilList;
    }
    public static void servicesReader(String path) {
        try {
            cfr = new FileReader(path);
            cbr = new BufferedReader(cfr);
            while ((line = cbr.readLine()) != null) {
                lineList = line.split(",");
                String code = lineList[0].substring(0,4);
                switch (code) {
                    case "SVVL" :{
                        new Villa(lineList[1],Double.parseDouble(lineList[2]),Double.parseDouble(lineList[3]),Byte.parseByte(lineList[4]),lineList[5],lineList[6],lineList[7],Double.parseDouble(lineList[8]),Byte.parseByte(lineList[9]));
                        break;
                    }
                    case "SVHO" :{
                        new House(lineList[1],Double.parseDouble(lineList[2]),Double.parseDouble(lineList[3]),Byte.parseByte(lineList[4]),lineList[5],lineList[6],lineList[7],Byte.parseByte(lineList[8]));
                        break;
                    }
                    case "SVRO" :{
                        new Room(lineList[1],Double.parseDouble(lineList[2]),Double.parseDouble(lineList[3]),Byte.parseByte(lineList[4]),lineList[5],lineList[6]);
                        break;
                    }
                    case "SVUS" : {
                        new UtilitiesServices(lineList[1],Double.parseDouble(lineList[2].substring(3)),lineList[4]);
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File is empty or broken");
        }
    }
}
