package exam2.models;

import java.util.ArrayList;
import java.util.List;

public class ImportProduct extends Product {
    public static List<ImportProduct> importProductList = new ArrayList<>();
    public static int importProductNum = 0;
    double importPrice;
    String importProvince;
    double importTax;

    public ImportProduct(String productCode, String name, double price, int quantity, String manufacturer, double importPrice, String importProvince, double importTax) {
        super(productCode, name, price, quantity, manufacturer);
        this.importPrice = importPrice;
        this.importProvince = importProvince;
        this.importTax = importTax;
        importProductNum++;
        this.id = importProductNum;
        importProductList.add(this);
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public String getImportProvince() {
        return importProvince;
    }

    public void setImportProvince(String importProvince) {
        this.importProvince = importProvince;
    }

    public double getImportTax() {
        return importTax;
    }

    public void setImportTax(double importTax) {
        this.importTax = importTax;
    }

    @Override
    public String toString() {
        return this.id+COMMA+productCode+COMMA+name+COMMA+price+COMMA+quantity+COMMA+manufacturer+COMMA+importPrice+COMMA+importProvince+COMMA+importTax;
    }


    @Override
    public String showInfo() {
        return "ImportProduct{" +
                "id=" + id +
                ", productCode='" + productCode + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", manufacturer='" + manufacturer + '\'' +
                ", import Price=" + importPrice +
                ", import Province=" + importProvince +
                ", importTax=" + importTax +
                '}';
    }
}
