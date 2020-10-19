package exam2.controller;


import exam2.common.FilePath;
import exam2.common.Validate;
import exam2.common.Writer;
import exam2.models.ExportProduct;
import exam2.models.ImportProduct;

import java.util.Scanner;

import static exam2.models.ExportProduct.exportProductList;
import static exam2.models.ImportProduct.importProductList;

public class AddNewProduct implements FilePath {
    public static Scanner scr = new Scanner(System.in);

    static String productCode;
    static String name;
    static double price;
    static int quantity;
    static String manufacturer;

    static double importPrice;
    static String importProvince;
    static double importTax;

    static double exportPrice;
    static String exportCountry;

    public static void newImportProduct() {
        setProductCode();
        setName();
        setPrice();
        setQuantity();
        setManufacturer();
        setImportPrice();
        setImportProvince();
        setImportTax();
        new ImportProduct(productCode,name,price,quantity,manufacturer,importPrice,importProvince,importTax);
        Writer.csvWriter(IMPORT_PRODUCT_PATH, importProductList);
    }
    public static void newExportProduct() {
        setProductCode();
        setName();
        setPrice();
        setQuantity();
        setManufacturer();
        setExportPrice();
        setExportCountry();
        new ExportProduct(productCode,name,price,quantity,manufacturer,exportPrice,exportCountry);
        Writer.csvWriter(EXPORT_PRODUCT_PATH, exportProductList);
    }

    public static void setName() {
        String temp;
        boolean corrected;
        do {
            System.out.println("Please input name");
            temp = scr.nextLine();
            corrected = Validate.isValidString(temp);
        } while (!corrected);
        name = temp;
    }
    public static void setProductCode() {
        String temp;
        boolean corrected;
        do {
            System.out.println("Please input product code");
            temp = scr.nextLine();
            corrected = Validate.isValidString(temp);
        } while (!corrected);
        productCode = temp;
    }
    public static void setPrice() {
        double temp;
        boolean corrected;
        do {
            System.out.println("Please input the price larger than 0");
            temp = Double.parseDouble(scr.nextLine());
            corrected = Validate.isValidPrice(temp);
        } while (!corrected);
        price = temp;
    }

    public static void setQuantity() {
        int temp;
        boolean corrected;
        do {
            System.out.println("Please input the quantity larger than 0");
            temp = Integer.parseInt(scr.nextLine());
            corrected = Validate.isValidQuantity(temp);
        } while (!corrected);
        quantity = temp;
    }
    public static void setManufacturer() {
        String temp;
        boolean corrected;
        do {
            System.out.println("Please input manufacturer name");
            temp = scr.nextLine();
            corrected = Validate.isValidString(temp);
        } while (!corrected);
        manufacturer = temp;
    }
    public static void setImportPrice() {
        double temp;
        boolean corrected;
        do {
            System.out.println("Please input the import price larger than 0");
            temp = Double.parseDouble(scr.nextLine());
            corrected = Validate.isValidPrice(temp);
        } while (!corrected);
        importPrice = temp;
    }
    public static void setImportProvince() {
        String temp;
        boolean corrected;
        do {
            System.out.println("Please input the import province");
            temp = scr.nextLine();
            corrected = Validate.isValidString(temp);
        } while (!corrected);
        importProvince = temp;
    }
    public static void setImportTax() {
        double temp;
        boolean corrected;
        do {
            System.out.println("Please input the import tax larger than 0");
            temp = Double.parseDouble(scr.nextLine());
            corrected = Validate.isValidPrice(temp);
        } while (!corrected);
        importTax = temp;
    }
    public static void setExportPrice() {
        double temp;
        boolean corrected;
        do {
            System.out.println("Please input the export price larger than 0");
            temp = Double.parseDouble(scr.nextLine());
            corrected = Validate.isValidPrice(temp);
        } while (!corrected);
        exportPrice = temp;
    }
    public static void setExportCountry() {
        String temp;
        boolean corrected;
        do {
            System.out.println("Please input the export country");
            temp = scr.nextLine();
            corrected = Validate.isValidString(temp);
        } while (!corrected);
        exportCountry = temp;
    }
    public static void addProductMenu(){
        System.out.println("1. Add an import product");
        System.out.println("2. Add an export product");
        String selection = scr.nextLine();
        switch (selection) {
            case "1":
                newImportProduct();
                break;
            case "2":
                newExportProduct();
                break;
            default:
                System.out.println("Invalid selection, please select again");
                addProductMenu();
        }
    }
}

