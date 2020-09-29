package _15_searching_algorithms;

import java.util.Arrays;

public class BubbleSorting {
    public static void bubbleSort (int[] array) {
        boolean needNextRound;
        do {
            needNextRound = false;
            for (int i= 0; i<array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    needNextRound = true;
                }
            }
        }   while (needNextRound);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,63,2,6,87,4,2,6,4,9,5,2,99,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
