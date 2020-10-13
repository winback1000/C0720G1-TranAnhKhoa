package case_study.controllers;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DisplayMenu {
public static Stack<MainMenu> back = new Stack<>();

    public static void showMenu(List<MainMenu> list) {

        Scanner scr = new Scanner(System.in);
        boolean correct;
        int selected = 0;
        do {
            correct = true;
            for (int index = 0; index < list.size(); index++) {
                System.out.println((index + 1) + ". " + list.get(index).getName());
            }
            System.out.println("Please select an option");
            try {
                selected = Integer.parseInt(scr.nextLine());
                if (selected<=0 || selected > list.size()) {
                    System.out.println("incorrect input, please try again");
                    correct = false;
                }
            } catch (Exception e) {
                System.out.println("incorrect input, please try again");
                correct = false;
            }
        } while(!correct);
        back.add(list.get(selected-1));
        list.get(selected-1).execute();
    }
}
