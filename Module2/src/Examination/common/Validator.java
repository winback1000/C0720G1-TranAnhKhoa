package Examination.common;

import Examination.models.Student;

import java.time.Year;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Examination.models.Student.studentList;

public class Validator {
    public static Pattern pattern;
    public static Matcher matcher;
    public static final String HUMAN_NAME_CHECKING = "[\\w\\d\\s]{4,50}";
    public static final String DOB_CHECKING = "(\\d{1,2})[-](\\d{1,2})[-](\\d{4})";
    public static final String PHONE_NUMBER_CHECKING = "^(090|091)\\d{7}";

    public static boolean isValidGender(String gender) {
        return (gender.toLowerCase().equals("male")) || (gender.toLowerCase().equals("female")) || (gender.toLowerCase().equals("unknown"));
    }
    public static boolean isValidName(String name, String regex){
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    public static boolean isValidDateOfBirth(String date, String regex) {
        boolean correct = true;
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(date);
        if (matcher.matches()) {
            int dd = Integer.parseInt(matcher.group(1));
            int mm = Integer.parseInt(matcher.group(2));
            int yyyy = Integer.parseInt(matcher.group(3));
            if(dd<0 || dd>31 || mm <0 || mm > 12 || yyyy> Year.now().getValue()) {
                correct = false;
            }
        } else correct = false;
        return correct;
    }
    public static boolean isValidPhoneNumber(String phoneNumber) {
        for (Student std: studentList) {
            if (std.getPhoneNumber().equals(phoneNumber)) {
                return false;
            }
        }
        pattern = Pattern.compile(PHONE_NUMBER_CHECKING);
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
