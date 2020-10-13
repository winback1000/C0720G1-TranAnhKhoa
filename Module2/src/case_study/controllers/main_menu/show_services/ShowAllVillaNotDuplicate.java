package case_study.controllers.main_menu.show_services;

import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.ShowServices;

import case_study.models.service.Villa;

import java.util.ArrayList;
import java.util.List;

public class ShowAllVillaNotDuplicate extends ShowServices {
    public static List<MainMenu> showAllVillaNotDuplicateList = new ArrayList<>();
    public ShowAllVillaNotDuplicate() {
        this.name = "Show all villas not duplicate";
    }

    @Override
    public void displayList() {
        showMenu(showAllVillaNotDuplicateList);
    }

    @Override
    public void execute() {
        for (String name: Villa.villaNameList) {
            System.out.println(name);
        }
        displayList();
    }
}
