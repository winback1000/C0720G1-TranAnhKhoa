package _12_java_collection_framework.hashMap_n_hashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1,"Nam",20, "HN");
        Student student2 = new Student(2,"Hung",21, "HN");
        Student student3 = new Student(3,"Ha",22, "HN");
        Student student4 = new Student(4,"Ha",23, "DN");
        Student student5 = new Student(5,"Ha",19, "SG");
        Map<Integer,Student> studentHashMap = new HashMap<>();
        studentHashMap.put(1, student1);
        studentHashMap.put(2, student2);
        studentHashMap.put(3, student3);
        studentHashMap.put(4, student4);
        studentHashMap.put(5, student5);
        studentHashMap.put(6, student3);
//        for (Map.Entry<Integer, Student> student: studentHashMap.entrySet()) {
//            System.out.println(student.toString());
//        }

        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        students.add(student4);
        students.add(student5);
//        for (Student s: students) {
//            System.out.println(s.toString());
//        }
        List<Student> studentList = new ArrayList<>(students);
        System.out.println(studentList);
        studentList.sort(Student::compareTo);
        System.out.println(studentList);
        IdComparator idComparator = new IdComparator();
        studentList.sort(idComparator);
        System.out.println(studentList);
    }
}

