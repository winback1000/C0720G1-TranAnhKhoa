package _10_DSA_danh_sach.trien_khai_lop_list_don_gian;

import javax.lang.model.element.Element;
import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    int size;
    public static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void ensureCapa() {
        elements = Arrays.copyOf(elements, elements.length*2);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
}
