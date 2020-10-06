package _19_string_regex.validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountValidate {
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______" , "123456","abcdefg"};
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_" , "abcde "};
    public static boolean validate(String account) {
        Pattern pattern = Pattern.compile("^[_a-z0-9]{6,}$");
        Matcher matcher = pattern.matcher(account);
        return matcher.matches();
    }
    public static void main(String[] args) {
        for (String acc: validAccount) {
            System.out.println(acc + " is: "+validate(acc));
        }
        for (String acc: invalidAccount) {
            System.out.println(acc + " is: "+validate(acc));
        }
    }
}
