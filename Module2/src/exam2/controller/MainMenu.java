package exam2.controller;

import exam2.exception.NotFoundProductException;
import exam2.models.ExportProduct;
import exam2.models.ImportProduct;

import java.util.Scanner;


import static exam2.models.ExportProduct.exportProductList;
import static exam2.models.ImportProduct.importProductList;

public class MainMenu {
    static Scanner scr = new Scanner(System.in);

    public static void mainMenu() {
        System.out.println("1. Add new product");
        System.out.println("2. Delete a product");
        System.out.println("3. Show products list");
        System.out.println("4. Search for a product");
        System.out.println("5. Exit");
        System.out.println("Please select an option : ");
        String selection = scr.nextLine();
        switch (selection) {
            case "1":
                AddNewProduct.addProductMenu();
                mainMenu();
                break;
            case "2":
                try {
                    DeleteProduct.deleteProductMenu();
                } catch (NotFoundProductException e) {
                    e.printStackTrace();
                    mainMenu();
                }
                mainMenu();
                break;
            case "3":
                System.out.println("Import Products:");
                for (ImportProduct imp : importProductList) {
                    System.out.println(imp.showInfo());
                }
                System.out.println("Export Products: ");
                for (ExportProduct exp : exportProductList) {
                    System.out.println(exp.showInfo());
                }
                mainMenu();
                break;
            case "4":
                System.out.println("Please input the production code or name");
                String searchInfo = scr.nextLine();
                for (ImportProduct imp : importProductList) {
                    if (imp.getProductCode().contains(searchInfo) || imp.getName().contains(searchInfo)) {
                        System.out.println(imp.showInfo());
                    }
                }
                for (ExportProduct exp : exportProductList) {
                    if (exp.getProductCode().contains(searchInfo) || exp.getName().contains(searchInfo)) {
                        System.out.println(exp.showInfo());
                    }
                }
                mainMenu();
                break;
            case "5":
                System.exit(0);
            default:
                System.out.println("Invalid option, please try again");
                mainMenu();
        }
    }
}
