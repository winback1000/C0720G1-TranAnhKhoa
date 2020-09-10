package _03_array_and_method_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the length of the array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int max = 0;
        for ( int i=0; i<size; i++) {
            System.out.println("please input the value of the "+ (i+1) +" element");
            arr[i] = sc.nextInt();
            if (max<= arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("the largest number of array is: "+max);
    }
}
