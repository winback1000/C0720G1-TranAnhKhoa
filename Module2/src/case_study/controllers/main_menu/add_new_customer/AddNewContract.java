package case_study.controllers.main_menu.add_new_customer;

import case_study.common.Validator;
import case_study.controllers.MainMenu;
import case_study.controllers.main_menu.AddNewCustomer;
import case_study.models.Contract;

import java.util.ArrayList;
import java.util.List;

import static case_study.common.ShowList.scr;


public class AddNewContract extends AddNewCustomer {
    public static List<MainMenu> addNewContractList = new ArrayList<>();

    public AddNewContract() {
        this.name = "Add new contract";
    }

    @Override
    public void displayList() {
        showMenu(addNewContractList);
    }

    @Override
    public void execute() {
        newContract();
        displayList();
    }

    public static String startDate = null;
    public static String endDate = null;
    public static double deposit = 0;
    public static double totalCost = 0;

    public static void newContract() {
        getStartDate();
        getEndDate();
        getDeposit();
        getTotalCost();
        new Contract(startDate,endDate,deposit,totalCost);
    }

    public static void getStartDate() {
        String temp;
        boolean correct;
        do {
            correct = true;
            System.out.println("Please input the start day: ");
            temp = scr.nextLine();
            try {
                Validator.isValidDate(temp, Validator.DOB_CHECKING);
            } catch (Exception e) {
                System.out.println("invalid input, please try again");
                correct = false;
            }
        } while (!correct);
        startDate = temp;
    }

    public static void getEndDate() {
        String temp;
        boolean correct ;
        do {
            correct = true;
            System.out.println("Please input the end day: ");
            temp = scr.nextLine();
            try {
                Validator.isValidDate(temp, Validator.DOB_CHECKING);
            } catch (Exception e) {
                System.out.println("invalid input, please try again");
                correct = false;
            }
        } while (!correct);
        endDate = temp;
    }

    public static void getDeposit() {
        deposit = Validator.getDoubleValue("Please input the deposit :",0);
     }

    public static void getTotalCost() {
        totalCost = Validator.getDoubleValue("Please input the total cost:", 1);
    }

}
