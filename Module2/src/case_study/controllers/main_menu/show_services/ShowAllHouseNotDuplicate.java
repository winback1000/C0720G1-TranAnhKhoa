package case_study.controllers.main_menu.show_services;


import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.ShowServices;
import case_study.models.House;

import java.util.ArrayList;
import java.util.List;


public class ShowAllHouseNotDuplicate extends ShowServices {
    public static List<MainMenu> showAllHouseNotDuplicateList = new ArrayList<>();

    public ShowAllHouseNotDuplicate() {
        this.name = "Show all house not duplicate";
    }

    @Override
    public void displayList() {
        showMenu(showAllHouseNotDuplicateList);
    }

    @Override
    public void execute() {
        for (String name: House.houseNameList) {
            System.out.println(name);
        }
        displayList();
    }
}
