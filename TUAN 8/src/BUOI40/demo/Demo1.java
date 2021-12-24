package BUOI40.demo;

import java.io.File;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        File file = new File("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 8");
        //Kiểm tra sự tồn tại
        System.out.println("Kiểm tra sự tồn tại" + file.exists());
        //Kiểm tra có phải là một folder hay là một file
        if(file.isDirectory()){
            System.out.println("là một thư mục");
        }else  if(file.isFile()){
            System.out.println("là một file");
        }
        //Lấy tên file/thu mục
        System.out.println( file.getName());;
        //lấy đường dẫn tuyệt đối
        System.out.println(file.getAbsolutePath());
        //Lấy kích thước file
        System.out.println(file.length());
        //lấy thời điểm sửa đổi lần cuối
        long lastModifyInMillis = file.lastModified();
        Date lastModifyDate = new Date(lastModifyInMillis);
        System.out.println("THời điểm sửa đổi cuối: " + lastModifyDate);
    }

}
