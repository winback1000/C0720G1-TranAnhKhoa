package case_study.controllers.main_menu;

import case_study.common.ShowList;
import case_study.controllers.MainMenu;
import case_study.models.Customer;

import java.util.ArrayList;
import java.util.List;

import static case_study.models.Customer.customerList;

public class AddNewBooking extends MainMenu {
    public static List<MainMenu> addNewBookingList = new ArrayList<>();
    public static Customer tempCustomer;

    public AddNewBooking() {
        this.name = "Add new booking";
    }

    @Override
    public void displayList() {
        showMenu(addNewBookingList);
    }

    @Override
    public void execute() {
        ShowList.showCustomerList(customerList);
        tempCustomer = ShowList.customerSelection(customerList);

        displayList();
    }
}
