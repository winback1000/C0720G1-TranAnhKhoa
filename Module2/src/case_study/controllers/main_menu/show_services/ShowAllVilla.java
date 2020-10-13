package case_study.controllers.main_menu.show_services;

import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.ShowServices;
import case_study.models.service.Services;
import case_study.models.service.Villa;

import java.util.ArrayList;
import java.util.List;

public class ShowAllVilla extends ShowServices {

    public static List<MainMenu> showAllVillaList = new ArrayList<>();
    public ShowAllVilla() {
        this.name = "Show all villas";
    }

    @Override
    public void displayList() {
        showMenu(showAllVillaList);
    }

    @Override
    public void execute() {
        for (Services sv: Villa.villaList) {
            System.out.println(sv.showInfo());
        }
        displayList();
    }
}
