package _12_java_collection_framework.products_management;

import java.util.Comparator;

public class NameSort implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName()) ;
    }
}
