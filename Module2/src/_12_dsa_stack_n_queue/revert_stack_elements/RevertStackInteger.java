package _12_dsa_stack_n_queue.revert_stack_elements;

import java.util.ArrayList;
import java.util.Stack;

public class RevertStackInteger {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i = 1; i<=10; i++) {
            numList.add(i);
        }
        System.out.println(numList);
        for(Integer i : numList){
            stack.push(i);
        }
        for(int i =0; i<numList.size(); i++) {
            numList.set(i,stack.pop());
        }
        System.out.println(numList);
    }
//    String temp = "five";
//    temp.

}
