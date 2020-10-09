package case_study.controllers.main_menu.show_services;

import case_study.controllers.main_menu.ShowServices;
import case_study.models.Room;

public class ShowAllRoomNotDuplicate extends ShowServices {

    public ShowAllRoomNotDuplicate() {
        this.name = "Show all rooms not duplicate";
        ShowServices.menuList.add(this);
    }

    @Override
    public void displayList() {
        showMenu(ShowServices.menuList);
    }

    @Override
    public void execute() {
        for (String name: Room.roomNameList) {
            System.out.println(name);
        }
        displayList();
    }
}
