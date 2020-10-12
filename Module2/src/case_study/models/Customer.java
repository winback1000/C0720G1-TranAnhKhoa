package case_study.models;

import case_study.common.Writer;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Customer extends Human {


    NumberFormat nf = new DecimalFormat("000000");
    static int customerNum = 0;
    String customerType;
    private String customerId;
    String rentType;
    List<UtilitiesServices> otherUtility = new ArrayList<>();
    String contract;
    public static List<Customer> customerList = new ArrayList<>();


    public Customer() {
        customerNum++;
        this.customerId = "CT-"+nf.format(customerNum);
        customerList.add(this);
    }

    public Customer(String name, String dateOfBirth, String phoneNumber, String email, String gender, String address, String identityNumber, String rentType,String customerType,List<UtilitiesServices> otherUtility,String contract) {
        super(name,dateOfBirth,phoneNumber,email,gender,address,identityNumber);
        customerNum++;
        this.customerId = "CT-"+nf.format(customerNum);
        this.rentType = rentType;
        this.customerType = customerType;
        this.otherUtility = otherUtility;
        this.contract = contract;
        customerList.add(this);
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(Services services) {
        this.rentType = services.getId();
    }

    public String getOtherUtility() {
        return otherUtility.toString();
    }

    public void setOtherUtility(UtilitiesServices otherUtility) {
        this.otherUtility.add(otherUtility);
    }

    public String getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract.getId();
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public StringBuilder otherUtilitiesInfo() {
        StringBuilder utilitiesName= new StringBuilder();
        for (UtilitiesServices sv: otherUtility) {
            utilitiesName.append(sv.getName()).append("+");
        }
        if(utilitiesName.length()>1) {
            utilitiesName.deleteCharAt(utilitiesName.length() - 1);
        }
        return utilitiesName;
    }

    @Override
    public String toString() {
        return name + COMMA + dateOfBirth + COMMA + phoneNumber + COMMA  +email + COMMA + gender + COMMA + address + COMMA + identityNumber +COMMA+ rentType + COMMA+ customerType+ COMMA + otherUtilitiesInfo() +COMMA+ contract;
    }

    @Override
    public String showInfo() {
        return "Customer{" +
                "CustomerId='" + customerId + '\'' +
                ", Name='" + name + '\'' +
                ", Date of birth=" + dateOfBirth +
                ", Phone number='" + phoneNumber + '\'' +
                ", Email='" + email + '\'' +
                ", Gender='" + gender + '\'' +
                ", Address='" + address + '\'' +
                ", Identity Number='" + identityNumber + '\'' +
                ", Rent Type=" + rentType +
                ", Customer type =" + customerType +
                ", Other Utility=" + otherUtilitiesInfo() +
                ", Contract=" + contract +
                '}';
    }

    @Override
    public int compareTo(Human h) {
        int nameComparision = this.name.compareTo(h.getName());
        if (nameComparision == 0) {
            return Integer.parseInt(this.dateOfBirth.substring(6)) - Integer.parseInt(h.getDateOfBirth().substring(6));
        }
        return nameComparision;
    }
}
