package _12_java_collection_framework.products_management;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> productList = new ArrayList<>();
    static String tempName;
    static String tempManufacturer;
    static Float tempPrice;
    static String tempId;
    static ArrayList<Product> filterList = new ArrayList<>();
    static ArrayList<String> searchMenu = new ArrayList<>();

    public static void resetSearchMenu() {
        searchMenu.clear();
        searchMenu.add(0,"1. Filter by ID");
        searchMenu.add(1,"2. Filter by Name");
        searchMenu.add(2,"3. Filter by Price");
        searchMenu.add(3,"4. Filter by Manufacturer");
        searchMenu.add(4,"5. Edit");
        searchMenu.add(5,"6. Delete");
        searchMenu.add(6,"7. Reset filter");
        searchMenu.add(7,"8. Main menu");
        filterList.clear();
        filterList.addAll(productList);
    }

    public static void mainMenu() {
        System.out.println("1. Add product \n2. Display list\n3. Search product\n4. Sort by");
        int selection = Integer.parseInt(scanner.nextLine());
        switch (selection) {
            case 1:
                getInfo();
                addProduct(tempName, tempPrice, tempManufacturer);
                displayList();
                mainMenu();
                break;
            case 2:
                displayList();
                mainMenu();
                break;
            case 3:
                searchProductMenu();
                break;
            case 4:
                sortMenu();
                break;
            default:
                System.out.println("Invalid option");
                mainMenu();
        }
    }

    private static void sortMenu() {
        System.out.println("1.by ID \n2.by name \n3.by price \n4.by manufacturer \n5. Back to Main menu");
        int selection =  Integer.parseInt(scanner.nextLine());
        switch (selection) {
            case 1:
                Collections.sort(productList);
                displayList();
                sortMenu();
                break;
            case 2:
                productList.sort(new NameSort());
                displayList();
                sortMenu();
                break;
            case 3:
                productList.sort(new PriceSort());
                displayList();
                sortMenu();
                break;
            case 4:
                productList.sort(new ManufacturerSort());
                displayList();
                sortMenu();
                break;
            case 5:
                mainMenu();
                break;
            default:
                System.out.println("Invalid option");
                sortMenu();
        }
    }

    public static void getInfo () {
            System.out.println("Please input product's name");
            tempName = scanner.nextLine();
            System.out.print("please input the manufacturer"+"\n");
            tempManufacturer = scanner.nextLine();
            System.out.print("Please input the price"+"\n");
            tempPrice = Float.parseFloat(scanner.nextLine());
        }
    public static void addProduct (String name, Float price, String manufacturer){
        productList.add(new Product(name, price, manufacturer));
    }

    public static void editProduct (String name, Float price, String manufacturer, int index){
        productList.get(index).setName(name);
        productList.get(index).setPrice(price);
        productList.get(index).setManufacturer(manufacturer);
        resetSearchMenu();
    }

    public static void searchProductMenu() {
        for (Product prd: filterList) {
            System.out.print(prd+"\n");
        }
        for (String str: searchMenu) {
            System.out.print(str+"\n");
        }
        int selection = Integer.parseInt(scanner.nextLine()) ;

        switch (selection) {
            case 1:
                searchById();
                searchMenu.remove(0);
                searchProductMenu();
                break;
            case 2:
                nameSearch();
                searchMenu.remove(1);
                searchProductMenu();
                break;
            case 3:
                priceSearch();
                searchMenu.remove(2);
                searchProductMenu();
                break;
            case 4:
                manufacturerSearch();
                searchMenu.remove(3);
                searchProductMenu();
                break;
            case 5:
                if (filterList.size() == 1) {
                    tempId = filterList.get(0).idProduct;
                    getInfo();
                    for (int i = 0; i < productList.size() ; i++) {
                        if (productList.get(i).getIdProduct().equals(tempId)) {
                            editProduct(tempName,tempPrice,tempManufacturer,i);
                        }
                    }
                    filterList.get(0).setName(tempName);
                    filterList.get(0).setManufacturer(tempManufacturer);
                    filterList.get(0).setPrice(tempPrice);
                } else {
                    System.out.println("the current filter is not able to edit");
                    resetSearchMenu();
                }
                searchProductMenu();
                break;
            case 6:
                if (filterList.size() == 1) {
                    tempId = filterList.get(0).idProduct;
                    productList.removeIf(product -> product.getIdProduct().equals(tempId));
                    filterList.clear();
                } else {
                    System.out.println("the current filter is not able to delete");
                    resetSearchMenu();
                }
                searchProductMenu();
                break;
            case 7:
                resetSearchMenu();
                searchProductMenu();
                break;
            case 8:
                mainMenu();
                break;
            default:
                System.out.print("Invalid option"+"\n");
                searchProductMenu();
        }
    }

    private static void manufacturerSearch() {
        System.out.print("please enter product's manufacturer\n");
        tempManufacturer = scanner.nextLine();
        filterList.removeIf(prd -> !prd.getManufacturer().equals(tempManufacturer));
    }

    private static void priceSearch() {
        System.out.print("please enter product's price\n");
        tempPrice = scanner.nextFloat();
        filterList.removeIf(prd -> !prd.getPrice().equals(tempPrice));
    }

    private static void nameSearch() {
        System.out.print("please enter product's name \n");
        tempName = scanner.nextLine();
        filterList.removeIf(prd -> !prd.getName().equals(tempName));
    }

    public static void searchById (){
        System.out.print("please enter product's ID \n");
        tempId = scanner.nextLine();
        filterList.removeIf(prd -> !prd.getIdProduct().equals(tempId));
    }

    public static void displayList () {
        for (Product prd: productList) {
            System.out.println(prd);
        }
    }
}



