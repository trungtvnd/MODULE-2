package BUOI42.demo;

import java.io.IOException;
import java.io.InputStream;

public class demo1 {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        while (true){
            System.out.println("Nhập một ký tự");
            int ch = is.read();
            if(ch=='q'){
                System.out.println("Done");
                break;
            }
            is.skip(2);
            System.out.println("ký tự nhận được" + (char) ch);

        }

    }


}
