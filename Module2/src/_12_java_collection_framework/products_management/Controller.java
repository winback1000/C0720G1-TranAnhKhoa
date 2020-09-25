package _12_java_collection_framework.products_management;


public class Controller {
    public static void main(String[] args) {
        ProductManager.addProduct("Galaxy S1",15000F, "Samsung");
        ProductManager.addProduct("Galaxy S2",16000F, "Samsung");
        ProductManager.addProduct("Galaxy S3",13000F, "Samsung");
        ProductManager.addProduct("Galaxy S4",14000F, "Samsung");
        ProductManager.addProduct("Galaxy S5",17000F, "Samsung");
        ProductManager.addProduct("Galaxy S10",15000F, "Samsung");
        ProductManager.addProduct("Galaxy S10",18000F, "Samsung");
        ProductManager.addProduct("iphone5",19000F, "Apple");
        ProductManager.addProduct("iphone6",15000F, "Apple");
        ProductManager.addProduct("iphone7",14000F, "Apple");
        ProductManager.addProduct("iphoneX",12000F, "Apple");
        ProductManager.addProduct("iphone5",11000F, "Apple");
        ProductManager.addProduct("iphone8",10000F, "Apple");
        ProductManager.addProduct("iphone5",18000F, "Apple");
        ProductManager.resetSearchMenu();
        ProductManager.mainMenu();
    }
}
