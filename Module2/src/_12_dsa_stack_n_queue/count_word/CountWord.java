package _12_dsa_stack_n_queue.count_word;

import java.util.Map;
import java.util.TreeMap;

public class CountWord {

    public static TreeMap<String,Integer> wMap = new TreeMap();

    int count = 1;
    public static void checkAndAdd(String key) {
        if(wMap.containsKey(key)){
            wMap.replace(key, wMap.get(key), wMap.get(key)+1);
        } else {
            wMap.put(key, 1);
            System.out.println(wMap);
            System.out.println(wMap.get(key));

        }
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("One Two Three Four Five one two three");
        int i = 0;
        while (str.indexOf(" ", i) > 0) {
            String temp = str.substring(i, str.indexOf(" ", i)).toLowerCase();
            i += temp.length()+1;
            checkAndAdd(temp);
        }
        String temp = str.substring(str.lastIndexOf(" ")).toLowerCase();
        checkAndAdd(temp);
        System.out.println(wMap);
    }
}
