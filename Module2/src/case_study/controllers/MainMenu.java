package case_study.controllers;

import java.util.ArrayList;
import java.util.List;

public class MainMenu extends DisplayMenu implements DisplayList, Executor {
    public static List<MainMenu> menuList = new ArrayList<>();
    public String name;

    @Override
    public void displayList() {
        showMenu(menuList);
    }

    public String getName() {
        return name;
    }

    @Override
    public void execute() {
        displayList();
    }
}
