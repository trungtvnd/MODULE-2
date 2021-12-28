package BUOI41.demo;

import java.io.*;

public class demo2 {
    public static void main(String[] args) throws IOException {
        try {
            InputStream is = new FileInputStream("CodeGym.txt");
            int i= -1;
            while ((i = is.read())!=-1){
                System.out.println((char) i);
            }
            is.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
