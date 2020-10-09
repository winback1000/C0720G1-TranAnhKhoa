package case_study.controllers.main_menu;

import case_study.controllers.MainMenu;

import java.util.ArrayList;
import java.util.List;

public class ShowServices extends MainMenu {
    public static List<MainMenu> menuList = new ArrayList<>();

    public ShowServices() {
        this.name = "Show service";
        MainMenu.menuList.add(this);
    }

    @Override
    public void displayList() {
        showMenu(menuList);
    }
}
