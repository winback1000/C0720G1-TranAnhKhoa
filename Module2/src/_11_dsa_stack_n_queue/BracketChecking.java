package _11_dsa_stack_n_queue;

import java.util.Stack;

public class BracketChecking {
    public static void main(String[] args) {
        String str1 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        String str2 = "s * (s – a) * (s – b) * (s – c)";
        String str3 = "s * (s – a) * (s – b * (s – c)";
        String str4 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        String str5 = "(()())()";
        String str6 = "s * (s – a) * s – b) * (s – c)";
        System.out.println(checking(str1));
        System.out.println(checking(str2));
        System.out.println(checking(str3));
        System.out.println(checking(str4));
        System.out.println(checking(str5));
        System.out.println(checking(str6));
    }

    public static boolean checking(String str) {
        Stack<Integer> checkList = new Stack<>();
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                checkList.add(1);
            } else if (str.charAt(i) == ')') {
                checkList.add(-1);
            }
        }
        if (checkList.size() % 2 != 0) {
            check = false;
        } else {
            while (checkList.size() > 0) {
                if (checkList.get(0) == -1) {
                    check = false;
                } else {
                    checkList.remove(checkList.indexOf(-1));
                    checkList.remove(0);
                }
            }
        }
        return check;
    }
}
