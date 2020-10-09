package case_study.controllers.main_menu;

import case_study.controllers.MainMenu;
import case_study.models.Customer;

import java.util.ArrayList;
import java.util.List;

import static case_study.models.Customer.customerList;

public class AddNewBooking extends MainMenu {
    public static List<MainMenu> menuList = new ArrayList<>();

    public AddNewBooking() {
        this.name = "Add new booking";
        MainMenu.menuList.add(this);
    }

    @Override
    public void displayList() {
        showMenu(menuList);
    }

    @Override
    public void execute() {
        for (Customer customer: customerList) {
            System.out.println(customer.showInfo());
        }
        displayList();
    }
}
