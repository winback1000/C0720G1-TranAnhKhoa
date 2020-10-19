package exam2.common;


public class Validate {

    public static boolean isValidString(String str) {
        return !str.equals("");
    }
    public static boolean isValidPrice(double price) {
        return price>0;
    }
    public static boolean isValidQuantity(int quantity) {
        return quantity>0;
    }
}
