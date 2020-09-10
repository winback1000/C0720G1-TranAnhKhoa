package _02_loop_in_java.exercises;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input the amount of primitive number to display");
        int amount = sc.nextInt();
        int num = 1;
        for (int i=0; i<amount; num++) {
            boolean N = false;
            for (int b=2; b<num; b++) {
                if (num % b == 0) {
                    N = true;
                    break;
                }
            }
            if (!N) {
                System.out.print(num +"\t");
                i++;
            }
        }
    }
}
