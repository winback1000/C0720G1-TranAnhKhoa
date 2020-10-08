package case_study.common;

import java.io.*;
import java.util.ArrayList;

public class Writer {
    public static void csvWriter(String path, ArrayList<Object> list){
        try {
            FileWriter cfw = new FileWriter(path);
            BufferedWriter cw = new BufferedWriter(cfw);
            for (Object o: list) {
                cw.write(o.toString());
                cw.newLine();
            }
            cw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void datWriter(String path, ArrayList<Object> list) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
