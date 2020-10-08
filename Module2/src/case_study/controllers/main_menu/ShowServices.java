package case_study.controllers.main_menu;

import case_study.controllers.MainMenu;

import java.util.ArrayList;
import java.util.List;

public class ShowServices extends MainMenu {
    public static List<ShowServices> menuList = new ArrayList<>();

    public ShowServices() {
        this.name = "Show service";
        MainMenu.menuList.add(this);
    }

    @Override
    public void displayList() {
        for(int index = 0; index < menuList.size(); index++) {
            System.out.println((index +1)+". "+ menuList.get(index).name);
        }
    }
}
