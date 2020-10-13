package case_study.controllers.main_menu;

import case_study.controllers.MainMenu;
import case_study.models.human.Employee;

import java.util.Stack;

import static case_study.common.ShowList.scr;
import static case_study.models.human.Employee.employeeList;

public class SearchEmployeeProfile extends MainMenu {
    public SearchEmployeeProfile() {
        this.name = "Search employee profile in cabinet";
    }
    public static void searchInCabinet() {
        System.out.println("Please input the name for searching");
        String tempName = scr.nextLine();
        Stack<Employee> profileCabinet = new Stack<>();
        for (Employee e: employeeList) {
            profileCabinet.push(e);
        }
        boolean found = false;
        while(profileCabinet.size()>0) {
            if(profileCabinet.peek().getName().equals(tempName)) {
                System.out.println(profileCabinet.pop().showInfo());
                found = true;
            }
        }
        if(!found) {
            System.out.println("No employee match that name");
        }
    }

    @Override
    public void execute() {
        searchInCabinet();
        super.execute();
    }
}
