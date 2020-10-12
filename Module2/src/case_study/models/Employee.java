package case_study.models;

import case_study.common.Writer;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Employee extends Human {

    static int employeeNum = 0;
    public static TreeMap<String, Employee> employeeMap = new TreeMap<>();
    public static List<Employee> employeeList = new ArrayList<>();
    NumberFormat nf = new DecimalFormat("000000");
    private String employeeId;
    byte level;
    String position;
    double salary;

    public Employee() {
        employeeNum++;
        this.employeeId = "EP-"+nf.format(employeeNum);
        employeeMap.put(this.getEmployeeId(),this);
        employeeList.add(this);
    }

    public Employee(String name, String dateOfBirth, String phoneNumber, String email, String gender, String address, String identityNumber, byte level, String position, double salary) {
        super(name, dateOfBirth, phoneNumber, email, gender, address, identityNumber);
        employeeNum++;
        this.employeeId = "EP-"+nf.format(employeeNum);
        this.level = level;
        this.position = position;
        this.salary = salary;
        employeeMap.put(this.getEmployeeId(),this);
        employeeList.add(this);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name+COMMA+dateOfBirth+COMMA+phoneNumber+COMMA+email+COMMA+gender+COMMA+address+COMMA+identityNumber+COMMA+level+COMMA+position+COMMA+salary;
    }


    @Override
    public String showInfo() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", level=" + level +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", identityNumber='" + identityNumber + '\'' +
                '}';
    }
    @Override
    public int compareTo(Human h) {
        int nameComparision = this.name.compareTo(h.getName());
        if (nameComparision == 0) {
            return this.dateOfBirth.compareTo(h.getDateOfBirth());
        }
        return nameComparision;
    }

}
