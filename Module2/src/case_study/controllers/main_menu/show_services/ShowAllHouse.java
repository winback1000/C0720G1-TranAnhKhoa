package case_study.controllers.main_menu.show_services;


import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.ShowServices;
import case_study.models.House;
import case_study.models.Services;

import java.util.ArrayList;
import java.util.List;


public class ShowAllHouse extends ShowServices {
    public static List<MainMenu> showAllHouseList = new ArrayList<>();

    public ShowAllHouse() {
        this.name = "Show all houses";
    }

    @Override
    public void displayList() {
        showMenu(showAllHouseList);
    }

    @Override
    public void execute() {
        for (Services sv: House.houseList) {
            System.out.println(sv.showInfo());
        }
        displayList();
    }
}
