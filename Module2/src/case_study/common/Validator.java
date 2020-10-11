package case_study.common;

import case_study.common.exception.*;

import java.time.Year;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static case_study.common.ShowList.scr;

public class Validator {

    public static Pattern pattern;
    public static Matcher matcher;
    public static final String HUMAN_NAME_CHECKING = "([A-Z]([a-z]*)*\\s)+[A-Z]([a-z])*$";
    public static final String SERVICE_NAME_CHECKING = "^[A-Z][a-z]*$";
    public static final String DOB_CHECKING = "(\\d{1,2})[-](\\d{1,2})[-](\\d{4})";
    public static final String UTILITIES_NAME_CHECKING = "(Massage|Karaoke|Food|Drink|Car)";
    public static final String EMAIL_CHECKING = "^[\\w-.]+[\\w-.]*@([\\w-]+\\.)+[\\w-]{2,4}$";
    public static final String ID_CARD_CHECKING = "\\d{9}";
    public static final String PHONE_NUMBER_CHECKING = "\\d{10}";
    public static final String CUSTOMER_TYPE_CHECKING = "(Member|Silver|Gold|Platinum|Diamond)";
    public static final String POSITION_CHECKING = "(Junior|Senior|Supervisor|Leader|Manager)";


    public static boolean isValidName(String name, String regex) throws NameException {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(name);
        if (matcher.matches()) {
            return matcher.matches();
        } else throw new NameException();
    }
    public static boolean isValidDateOfBirth(String date, String regex) throws BirthdayException, DateFormatException {

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
    public static double getDoubleValue(String message, double min)  {
        boolean correct;
        double temp = 0;
        do {
            correct = true;
            try {
                System.out.println(message);
                temp = Double.parseDouble(scr.nextLine());
                if (temp < min) correct =false;
            } catch (Exception e) {
                System.out.println("invalid input, please try again");
                correct = false;
            }
        } while (!correct);
        return temp;
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
    public static String isValidGender(String gender) throws GenderException {
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
    public static boolean isValidPhoneNumber(String phoneNumber) throws Exception {
        pattern = Pattern.compile(PHONE_NUMBER_CHECKING);
        matcher = pattern.matcher(phoneNumber);
        if(matcher.matches()) {
            return matcher.matches();
        } else throw new IdCardException();
    }
    public static boolean isValidCustomerType (String customerType) throws Exception {
        pattern = Pattern.compile(CUSTOMER_TYPE_CHECKING);
        matcher = pattern.matcher(customerType);
        if (matcher.matches()) {
            return matcher.matches();
        } else throw new Exception();
    }
    public static boolean isValidNameType (String nameType,String regex) throws Exception {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(nameType);
        if (matcher.matches()) {
            return matcher.matches();
        } else throw new Exception();
    }
    public static boolean isValidDate(String date, String regex) throws DateFormatException {

        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(date);
        if (matcher.matches()) {
            int dd = Integer.parseInt(matcher.group(1));
            int mm = Integer.parseInt(matcher.group(2));
            int yyyy = Integer.parseInt(matcher.group(3));
            if(dd<0 || dd>31 || mm <0 || mm > 12 || yyyy<Year.now().getValue() || yyyy> Year.now().getValue()+10) {
                throw new DateFormatException();
            }
        } else throw new DateFormatException();
        return true;
    }
}
