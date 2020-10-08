package case_study.controllers.main_menu;

import case_study.controllers.MainMenu;

import java.util.ArrayList;
import java.util.List;

public class AddNewService extends MainMenu {
    public static List<AddNewService> addNewServiceList = new ArrayList<>();

    public AddNewService() {
        this.name = "Add New Service";
        mainMenuList.add(this);
    }

    @Override
    public void displayList() {
        for(int index =0; index < addNewServiceList.size(); index++) {
            System.out.println((index +1)+". "+addNewServiceList.get(index).name);
        }
    }
}
