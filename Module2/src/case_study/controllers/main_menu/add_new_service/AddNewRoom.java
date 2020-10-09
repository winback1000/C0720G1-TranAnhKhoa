package case_study.controllers.main_menu.add_new_service;

import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.AddNewService;
import case_study.models.maker.ServicesMaker;

import java.util.ArrayList;
import java.util.List;

public class AddNewRoom extends AddNewService {
    public static List<MainMenu> menuList = new ArrayList<>();

    public AddNewRoom() {
        this.name = "Add New Room";
        AddNewService.menuList.add(this);
    }

    @Override
    public void displayList() {
        showMenu(menuList);
    }

    @Override
    public void execute() {
        ServicesMaker.newRoom();
        displayList();
    }
}
