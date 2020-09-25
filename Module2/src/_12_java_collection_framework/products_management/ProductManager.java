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
    static int tempIndex;
    static ArrayList<Product> filterList = new ArrayList<>();

    public static void mainMenu() {
        System.out.println("1. Add product \n2. Edit product\n3. Delete product\n4. Display list\n5. Search product\n6. Sort by");
        int selection = scanner.nextInt();
        switch (selection) {
            case 1:
                getInfo();
                addProduct(tempName, tempPrice, tempManufacturer);
                displayList();
                mainMenu();
                break;
            case 2:
                System.out.println("pls search the product you want to edit");
                searchProductSubMenu();
                getInfo();
                editProduct(tempName, tempPrice,tempManufacturer,tempIndex);
                displayList();
                mainMenu();
                break;
            case 3:
                System.out.println("pls select the product you want to delete");
                searchProductSubMenu();
                productList.remove(tempIndex);
                displayList();
                mainMenu();
                break;
            case 4:
                displayList();
                mainMenu();
                break;
            case 5:
                searchProductSubMenu();

        }
    }

        public static void getInfo () {
            System.out.print("Please input product's name\n");
            scanner.nextLine();
            tempName = scanner.nextLine();
            System.out.println("please input the manufacturer");
            tempManufacturer = scanner.nextLine();
            System.out.println("Please input the price");
            tempPrice = scanner.nextFloat();

        }
        public static void addProduct (String name, Float price, String manufacturer){
            productList.add(new Product(name, price, manufacturer));
        }
        public static void editProduct (String name, Float price, String manufacturer, int index){
            productList.get(index).setName(name);
            productList.get(index).setPrice(price);
            productList.get(index).setManufacturer(manufacturer);
        }
        public static void searchProductSubMenu() {
            System.out.println("1. By ID\n2. By Name\n3. By price\n4. By Manufacturer");
            byte selection = scanner.nextByte();
            switch (selection) {
                case 1:
                    System.out.print("please enter ID\n");
                    tempId = scanner.nextLine();
                    searchById(tempId);
                    break;
                case 2:
                    System.out.println("please enter product's name");
                    tempName = scanner.nextLine();
                    for (Product prd: productList) {
                        if(prd.getName().equals(tempName)) {
                            filterList.add(prd);

                        }
                    }

            }
        }
            public static void searchById (String id){
                for (int i = 0; i < productList.size(); i++) {
                    if (productList.get(i).idProduct.equals(id)) {
                        tempIndex = i;
                    }
                }

            }

        public static void displayList () {
            for (Product prd: productList) {
                System.out.println(prd);
            }
        }
    }



