package _03_array_and_method_in_java;

import java.util.Arrays;

public class XoaPhanTuKhoiMang {
    public static int indexOf(int num, int[] arr) {
        int index = -1;
        for(int i = 0; i<arr.length;i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static void removeElementFromArray(int num, int[] arr) {
        while (indexOf(num,arr) != -1) {
            for(int i = indexOf(num,arr); i<arr.length-1; i++) {
                arr[i] = arr[i+1];
                arr[arr.length-1] = 0;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,6,7,0,0,7};
        removeElementFromArray(7, arr);
        System.out.println(Arrays.toString(arr));
    }
}
