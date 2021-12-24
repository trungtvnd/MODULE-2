package BUOI40.demo;

import java.io.File;
import java.io.FileOutputStream;

public class CreateDirectory {
    public static void main(String[] args) {
        //mkdir: tạo thư mục cho bơi dường dẫn nếu thư mục cha tồn tại
        //mkdirs: tạo thư mực cho bởi đường dẫn bao gồm cả các thư mục cha nếu nó không tồn tại
//        File dir = new File("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 8");
//        System.out.println(dir.exists());
// Với mkdir(), thư mục chỉ được tạo ra nếu thư mục cha tồn tại
//        boolean created = dir.mkdir();
//        System.out.println("directory create "+ created);
//
//        System.out.println("-----");
//        File dir2 = new File("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 8\\created\\abc");
//        System.out.println("PathName" + dir2.getAbsolutePath());
//        System.out.println("File exist" + dir2.exists());
//        created = dir2.mkdirs();
//        System.out.println("Directory" + created);

        //Tạo thư mục khi đã có thư mục cha
    File file = new File("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 8\\create2");
    boolean create2 = file.mkdir();
        System.out.println("Created file dã co thu muc cha: "+ create2);


    }
}
