package _14_searching_algorithms;

import java.util.ArrayList;

public class LongestIncrementString {

    public static String findTheLongestIncrementString (String str) {
        ArrayList<Character> temp = new ArrayList<>();
        temp.add(str.charAt(0));
        for (int i = 1; i< str.length()-1; i++) {
            if (str.charAt(i) >= temp.get(temp.size()-1)) {
                temp.add(str.charAt(i));
            }
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        String sample = "Welcome";
        System.out.println(findTheLongestIncrementString(sample));
        System.out.println(findTheLongestIncrementString("abcabcdgaxalkfjasdiuhf"));
    }
}
