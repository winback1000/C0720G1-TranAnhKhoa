package _02_loop_in_java.exercises;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        for (int num=1; num <100; num++) {
            boolean c = false;
            for (int b=2; b < num; b++) {
                if (num % b == 0) {
                    c = true;
                    break;
                }
            }
            if (!c) {
                System.out.print(num +"\t");
            }
        }
    }
}
