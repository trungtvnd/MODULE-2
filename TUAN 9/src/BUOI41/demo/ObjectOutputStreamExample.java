package BUOI41.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        OutputStream out;
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("product.txt"));
            Product product = new Product(1, "Iphone", 28000000, "New");
            oos.writeObject(product);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            oos.close();
        }
        System.out.println("Done");
    }
}
