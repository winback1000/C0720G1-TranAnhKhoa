package case_study.models;


import java.util.Map;

import static case_study.models.Employee.employeeMap;
import static case_study.models.Services.servicesList;

public class TestEmployee {
    public static void main(String[] args) {
//        Employee e1 = new Employee();
//        e1.setPhoneNumber("1234-567-890");
//        Employee e2 = new Employee("abc","10/10/1990","1234567890","abc@ab","female","123alsjf","0123456789",(byte)3,"senior",10000000d);
//        Employee e3 = new Employee();
//        Employee e4 = new Employee();
//        Employee e5 = new Employee();
//        Employee e6 = new Employee();
//        Employee e7 = new Employee();
//        String a = "Nguyen Dinh Binh";
//        String c = "1990";
//        String b = "Lap";
//        System.out.println(a.substring(a.lastIndexOf(" ")+1).compareTo(b));
//        int d = Integer.parseInt(c);
//        System.out.println(2020-d);
        Customer c1 = new Customer();

        Villa vl1 = new Villa("Daisy",40d,1000000,(byte) 4,"Luxury","Free breakfast",30,(byte) 20);
        System.out.println(servicesList);
        c1.setRentType(servicesList.get(0));
        System.out.println(c1);
//        System.out.println(employeeMap.values());
//        for (Map.Entry<String,Employee> e: employeeMap.entrySet()) {
//            System.out.println(e.getValue().showInfo());
//        }
    }
}
