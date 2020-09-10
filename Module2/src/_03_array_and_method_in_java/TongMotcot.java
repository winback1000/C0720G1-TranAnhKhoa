package _03_array_and_method_in_java;

import java.util.Scanner;

public class TongMotcot {
    public static int sumCol(byte col, int[][] arr) {
        int sum = 0;
        for (int[] ints : arr) {
            sum += ints[col];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] array = TimPhanTuLonNhatTrongMang2Chieu.input2dArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the column you want to find the sum");
        byte col = sc.nextByte();
        System.out.printf("The sum of column %d is %d", col, sumCol(col, array));
    }
}
