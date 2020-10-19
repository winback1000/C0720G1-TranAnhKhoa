package Examination.models;

import Examination.common.Data;

import java.util.ArrayList;
import java.util.List;

public class Class implements Data {
    public static List<Class> classList = new ArrayList<>();
    static int classNum = 0;
    int id;
    String name;
    int teacherId;

    public Class(String name, int teacherId) {
        classNum++;
        this.id = classNum;
        this.name = name;
        this.teacherId = teacherId;
        classList.add(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+COMMA+name+COMMA+teacherId;
    }
    public String showInfo() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacherId=" + teacherId +
                '}';
    }
}
