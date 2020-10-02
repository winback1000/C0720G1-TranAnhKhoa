package _17_IO_file_text;

import java.io.*;

public class FileWriting {
    public static void main(String[] args) {
        try {
//            FileWriter writer = new FileWriter("src/_17_IO_file_text/copied.txt");
//            FileReader reader = new FileReader(CreatingFile.filePatch);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(CreatingFile.filePatch));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/_17_IO_file_text/copied.txt"));
            for(int i = 1; i<100; i++) {
                bufferedWriter.write(bufferedReader.readLine()+"\n");
//                writer.write(" String "+i+"\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
