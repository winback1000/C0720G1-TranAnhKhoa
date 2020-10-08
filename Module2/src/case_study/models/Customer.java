package case_study.models;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;


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

    public Customer(String name, String dateOfBirth, String phoneNumber, String email, String gender, String address, String identityNumber, String rentType) {
        super(name,dateOfBirth,phoneNumber,email,gender,address,identityNumber);
        customerNum++;
        this.customerId = "CT-"+nf.format(customerNum);
        this.rentType = rentType;
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

    public String otherUtilitiesInfo() {
        StringBuilder utilitiesName= new StringBuilder();
        for (UtilitiesServices sv: otherUtility) {
            utilitiesName.append(sv.getName()).append(COMMA);
        }
        return utilitiesName.toString();
    }

    @Override
    public String toString() {
        return this.getCustomerId() + COMMA + name + COMMA + dateOfBirth + COMMA + phoneNumber + COMMA  +email + COMMA + gender + COMMA + address + COMMA + rentType + COMMA + otherUtilitiesInfo() + contract;
    }

    @Override
    public String showInfo() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", customerId='" + customerId + '\'' +
                ", rentType=" + rentType +
                ", otherUtility=" + otherUtilitiesInfo() +
                ", contract=" + contract +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
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
