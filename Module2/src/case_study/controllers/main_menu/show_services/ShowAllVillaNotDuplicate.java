package case_study.controllers.main_menu.show_services;

import case_study.controllers.main_menu.ShowServices;

import case_study.models.Villa;

public class ShowAllVillaNotDuplicate extends ShowServices {

    public ShowAllVillaNotDuplicate() {
        this.name = "Show all villas not duplicate";
        ShowServices.menuList.add(this);
    }

    @Override
    public void displayList() {
        showMenu(ShowServices.menuList);
    }

    @Override
    public void execute() {
        for (String name: Villa.villaNameList) {
            System.out.println(name);
        }
        displayList();
    }
}
