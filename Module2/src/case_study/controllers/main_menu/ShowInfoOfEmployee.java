package case_study.controllers.main_menu;

import case_study.controllers.MainMenu;
import case_study.models.human.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShowInfoOfEmployee extends MainMenu {
    public static List<MainMenu> showInfoOfEmployeeList = new ArrayList<>();

    public ShowInfoOfEmployee() {
        this.name = "Show Employee info";
    }

    @Override
    public void displayList() {
        showMenu(showInfoOfEmployeeList);
    }

    @Override
    public void execute() {
        for (Map.Entry<String, Employee> e: Employee.employeeMap.entrySet()) {
            System.out.println(e.getValue().showInfo());
        }
        displayList();
    }
}
