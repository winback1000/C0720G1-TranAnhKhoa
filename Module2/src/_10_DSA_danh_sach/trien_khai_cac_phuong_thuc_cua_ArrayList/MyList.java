package _10_DSA_danh_sach.trien_khai_cac_phuong_thuc_cua_ArrayList;

import java.util.Arrays;

public class MyList<E> {
    int size;
    static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size) {
        elements = new Object[size];
    }

    public void ensureCapa() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }
    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else {
            for (int i = index; i < elements.length - 2; i++) {
                elements[i] = elements[i++];
            }
            this.size--;
        }
    }
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }
    public int size() {
        return this.size;
    }
    public MyList<E> clone() {
        return this;
    }
    public boolean contains(E e) {
        boolean check = false;
        for(int i = 0; i<this.size; i++) {
            if (elements[i] == e) {
                check = true;
                break;
            }
        }
        return check;
    }
    public int indexOf(E e) {
        int index = -1;
        for(int i = 0; i<this.size; i++) {
            if (elements[i] == e) {
                index = i;
                break;
            }
        }
        return index;
    }
    public void clear() {
        for(int i = 0; i<elements.length; i++) {
            elements[i] = null;
        }
        this.size = 0;
    }
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0;i<this.size; i++) {
            result.append(" "+elements[i]+" ");
        }
        return result+"]";
    }
}

