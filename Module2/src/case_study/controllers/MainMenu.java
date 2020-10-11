package case_study.controllers;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends DisplayMenu {
    public static List<MainMenu> mainMenuList = new ArrayList<>();
    public String name;

    public void displayList() {
        showMenu(mainMenuList);
    }

    public String getName() {
        return name;
    }


    public void execute() {
        displayList();
    }
}
