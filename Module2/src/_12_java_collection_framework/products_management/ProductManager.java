package _12_java_collection_framework.products_management;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> productList = new ArrayList<>();
    public static void mainMenu() {
        System.out.println("1. Add product \n2. Edit product\n3. Delete product\n4. Display list\n5. Search product\n6. Sort by");
    }
    public static void addProduct(){
        System.out.println("Please input product's name");
        String tempName = scanner.nextLine();
        System.out.println("please input the manufacturer");
        String tempManufacturer = scanner.nextLine();
        System.out.println("Please input the price");
        Float tempPrice = scanner.nextFloat();
        productList.add(new Product(tempName,tempPrice,tempManufacturer));
    }

    public static void main(String[] args) {

       mainMenu();
    }
}
