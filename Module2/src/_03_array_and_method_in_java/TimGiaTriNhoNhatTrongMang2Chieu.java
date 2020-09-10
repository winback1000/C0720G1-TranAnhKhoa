package _03_array_and_method_in_java;

import java.util.Arrays;

public class TimGiaTriNhoNhatTrongMang2Chieu {
    public static void main(String[] args) {
        int [][] array = TimPhanTuLonNhatTrongMang2Chieu.input2dArray();
        int min = TimGiaTriNhoNhatTrongMang.minValue2dArray(array);
        System.out.println(Arrays.deepToString(array));
        System.out.println("The smallest number is "+min);
        System.out.printf("At the position: [%d][%d]", TimPhanTuLonNhatTrongMang2Chieu.findArrayIndex(min,array)[0],TimPhanTuLonNhatTrongMang2Chieu.findArrayIndex(min,array)[1]);
    }
}
