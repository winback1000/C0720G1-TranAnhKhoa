package _12_java_collection_framework.products_management;

public class Product implements Comparable<Product> {
    static Integer id = 0;
    Integer idProduct;
    String name;
    Float price;
    String manufacturer;

    public Product() {
        id++;
        this.idProduct = id;
    }

    public Product(String name, Float price, String manufacturer) {
        id++;
        this.idProduct = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    @Override
    public int compareTo(Product o) {
        return this.idProduct - o.getIdProduct();
    }
}
