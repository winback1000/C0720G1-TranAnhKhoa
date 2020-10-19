package Examination.models;

import java.util.ArrayList;
import java.util.List;

public class Student extends Human {
    public static List<Student> studentList = new ArrayList<>();
    static int studentNum = 0;
    int classId;

    public Student(String name, String dateOfBirth, String gender, String phoneNumber, int classId) {
        super(name, dateOfBirth, gender, phoneNumber);
        studentNum++;
        this.id = studentNum;
        this.classId = classId;
        studentList.add(this);
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return id+COMMA+name+COMMA+dateOfBirth+COMMA+gender+COMMA+phoneNumber+COMMA+classId;
    }

    @Override
    public String showInfo() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", dateOfBirth='" + dateOfBirth + '\'' +
                    ", gender='" + gender + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    ", classId=" + classId +
                    '}';
    }
}
