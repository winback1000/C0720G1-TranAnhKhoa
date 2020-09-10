package _03_array_and_method_in_java;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static int findArrayMax(int[][] arr) {
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (max < anInt) {
                    max = anInt;
                }
            }
        }
        return max;
    }
    public static int[] findArrayIndex(int num, int[][] arr) {
        int[] index = new int[2];
            for (int i = 0; i<arr.length;i++) {
                for(int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == num) {
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
    public static int[][] input2dArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number of rows");
        byte row = sc.nextByte();
        System.out.println("Please input the number of columns");
        byte col = sc.nextByte();
        int[][] arr = new int[row][col];
        for (int i = 0; i<row;i++) {
            for(int j = 0; j < col; j++) {
                System.out.printf("Please input the element [%d][%d]", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] array = input2dArray();
        System.out.printf("the largest number in the array is: %d at the index [%d][%d]", findArrayMax(array),findArrayIndex(findArrayMax(array),array)[0],findArrayIndex(findArrayMax(array),array)[1] );
    }
}
