package case_study.controllers.main_menu.add_new_service;

import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.AddNewService;
import case_study.models.maker.ServicesMaker;

import java.util.ArrayList;
import java.util.List;

public class AddNewVilla extends AddNewService {
    public static List<MainMenu> addNewVillaList = new ArrayList<>();

    public AddNewVilla() {
        this.name = "Add New Villa";
    }

    @Override
    public void displayList() {
        showMenu(addNewVillaList);
    }

    @Override
    public void execute() {
        ServicesMaker.newVilla();
        displayList();
    }
}
