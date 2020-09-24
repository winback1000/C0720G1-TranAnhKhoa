package _12_java_collection_framework.products_management;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> productList = new ArrayList<>();
    static String tempName;
    static String tempManufacturer;
    static Float tempPrice;
    static String tempId;
    static Integer tempIndex;

    public static void mainMenu() {
        System.out.println("1. Add product \n2. Edit product\n3. Delete product\n4. Display list\n5. Search product\n6. Sort by");
    }

    public static void getInfo(){
        System.out.print("Please input product's name\n");
        scanner.nextLine();
        tempName = scanner.nextLine();
        System.out.println("please input the manufacturer");
        tempManufacturer = scanner.nextLine();
        System.out.println("Please input the price");
        tempPrice = scanner.nextFloat();

    }
    public static void addProduct(String name, Float price, String manufacturer) {
        productList.add(new Product(name,price,manufacturer));
    }
    public static void editProduct(String name, Float price, String manufacturer, Integer index){
        productList.get(index).setName(name);
        productList.get(index).setPrice(price);
        productList.get(index).setManufacturer(manufacturer);
    }
    public static void searchProduct () {
        System.out.println("1. By ID\n2. By Name\n3. By price\n4. By Manufacturer");
        Byte selection = scanner.nextByte();
        switch (selection){
            case 1:
                System.out.println("please enter ID");
                tempId = scanner.nextLine();
        }

    }
    public static void displayList() {
        System.out.println(productList);
    }

    public static void main(String[] args) {

       mainMenu();
       int selection = scanner.nextInt();
       switch (selection){
           case 1:
               getInfo();
               addProduct(tempName, tempPrice, tempManufacturer);
               displayList();
               mainMenu();
               break;
           case 2:
               System.out.println("pls search the product you want to edit");
               searchProduct();


       }

    }
}
