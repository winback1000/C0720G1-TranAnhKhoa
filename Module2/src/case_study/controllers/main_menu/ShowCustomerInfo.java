package case_study.controllers.main_menu;

import case_study.controllers.MainMenu;
import case_study.models.Customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static case_study.models.Customer.customerList;

public class ShowCustomerInfo extends MainMenu {
    public static List<MainMenu> showCustomerInfoList = new ArrayList<>();

    public ShowCustomerInfo() {
        this.name = "Show customers info";
    }

    @Override
    public void execute() {
        Collections.sort(customerList);
        for (Customer customer: customerList) {
            System.out.println(customer.showInfo());
        }
        displayList();
    }

    @Override
    public void displayList() {
        showMenu(showCustomerInfoList);
    }
}
