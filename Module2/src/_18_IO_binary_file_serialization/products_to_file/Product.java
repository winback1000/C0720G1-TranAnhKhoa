package _18_IO_binary_file_serialization.products_to_file;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Product implements Serializable {
    public static Integer productNum = 0;
    String name;
    String manufacturer;
    StringBuilder id = new StringBuilder();
    float price;
    String describle;
    public static List<Product> list = new ArrayList<>();

    public Product(String name, String manufacturer, float price, String describle) {
        productNum ++;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.describle = describle;
        this.id.append(name.charAt(0)).append(manufacturer.charAt(0)).append(productNum);
        list.add(this);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                ", describle='" + describle + '\'' +
                "}";
    }
}

