package _12_java_collection_framework.products_management;

public class Product implements Comparable<Product> {
    static Integer id = 0;
    String idProduct;
    String name;
    Float price;
    String manufacturer;

    public Product(String name, Float price, String manufacturer) {
        id++;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.idProduct = ""+ manufacturer.charAt(0) + name.charAt(0) + id;
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

    public String getIdProduct() {
        return idProduct;
    }

    @Override
    public int compareTo(Product o) {
        return this.idProduct.compareTo(o.getIdProduct()) ;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id =" + idProduct +
                ", name= " + name +
                ", price= " + price +
                ", manufacturer= " + manufacturer +
                "}";
    }
}

