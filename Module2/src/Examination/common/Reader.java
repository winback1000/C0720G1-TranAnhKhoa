package Examination.common;

import Examination.models.Class;
import Examination.models.Human;
import Examination.models.Student;
import Examination.models.Teacher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader implements FilePath {
    public static FileReader cfr;
    public static BufferedReader cbr;
    public static String line;
    public static String[] lineList;

    public static void classReader() {
        try {
            cfr = new FileReader(CLASS_PATH);
            cbr = new BufferedReader(cfr);
            while ((line = cbr.readLine()) != null) {
                lineList = line.split(",");
                new Class(lineList[1], Integer.parseInt(lineList[2]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File is empty or broken");
        }
    }

    public static void teacherReader() {
        try {
            cfr = new FileReader(TEACHER_PATH);
            cbr = new BufferedReader(cfr);
            while ((line = cbr.readLine()) != null) {
                lineList = line.split(",");
                new Teacher(lineList[1], lineList[2], lineList[3], lineList[4]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File is empty or broken");
        }
    }

    public static void studentReader() {
        try {
            cfr = new FileReader(STUDENT_PATH);
            cbr = new BufferedReader(cfr);
            while ((line = cbr.readLine()) != null) {
                lineList = line.split(",");
                new Student(lineList[1], lineList[2], lineList[3], lineList[4], Integer.parseInt(lineList[5]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File is empty or broken");
        }
    }

    public static void humanReader() {
        try {
            cfr = new FileReader(HUMAN_PATH);
            cbr = new BufferedReader(cfr);
            while ((line = cbr.readLine()) != null) {
                lineList = line.split(",");
                if (lineList.length == 6) {
                    new Student(lineList[1], lineList[2], lineList[3], lineList[4], Integer.parseInt(lineList[5]));
                } else {
                    if (lineList.length == 5) {
                        new Teacher(lineList[1], lineList[2], lineList[3], lineList[4]);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File is empty or broken");
        }
    }
}
