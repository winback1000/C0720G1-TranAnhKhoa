package _14_searching_algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IncrementString {
    static List<String> arr = new ArrayList<>();
    static Integer left = 0;
    static int getRight() {
        return arr.size()-1;
    }

    static void sortArr(List<String> array,Integer left, Integer right, String str){
        int mid = left+(right-left)/2;
        if (array.size() == 0) {
            array.add(str);
        }
        if (right.equals(left)) {
            if( str.length() <= array.get(left).length()) {
                array.add(left,str);
            } else {
                array.add(mid + 1, str);
            }
        }  else {
            if (str.length() > array.get(mid).length()) {
                sortArr(array,mid+1,right,str);
            } else {
                sortArr(array,left,mid,str);
            }
        }
    }
    public static void main(String[] args) {
        displayMainMenu();


    }

    private static void displayMainMenu() {
        System.out.println("1. input string");
        System.out.println("2. display list");
        System.out.println("3. Exit");
        System.out.println("please select your option");
        Scanner scr = new Scanner(System.in);
        int selection = Integer.parseInt(scr.nextLine());
        switch (selection) {
            case 1:
                System.out.println("please input the string");
                String temp = scr.nextLine();
                sortArr(arr, left, getRight(), temp );
                displayMainMenu();
                break;
            case 2:
                for (String str: arr) {
                    System.out.println(str);
                }
                displayMainMenu();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("invalid option, please input again");
                displayMainMenu();
        }
    }
}
