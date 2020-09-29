package _15_searching_algorithms;

import java.util.Arrays;

public class InsertSorting {
    public static void insertSort(int[] arr) {
        for (int i = 1; i< arr.length; i++) {
            for (int j = 0; j< i; j++ ) {
                if(arr[i] <= arr[j]) {
                    int temp = arr[i];
                    System.arraycopy(arr, j, arr, j + 1, i - j);
                    arr[j] = temp;
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,3,4,63,2,6,87,4,2,6,4,9,5,2,99,1};
        int[] arr2 = {6,9,8,7,6,5,4,3,2,1,0};
        insertSort(arr2);
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
