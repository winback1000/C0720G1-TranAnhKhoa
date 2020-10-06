package _19_string_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidate {
    public static boolean validate(String phoneNumber) {
        Pattern pattern = Pattern.compile("^\\(+\\d{2}+[)\\-(]+\\d{10}\\)$");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    public static void main(String[] args) {
        System.out.println("(84)-(0978489648) is "+validate("(84)-(0978489648)"));
        System.out.println("(a8)-(22222222) is "+validate("(a8)-(22222222)"));
    }
}
