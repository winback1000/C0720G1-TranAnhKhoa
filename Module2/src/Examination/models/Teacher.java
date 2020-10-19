package Examination.models;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Human {
    public static List<Teacher> teacherList = new ArrayList<>();
    static int teacherNum = 0;

    public Teacher(String name, String dateOfBirth, String gender, String phoneNumber) {
        super(name, dateOfBirth, gender, phoneNumber);
        teacherNum++;
        this.id = teacherNum;
    }

    @Override
    public String toString() {
        return id+COMMA+name+COMMA+dateOfBirth+COMMA+gender+COMMA+phoneNumber;
    }

    @Override
    public String showInfo() {
        return "Teacher{" +
            "id=" + id +
                    ", name='" + name + '\'' +
                    ", dateOfBirth='" + dateOfBirth + '\'' +
                    ", gender='" + gender + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
    }
}
