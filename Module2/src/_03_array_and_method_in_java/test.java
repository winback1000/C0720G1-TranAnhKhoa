package _03_array_and_method_in_java;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        float[] arr = new float[10];
        System.out.println(Arrays.toString(arr));
        for (float v : arr) {
            System.out.println(v);
        }
        System.out.println(Arrays.toString(arr));
    }
}
