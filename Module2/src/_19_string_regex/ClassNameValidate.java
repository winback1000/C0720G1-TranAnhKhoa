package _19_string_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidate {
    public static boolean validate(String className) {
        Pattern pattern = Pattern.compile("^(C|A|P){1}+[0-9]{4}+(G|H|I|K|L|M)$");
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
    public static void main(String[] args) {
        System.out.println("C0318G is "+validate("C0318G"));
        System.out.println("M0318G is "+validate("M0318G"));
        System.out.println("P0323A is "+validate("P0323A"));
    }
}
