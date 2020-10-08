package case_study.controllers.main_menu;

import case_study.controllers.Executor;
import case_study.controllers.MainMenu;
import case_study.models.Customer;

import java.util.ArrayList;
import java.util.List;

import static case_study.models.Customer.customerList;

public class AddNewCustomer extends MainMenu implements Executor {
    public static List<AddNewCustomer> addNewCustomerList = new ArrayList<>();

    public AddNewCustomer() {
        this.name = "Add new customer";
        mainMenuList.add(this);
    }

    @Override
    public void displayList() {
        for(int index =0; index < addNewCustomerList.size(); index++) {
            System.out.println((index +1)+". "+addNewCustomerList.get(index).name);
        }
    }

    @Override
    public void execute() {
        customerList.add(new Customer());
    }
}
