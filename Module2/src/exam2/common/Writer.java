package exam2.common;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {
    public static void csvWriter(String path, List<?> list){
        FileWriter cfw;
        BufferedWriter cbw = null;

        try {
            cfw = new FileWriter(path);
            cbw = new BufferedWriter(cfw);
            for (Object s: list) {
                cbw.write(s.toString());
                cbw.newLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                cbw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
