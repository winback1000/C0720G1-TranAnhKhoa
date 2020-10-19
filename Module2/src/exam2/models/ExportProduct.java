package exam2.models;

import java.util.ArrayList;
import java.util.List;

public class ExportProduct extends Product {
    public static List<ExportProduct> exportProductList = new ArrayList<>();
    public static int exportProductNum = 0;
    double exportPrice;
    String exportCountry;

    public ExportProduct(String productCode, String name, double price, int quantity, String manufacturer, double exportPrice, String exportCountry) {
        super(productCode, name, price, quantity, manufacturer);
        this.exportPrice = exportPrice;
        this.exportCountry = exportCountry;
        exportProductNum++;
        this.id = exportProductNum;
        exportProductList.add(this);
    }

    public double getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(double exportPrice) {
        this.exportPrice = exportPrice;
    }

    public String getExportCountry() {
        return exportCountry;
    }

    public void setExportCountry(String exportCountry) {
        this.exportCountry = exportCountry;
    }

    @Override
    public String toString() {
        return this.id+COMMA+productCode+COMMA+name+COMMA+price+COMMA+quantity+COMMA+manufacturer+COMMA+exportPrice+COMMA+exportCountry;
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
                ", Export Price =" + exportPrice +
                ", Export Country=" + exportCountry +
                '}';
    }
}
