package case_study.controllers.main_menu.add_new_service;

import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.AddNewService;
import case_study.models.maker.ServicesMaker;

import java.util.ArrayList;
import java.util.List;

public class AddNewRoom extends AddNewService {
    public static List<MainMenu> addNewRoomList = new ArrayList<>();

    public AddNewRoom() {
        this.name = "Add New Room";
    }

    @Override
    public void displayList() {
        showMenu(addNewRoomList);
    }

    @Override
    public void execute() {
        ServicesMaker.newRoom();
        displayList();
    }
}
