package exam2.controller;

import exam2.common.FilePath;
import exam2.exception.NotFoundProductException;
import exam2.common.Writer;
import exam2.models.ExportProduct;
import exam2.models.ImportProduct;

import java.util.Scanner;


import static exam2.controller.MainMenu.mainMenu;
import static exam2.models.ExportProduct.exportProductList;
import static exam2.models.ImportProduct.importProductList;

public class DeleteProduct implements FilePath {
    static Scanner scr = new Scanner(System.in);

    public static void deleteProductMenu() throws NotFoundProductException {
        int index = -1;
        int tempId = 0;
        try {
            System.out.println("Please input the product id :");
            tempId = Integer.parseInt(scr.nextLine());
        } catch (Exception e) {
            System.out.println("Invalid option, please try again");
            deleteProductMenu();
        }
        System.out.println("1. Import products");
        System.out.println("2. Export products");
        String selection = scr.nextLine();
        switch (selection) {
            case "1":
                for (int i = 0; i < importProductList.size(); i++) {
                    if (importProductList.get(i).getId() == tempId) {
                        index = i;
                        System.out.println(importProductList.get(i).showInfo());
                    }
                }
                if (index != -1) {
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String selected = scr.nextLine();
                    switch (selected) {
                        case "1":
                            importProductList.remove(index);
                            Writer.csvWriter(IMPORT_PRODUCT_PATH, importProductList);
                            for (ImportProduct imp : importProductList) {
                                System.out.println(imp.showInfo());
                            }
                            break;
                        case "2":
                            mainMenu();
                            break;
                        default:
                            System.out.println("invalid option");
                            deleteProductMenu();
                    }
                } else {
                    throw new NotFoundProductException("This product is not valid");
                }
            case "2":
                for (int i = 0; i < exportProductList.size(); i++) {
                    if (exportProductList.get(i).getId() == tempId) {
                        index = i;
                        System.out.println(exportProductList.get(i).showInfo());
                    }
                }
                if (index != -1) {
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    String selected = scr.nextLine();
                    switch (selected) {
                        case "1":
                            exportProductList.remove(index);
                            Writer.csvWriter(EXPORT_PRODUCT_PATH, exportProductList);
                            for (ExportProduct exp : exportProductList) {
                                System.out.println(exp.showInfo());
                            }
                            break;
                        case "2":
                            mainMenu();
                            break;
                        default:
                            System.out.println("invalid option");
                            deleteProductMenu();
                    }
                } else {
                    throw new NotFoundProductException("This product is not valid");
                }
            default:
                System.out.println("This option is not valid");
                deleteProductMenu();
        }
    }
}
