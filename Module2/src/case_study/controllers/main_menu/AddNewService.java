package case_study.controllers.main_menu;

import case_study.controllers.MainMenu;

import java.util.ArrayList;
import java.util.List;

public class AddNewService extends MainMenu   {
    public static List<MainMenu> menuList = new ArrayList<>();

    public AddNewService() {
        this.name = "Add New Service";
        MainMenu.menuList.add(this);
    }

    @Override
    public void displayList() {
        showMenu(menuList);
    }

    @Override
    public void execute() {
        displayList();
    }
}
