package _03_array_and_method_in_java;

import java.util.Arrays;

public class GopMang {
    public static int[] concatArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        for(int i = 0; i<arr.length; i++) {
            if(i>arr1.length-1) {
                arr[i] = arr2[i-arr1.length];
            } else {
                arr[i] = arr1[i];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9};
        int[] newArr = concatArray(arr1, arr2);
        System.out.println(Arrays.toString(newArr));
    }
}
