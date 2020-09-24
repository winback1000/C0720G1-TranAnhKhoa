package _11_dsa_stack_n_queue.revert_stack_elements;

import java.util.Stack;

public class RevertStackString {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("One Two Three Four Five");
        System.out.println(str.indexOf(" ", 4));
        int i = 0;
        Stack<String> wStack = new Stack<>();
            while (str.indexOf(" ", i) > 0) {
                String temp = str.substring(i, str.indexOf(" ", i));
                i += temp.length()+1;
                wStack.push(temp);
            }
            wStack.push(str.substring(str.lastIndexOf(" ")));
        System.out.println(wStack);
        String temp = str.toString();
        str = new StringBuilder();
        while (wStack.size()>0) {
            str.append(wStack.pop()).append(" ");
        }
        str.append(temp);
        System.out.println(str);
    }
}
