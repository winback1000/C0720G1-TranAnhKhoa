package case_study.common;

import case_study.models.Contract;
import case_study.models.Customer;
import case_study.models.Services;
import case_study.models.UtilitiesServices;

import java.util.List;
import java.util.Scanner;

public class ShowList {
    public static Scanner scr = new Scanner(System.in);
    public static int selection;

    public static String idSelection(List<Services> list) {
        SelectFromList(list);
        return list.get(selection-1).getId();
    }
    public static Services serviceSelection(List<Services> list) {
        SelectFromList(list);
        return list.get(selection-1);
    }
    public static Customer customerSelection(List<Customer> list) {
        SelectFromList(list);
        return list.get(selection-1);
    }

    public static void SelectFromList(List<?> list) {
        boolean correct;
        do {
            correct = true;
            System.out.println("Please select an option");
            try {
                selection = Integer.parseInt(scr.nextLine());
                if (selection<0 || selection > list.size()) {
                    System.out.println("incorrect input, please try again");
                    correct = false;
                }
            } catch (Exception e) {
                System.out.println("Number is required, please try again");
                correct = false;
            }
        } while(!correct);
    }

    public static void showContractList(List<Contract> list) {
        for (int index = 0; index < list.size(); index++) {
            System.out.println((index + 1) + ". " + list.get(index).showInfo());
        }
    }
    public static void showCustomerList(List<Customer> list) {
        for (int index = 0; index < list.size(); index++) {
            System.out.println((index + 1) + ". " + list.get(index).showInfo());
        }
    }
    public static void showListUtilities(List<UtilitiesServices> list) {
        for (int index = 0; index < list.size(); index++) {
            System.out.println((index + 1) + ". " + list.get(index).showInfo());
        }
    }
    public static void showServicesList(List<Services> list) {
        for (int index = 0; index < list.size(); index++) {
            System.out.println((index + 1) + ". " + list.get(index).getName());
        }
    }
    
}
