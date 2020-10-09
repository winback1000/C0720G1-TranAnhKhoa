package case_study.controllers.main_menu.show_services;


import case_study.controllers.main_menu.ShowServices;
import case_study.models.House;



public class ShowAllHouseNotDuplicate extends ShowServices {

    public ShowAllHouseNotDuplicate() {
        this.name = "Show all house not duplicate";
        ShowServices.menuList.add(this);
    }

    @Override
    public void displayList() {
        showMenu(ShowServices.menuList);
    }

    @Override
    public void execute() {
        for (String name: House.houseNameList) {
            System.out.println(name);
        }
        displayList();
    }
}
