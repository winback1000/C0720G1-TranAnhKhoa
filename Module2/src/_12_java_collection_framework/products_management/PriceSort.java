package _12_java_collection_framework.products_management;

import java.util.Comparator;

public class PriceSort implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }
}
