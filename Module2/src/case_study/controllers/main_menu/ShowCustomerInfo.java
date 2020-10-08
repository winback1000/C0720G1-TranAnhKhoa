package case_study.controllers.main_menu;

import case_study.controllers.Executor;
import case_study.controllers.MainMenu;
import case_study.models.Customer;

import java.util.ArrayList;
import java.util.List;

import static case_study.models.Customer.customerList;

public class ShowCustomerInfo extends MainMenu implements Executor {
    public static List<ShowCustomerInfo> showCustomerInfoList = new ArrayList<>();

    public ShowCustomerInfo() {
        this.name = "Show customers info";
        mainMenuList.add(this);
    }

    @Override
    public void execute() {
        for (Customer customer: customerList) {
            System.out.println(customer.showInfo());
        }
    }

    @Override
    public void displayList() {
        for(int index = 0; index < showCustomerInfoList.size(); index++) {
            System.out.println((index +1)+". "+ showCustomerInfoList.get(index).name);
        }
    }
}
