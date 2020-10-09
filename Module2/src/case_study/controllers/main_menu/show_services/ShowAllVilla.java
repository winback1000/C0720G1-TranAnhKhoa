package case_study.controllers.main_menu.show_services;

import case_study.controllers.main_menu.ShowServices;
import case_study.models.Villa;

public class ShowAllVilla extends ShowServices {
    public ShowAllVilla() {
        this.name = "Show all villas";
        ShowServices.menuList.add(this);
    }

    @Override
    public void displayList() {
        showMenu(ShowServices.menuList);
    }

    @Override
    public void execute() {
        for (Villa vl: Villa.villaList) {
            System.out.println(vl.showInfo());
        }
        displayList();
    }
}
