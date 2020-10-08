package case_study.common;

import case_study.common.exception.*;

import java.time.Year;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static Pattern pattern;
    public static Matcher matcher;
    public static final String NAME_CHECKING = "([A-Z]([a-z]*)*\\s)+[A-Z]([a-z])*$";
    public static final String DOB_CHECKING = "(\\d{1,2})[-](\\d{1,2})[-](\\d{4})";
    public static final String UTILITIES_NAME_CHECKING = "(Massage|Karaoke|Food|Drink|Car)";
    public static final String EMAIL_CHECKING = "^[\\w-.]+[\\w-.]*@([\\w-]+\\.)+[\\w-]{2,4}$";
    public static final String ID_CARD_CHECKING = "\\d{9}";

    public static boolean isValidName(String name, String regex) throws NameException {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return matcher.matches();
        } else throw new NameException();
    }
    public static boolean isValidDate (String date, String regex) throws BirthdayException, DateFormatException {

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(date);
        if (matcher.matches()) {
            int dd = Integer.parseInt(matcher.group(1));
            int mm = Integer.parseInt(matcher.group(2));
            int yyyy = Integer.parseInt(matcher.group(3));
            if(dd<0 || dd>31 || mm <0 || mm > 12 || yyyy<1900 || yyyy> Year.now().getValue()-18) {
                throw new BirthdayException();
            }
        } else throw new DateFormatException();
        return true;
    }
    public static boolean isValidArea (double area) {
        return area > 30;
    }
    public static boolean isValidRentCost(double rentCost) {
        return rentCost > 0;
    }
    public static boolean isValidMaxPeople (byte people) {
        return (people > 0 && people < 20);
    }
    public static boolean isValidFloor(byte floor){
        return floor > 0;
    }
    public static boolean isValidEmail (String email) throws EmailException {
        pattern = Pattern.compile(EMAIL_CHECKING);
        matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return matcher.matches();
        } else throw new EmailException();
    }
    public static String correctGender(String gender) throws GenderException {
        String correctedGender = gender.toUpperCase();
        if ((gender.toLowerCase().equals("male"))||(gender.toLowerCase().equals("female"))||(gender.toLowerCase().equals("unknown"))) {
            correctedGender = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
            return correctedGender;
        } throw new GenderException();
    }
    public static boolean isValidIdCard(String idCard) throws IdCardException {
        pattern = Pattern.compile(ID_CARD_CHECKING);
        matcher = pattern.matcher(idCard);
        if(matcher.matches()) {
            return matcher.matches();
        } else throw new IdCardException();
    }

//    public static void main(String[] args) throws BirthdayException, DateFormatException, NameException, GenderException {
////        System.out.println(isValidName("Tran A Bbc", NAME_CHECKING));
////        System.out.println(isValidDate("31-12-2000", DOB_CHECKING));
////        System.out.println(isValidName("Massage",UTILITIES_NAME_CHECKING));
////        String a = Integer.toHexString(50);
////        System.out.println(a);
////        System.out.println(correctGender("fEmAle"));
////        String identityNumber = "123456789".replaceFirst("(\\d{3})(\\d{3})(\\d{3})","$1 $2 $3");
////        System.out.println(identityNumber);
//
//        try {
//            isValidEmail("asdf@ @.com");
//        } catch (EmailException e) {
//            System.out.println("please input the email with the right format");
//
//        }
//    }
}
