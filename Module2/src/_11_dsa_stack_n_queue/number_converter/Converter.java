package _11_dsa_stack_n_queue.number_converter;

import java.util.ArrayList;
import static java.lang.Integer.parseInt;

public class Converter {
    public long bin;
    public int dec;
    public int oct;
    public String hex;
//    public static final short A = 10;
//    public static final short B = 11;
//    public static final short C = 12;
//    public static final short D = 13;
//    public static final short E = 14;
//    public static final short F = 15;


    public Converter() {
    }
    public int readCharacter(char c) {
        switch (c) {
            case 'A':
                return 10;
            case 'B':
                return 11;
            case 'C':
                return 12;
            case 'D':
                return 13;
            case 'E':
                return 14;
            case 'F':
                return 15;
            default:
                return (c-48);
        }
    }
    public String diviner(int num, int target) {
        int temp = num%target;
        String str ="";
        switch (temp) {
            case 10:
                return "A";
            case 11:
                return "B";
            case 12:
                return "C";
            case 13:
                return "D";
            case 14:
                return "E";
            case 15:
                return "F";
            default:
                return str+temp;

        }
    }
    public String decToTarget(String num, int target) {
        String result = "";
        int tempNum = parseInt(num);
        ArrayList<String> temp = new ArrayList<>();
        do {
            temp.add(0,diviner(tempNum,target));
            tempNum = (int) Math.floor(tempNum/target);
        } while (tempNum !=0 );
        for (String i: temp) {
            result = result + i;
        }
        return result;
    }
    public String numToDec(String num,int from){
        int tempSum = 0;
        String result = "";
        ArrayList<Character> temp = new ArrayList<>();
        for(int i = 0; i< num.length(); i++) {
           tempSum = tempSum*from +readCharacter(num.charAt(i));
        }
        return tempSum+result;
    }
    public String convertRandom(String num, int from, int target){
        return decToTarget(numToDec(num,from),target);
    }
}
