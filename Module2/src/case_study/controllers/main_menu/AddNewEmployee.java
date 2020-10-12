package case_study.controllers.main_menu;

import case_study.controllers.MainMenu;
import case_study.models.maker.HumanMaker;

public class AddNewEmployee extends MainMenu {
    public AddNewEmployee() {
        this.name = "Add new employee";
    }

    @Override
    public void displayList() {
        super.displayList();
    }

    @Override
    public void execute() {
        HumanMaker.addNewEmployee();
        super.execute();
    }
}
