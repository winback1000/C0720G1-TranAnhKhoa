package _04_class_and_object_in_java;

import java.util.Arrays;

public class TestStopWatch {
    public static void swap(double []A, int a, int b) {
        double temp = A[a];
        A[a] = A[b];
        A[b] = temp;
    }
    public static void selectionSort(double []A, int n) {
        for(int i=0; i<n-1; i++) {
            int minArr = i;
            for(int j=i+1; j<n; j++) {
                if(A[minArr]>A[j]) {
                    minArr = j;
                }
            }
            if(i!=minArr)
                swap(A, minArr, i);
        }
    }
    public static void main(String[] args) {
        StopWatch sw = new StopWatch();
        double[] arr = new double[100000];
        for (int i = 0; i<arr.length; i++) {
            arr[i] = Math.ceil(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
        sw.start();
        System.out.println(sw.getStartTime());
        selectionSort(arr,arr.length);
        sw.stop();
        System.out.println(sw.getEndTime());
        System.out.println(sw.getElapsedTime());
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
}
