package case_study.controllers;

import java.util.ArrayList;
import java.util.List;

public class MainMenu implements DisplayList, Executor {
    public static List<MainMenu> menuList = new ArrayList<>();
    public String name;

    @Override
    public void displayList() {
        for(int index = 0; index < menuList.size(); index++) {
            System.out.println((index +1)+". "+ menuList.get(index).name);
        }
    }

    @Override
    public void execute() {
        displayList();
    }
}
