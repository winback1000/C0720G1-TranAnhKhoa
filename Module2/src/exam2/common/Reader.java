package exam2.common;

import exam2.models.ExportProduct;
import exam2.models.ImportProduct;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader implements FilePath {
    public static FileReader cfr;
    public static BufferedReader cbr;
    public static String line;
    public static String[] lineList;

    public static void importReader() {
        try {
            cfr = new FileReader(IMPORT_PRODUCT_PATH);
            cbr = new BufferedReader(cfr);
            while ((line = cbr.readLine()) != null) {
                lineList = line.split(",");
                new ImportProduct(lineList[1],lineList[2],Double.parseDouble(lineList[3]),Integer.parseInt(lineList[4]),lineList[5],Double.parseDouble(lineList[6]),lineList[7],Double.parseDouble(lineList[8]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File is empty or broken");
        } finally {
            try {
                cbr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void exportReader() {
        try {
            cfr = new FileReader(EXPORT_PRODUCT_PATH);
            cbr = new BufferedReader(cfr);
            while ((line = cbr.readLine()) != null) {
                lineList = line.split(",");
                new ExportProduct(lineList[1],lineList[2],Double.parseDouble(lineList[3]),Integer.parseInt(lineList[4]),lineList[5],Double.parseDouble(lineList[6]),lineList[7]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("File is empty or broken");
        } finally {
            try {
                cbr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
