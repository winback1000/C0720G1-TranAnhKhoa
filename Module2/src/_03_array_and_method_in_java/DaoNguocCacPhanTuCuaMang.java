package _03_array_and_method_in_java;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocCacPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 0;
        while ((size == 0) || (size >19)) {
            System.out.println("please input the size of the array");
            size = sc.nextInt();
        }
        int[] arr = new int[size];
        for (int i = 0; i<size; i++) {
            System.out.println("please input the value of the "+ (i+1) +" element");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        revert(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void revert(int[] array) {
        for (int i = 0; i< array.length/2; i++) {
            int temp;
            temp = array[array.length -1 -i];
            array[array.length -1-i] = array[i];
            array[i] = temp;
        }
        //        System.out.println(Arrays.toString(array));
    }
}
