package case_study.controllers.main_menu;

import case_study.controllers.MainMenu;
import case_study.models.maker.HumanMaker;

import java.util.ArrayList;
import java.util.List;

public class AddNewCustomer extends MainMenu {
    public static List<MainMenu> addNewCustomerList = new ArrayList<>();

    public AddNewCustomer() {
        this.name = "Add new customer";
    }

    @Override
    public void displayList() {
        showMenu(addNewCustomerList);
    }

    @Override
    public void execute() {
        HumanMaker.addNewCustomer();
        displayList();
    }
}
