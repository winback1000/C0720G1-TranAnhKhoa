package case_study.controllers.main_menu.show_services;


import case_study.controllers.main_menu.ShowServices;
import case_study.models.House;


public class ShowAllHouse extends ShowServices {

    public ShowAllHouse() {
        this.name = "Show all houses";
        ShowServices.menuList.add(this);
    }

    @Override
    public void displayList() {
        showMenu(ShowServices.menuList);
    }

    @Override
    public void execute() {
        for (House house: House.houseList) {
            System.out.println(house.showInfo());
        }
        displayList();
    }
}
