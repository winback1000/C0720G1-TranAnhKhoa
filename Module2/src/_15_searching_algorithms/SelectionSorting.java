package _15_searching_algorithms;

import java.util.Arrays;

public class SelectionSorting {
    public static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length;i++) {
            int tempMin = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < tempMin) {
                    tempMin = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tempMin;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,63,2,6,87,4,2,6,4,9,5,2,99,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
