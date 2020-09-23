package _12_dsa_stack_n_queue.count_word;

import java.util.TreeMap;

public class CountWord {

    public static TreeMap<String,Integer> wMap = new TreeMap<>();

    public static void checkAndAdd(String key) {
        if(wMap.containsKey(key)){
            wMap.replace(key, wMap.get(key)+1);
        } else {
            wMap.put(key, 1);
        }
    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("One Two Three Four    Five one two    three one three six four");
        int i = 0;
        while (str.indexOf(" ", i) > 0) {
            if(str.charAt(i) == ' ') {
                i++;
            } else {
                String temp = str.substring(i, str.indexOf(" ", i)).toLowerCase();
                i += temp.length() + 1;
                checkAndAdd(temp);
            }
        }
        String temp = str.substring(str.lastIndexOf(" ")+1).toLowerCase();
        checkAndAdd(temp);
        System.out.println(wMap);
    }
}
