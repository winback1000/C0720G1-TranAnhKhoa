package case_study.common;

import java.io.*;
import java.util.List;

import static case_study.models.Contract.contractList;
import static case_study.models.human.Customer.customerList;
import static case_study.models.human.Employee.employeeList;
import static case_study.models.service.Services.servicesList;
import static case_study.models.service.UtilitiesServices.utilitiesServicesList;

public class Writer {
    public static void csvWriter(String path, List<?> list){
        FileWriter cfw;
        BufferedWriter cbw = null;

        try {
            cfw = new FileWriter(path);
            cbw = new BufferedWriter(cfw);
            for (Object s: list) {
                cbw.write(s.toString());
                cbw.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                cbw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
//    public static void datWriter(String path, ArrayList<Object> list) {
//        try {
//            FileOutputStream fos = new FileOutputStream(path);
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//            oos.writeObject(list);
//            oos.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    public static void customerWriter() {
        csvWriter(FilePath.CUSTOMER, customerList);
    }
    public static void employeeWriter() {
        csvWriter(FilePath.EMPLOYEE, employeeList);
    }
    public static void servicesWriter() {
        csvWriter(FilePath.SERVICES, servicesList);
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
