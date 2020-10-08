package case_study.controllers;

import java.util.ArrayList;
import java.util.List;

public class MainMenu implements DisplayList {
    public static List<MainMenu> mainMenuList = new ArrayList<>();
    public String name;

    @Override
    public void displayList() {
        for(int index = 0; index < mainMenuList.size(); index++) {
            System.out.println((index +1)+". "+ mainMenuList.get(index).name);
        }
    }
}
