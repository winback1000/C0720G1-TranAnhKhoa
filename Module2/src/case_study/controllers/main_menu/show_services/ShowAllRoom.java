package case_study.controllers.main_menu.show_services;

import case_study.controllers.main_menu.ShowServices;
import case_study.models.Room;


public class ShowAllRoom extends ShowServices {

    public ShowAllRoom() {
        this.name = "Show all rooms";
        ShowServices.menuList.add(this);
    }

    @Override
    public void displayList() {
        showMenu(ShowServices.menuList);
    }

    @Override
    public void execute() {
        for (Room ro: Room.roomList) {
            System.out.println(ro.showInfo());
        }
        displayList();
    }
}
