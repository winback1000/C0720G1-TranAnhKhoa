package case_study.controllers.main_menu;

import case_study.controllers.Executor;
import case_study.controllers.MainMenu;
import case_study.models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShowInfoOfEmployee extends MainMenu {
    public static List<ShowInfoOfEmployee> menuList = new ArrayList<>();

    public ShowInfoOfEmployee() {
        this.name = "Show Employee info";
        MainMenu.menuList.add(this);
    }

    @Override
    public void displayList() {
        for(int index = 0; index < menuList.size(); index++) {
            System.out.println((index +1)+". "+ menuList.get(index).name);
        }
    }

    @Override
    public void execute() {
        for (Map.Entry<String, Employee> e: Employee.employeeMap.entrySet()) {
            System.out.println(e.getValue().showInfo());
        }
        displayList();
    }
}
