package case_study.controllers.main_menu.show_services;

import case_study.models.Services;

import java.util.List;
import java.util.Scanner;

public class ShowAllServices {
    static Scanner scr = new Scanner(System.in);
    public static int selection;
    public static String NameSelection(List<Services> list) {
        SelectFromList(list);
        return list.get(selection-1).getName();
    }
    public static String IdSelection(List<Services> list) {
        SelectFromList(list);
        return list.get(selection-1).getId();
    }

    public static void SelectFromList(List<Services> list) {
        boolean correct = true;
        do {
            System.out.println("Please select a service");
            try {
                selection = Integer.parseInt(scr.nextLine());
                if (selection<0 || selection > list.size()) {
                    System.out.println("incorrect input, please try again");
                    correct = false;
                }
            } catch (Exception e) {
                System.out.println("incorrect input, please try again");
                correct = false;
            }
        } while(!correct);
    }

    public static void showList(List<Services> list) {
        for (int index = 0; index < list.size(); index++) {
            System.out.println((index + 1) + ". " + list.get(index).getName());
        }
    }
}
