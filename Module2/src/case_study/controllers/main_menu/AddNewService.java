package case_study.controllers.main_menu;

import case_study.controllers.MainMenu;

import java.util.ArrayList;
import java.util.List;

public class AddNewService extends MainMenu   {
    public static List<MainMenu> addNewServiceList = new ArrayList<>();


    public AddNewService() {
        this.name = "Add New Service";
    }

    public void displayList() {
        showMenu(addNewServiceList);
    }

    public void execute() {
        displayList();
    }
}
