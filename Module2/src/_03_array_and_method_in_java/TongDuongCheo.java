package _03_array_and_method_in_java;

public class TongDuongCheo {
    public static int sumMainCross(int[][] arr) {
        int sum = 0;
        for(byte i = 0; i< arr.length;i++) {
            for(byte j = 0; j<arr[i].length;j++) {
                if(i == j) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    public static int sumSubCross(int[][] arr) {
        int sum = 0;
        for(byte i = 0; i< arr.length;i++) {
            for(byte j = 0; j<arr[i].length;j++) {
                if(i+j == arr.length-1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {

        int[][] array = TimPhanTuLonNhatTrongMang2Chieu.input2dArray();
        int mainCross = sumMainCross(array);
        int subCross = sumSubCross(array);
        System.out.printf("Tong duong cheo chinh la %d", mainCross);
        System.out.printf("Tong duong cheo phu la %d", subCross);
    }
}
