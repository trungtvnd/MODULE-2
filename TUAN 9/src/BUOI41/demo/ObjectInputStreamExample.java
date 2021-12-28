package BUOI41.demo;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    public static void main(String[] args) {
        try {

            InputStream is = new FileInputStream("product.txt");
            ObjectInputStream ois = new ObjectInputStream(is);
            Product product = (Product) ois.readObject();
            System.out.println(product);
            ois.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
