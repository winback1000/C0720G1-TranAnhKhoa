package case_study.controllers.main_menu.add_new_service;

import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.AddNewService;
import case_study.models.maker.ServicesMaker;

import java.util.ArrayList;
import java.util.List;

public class AddUtilitiesService extends AddNewService {
    public static List<MainMenu> addUtilitiesServiceList = new ArrayList<>();

    public AddUtilitiesService() {
        this.name = "Add New Utility service";
    }

    @Override
    public void displayList() {
        showMenu(addUtilitiesServiceList);
    }

    @Override
    public void execute() {
        ServicesMaker.newUtilityService();
        displayList();
    }
}
