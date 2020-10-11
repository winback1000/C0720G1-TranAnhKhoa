package case_study.common;

import case_study.models.maker.HumanMaker;
import case_study.models.maker.ServicesMaker;

import static case_study.models.Customer.customerList;

public class Test {
    public static void main(String[] args) {

        ServicesMaker.newVilla();
        HumanMaker.addNewCustomer();
        System.out.println(customerList.get(customerList.size()-1));
    }
}
