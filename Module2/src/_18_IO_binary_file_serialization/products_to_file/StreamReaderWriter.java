package _18_IO_binary_file_serialization.products_to_file;

import java.io.*;
import java.util.List;

public class StreamReaderWriter {

    static final String FILE_PATH = "E:\\C0720G1-TranAnhKhoa\\Module2\\src\\_18_IO_binary_file_serialization\\products_to_file\\Products.csv";
    public static void writer(String filePath) {

        try {
            OutputStream os = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(Product.list);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> reader(String filePath) {
        List<Product> content = null;
        try {
            InputStream is = new FileInputStream(filePath);
            ObjectInputStream oi = new ObjectInputStream(is);
            content = (List<Product>) oi.readObject();
            oi.close();

        } catch (EOFException ignored) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return content;
    }
    public static void main(String[] args) {
        Product prd1 = new Product("Galaxy S1","Samsung",10000f,"very old phone");
        Product prd2 = new Product("Galaxy S2","Samsung",10000f,"old phone");
        Product prd3 = new Product("Galaxy S3","Samsung",10000f,"old but better phone");
        writer(FILE_PATH);
        List<Product> prdList = reader(FILE_PATH);
        for (Product prd: prdList) {
            System.out.println(prd);
        }
    }
}
