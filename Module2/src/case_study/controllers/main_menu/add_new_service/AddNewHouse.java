package case_study.controllers.main_menu.add_new_service;

import case_study.controllers.main_menu.AddNewService;
import case_study.models.services_maker.ServicesMaker;

import java.util.ArrayList;
import java.util.List;

public class AddNewHouse extends AddNewService {
    public static List<AddNewVilla> menuList = new ArrayList<>();

    public AddNewHouse() {
        this.name = "Add New House";
        AddNewService.menuList.add(this);
    }

    @Override
    public void displayList() {
        for(int index = 0; index < menuList.size(); index++) {
            System.out.println((index +1)+". "+ menuList.get(index).name);
        }
    }

    @Override
    public void execute() {
        ServicesMaker.newHouse();
        displayList();
    }
}
