package _17_IO_file_text;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreatingFile {
    static final String filePatch = "src/_17_IO_file_text/testFile.csv";

    public static void main(String[] args) {
        File testCreatingFile = new File(filePatch);
        try {
            if(testCreatingFile.createNewFile()) {
                System.out.println("file created: "+testCreatingFile.getName());
            } else {
                System.out.println("the file is already existed, replace? \n1.yes\n2.No");
                Scanner scr = new Scanner(System.in);
                int selection = Integer.parseInt(scr.nextLine());
                switch (selection) {
                    case 1:
                        System.out.println("File deteled: " + testCreatingFile.delete());
                        System.out.println("File created: "+ testCreatingFile.createNewFile());
                        break;
                    case 2:
                        System.out.println("Nothing to to, system exit");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println("Set Read-only: "+ testCreatingFile.setReadOnly());
    }
}
