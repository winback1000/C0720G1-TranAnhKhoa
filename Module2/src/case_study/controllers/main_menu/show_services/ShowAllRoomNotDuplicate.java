package case_study.controllers.main_menu.show_services;

import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.ShowServices;
import case_study.models.Room;

import java.util.ArrayList;
import java.util.List;

public class ShowAllRoomNotDuplicate extends ShowServices {
    public static List<MainMenu> showAllRoomNotDuplicateList = new ArrayList<>();

    public ShowAllRoomNotDuplicate() {
        this.name = "Show all rooms not duplicate";
    }

    @Override
    public void displayList() {
        showMenu(showAllRoomNotDuplicateList);
    }

    @Override
    public void execute() {
        for (String name: Room.roomNameList) {
            System.out.println(name);
        }
        displayList();
    }
}
