package _19_string_regex.validate_email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private static final String EMAIL_REGEX = "^[\\w-.]+[\\w-.]*@([\\w-]+\\.)+[\\w-]{2,4}$";

    public EmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static final String[] validEmail = new String[] { "a@gmail.a", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
    public static void main(String[] args) {
        EmailExample emailExample = new EmailExample();
        for (String str: validEmail) {
            System.out.println(str +" is "+ emailExample.validate(str));
        }
        for (String email : invalidEmail) {
            System.out.println("Email is " + email +" is  "+ emailExample.validate(email));
        }
    }
}
