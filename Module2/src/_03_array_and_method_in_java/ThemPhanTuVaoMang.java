package _03_array_and_method_in_java;

import java.util.Arrays;

public class ThemPhanTuVaoMang {
    public static void addElementToArray(int num, int index, int[] arr) {
        for(int i = arr.length -1; i>index;i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = num;
    }
    public static int[] pushElementToArray(int num, int index, int[] arr) {
        int[] newArr = new int[arr.length+1];
        int j = 0;
        for (int i = 0; i<newArr.length;i++) {
            if(i == index) {
                newArr[i] = num;
                j--;
            } else {
                newArr[i] = arr[j];
            }
            j++;
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,0,0,0,0,0};
        addElementToArray(5,3,arr);
        System.out.println(Arrays.toString(arr));
        int[] newArr = pushElementToArray(9,arr.length-1,arr);
        System.out.println(Arrays.toString(newArr));
    }
}
