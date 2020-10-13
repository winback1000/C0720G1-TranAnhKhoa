package case_study.models.human;


import java.text.ParseException;

public abstract class Human implements Comparable<Human>{

    public static final String COMMA = ",";
    String name;
    String dateOfBirth;
    String phoneNumber;
    String email;
    String gender;
    String address;
    String identityNumber;

    public Human() {}

    public Human(String name, String dateOfBirth, String phoneNumber, String email, String gender, String address,String identityNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber.replaceFirst("(\\d{4})(\\d{3})(\\d+)", "$1-$2-$3");
        this.email = email;
        this.gender = gender;
        this.address = address;
        this.identityNumber = identityNumber.replaceFirst("(\\d{3})(\\d{3})(\\d{3})","$1 $2 $3");
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) throws ParseException {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public abstract String toString();

    public abstract String showInfo();

}
