package case_study.controllers.main_menu.add_new_service;

import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.AddNewService;
import case_study.models.maker.ServicesMaker;

import java.util.ArrayList;
import java.util.List;

public class AddNewHouse extends AddNewService {
    public static List<MainMenu> menuList = new ArrayList<>();

    public AddNewHouse() {
        this.name = "Add New House";
        AddNewService.menuList.add(this);
    }

    @Override
    public void displayList() {
        showMenu(menuList);
    }

    @Override
    public void execute() {
        ServicesMaker.newHouse();
        displayList();
    }
}
