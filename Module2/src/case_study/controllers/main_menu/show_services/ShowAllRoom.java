package case_study.controllers.main_menu.show_services;

import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.ShowServices;
import case_study.models.service.Room;
import case_study.models.service.Services;

import java.util.ArrayList;
import java.util.List;


public class ShowAllRoom extends ShowServices {
    public static List<MainMenu> showAllRoomList = new ArrayList<>();

    public ShowAllRoom() {
        this.name = "Show all rooms";
    }

    @Override
    public void displayList() {
        showMenu(showAllRoomList);
    }

    @Override
    public void execute() {
        for (Services sv: Room.roomList) {
            System.out.println(sv.showInfo());
        }
        displayList();
    }
}
