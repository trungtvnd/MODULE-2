package BUOI40.demo;

import java.io.File;
import java.io.FileOutputStream;

public class FileFilter {

    public static void main(String[] args) {

        //Liệt kê tất cả thư mục gốc
//        File [] roots = File.listRoots();
//        for (File root:roots) {
//            System.out.println(root.getAbsolutePath());
//        }

        //Liệt kê tất cả các thu mục và tập tin con trực tiếp của một thư mục
//        System.out.println("File [] listFiles(): ");
//        File dir = new File("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 8");
//        File [] children = dir.listFiles();
//        for (File file:children) {
//            System.out.println(file.getAbsolutePath());
//        }

//        System.out.println("----");
//        System.out.println("String [] list(): ");
//        String[] paths = dir.list();
//        for (String s:paths) {
//            System.out.println(s);
//        }


        //Liệt kê tất cả các thư mục bao gồm các thư mục con cháu

//        FileFilter fileFilter = new FileFilter();
//        File dir = new File("C:\\TRUNGTV\\HOC TAP\\CODEGYM");
//        fileFilter.listChild(dir, 0);
//
//    }
//    private void listChild(File file, int level){
//        if(file.isDirectory()){
//            System.out.println(getPadding(level) + " - " + file.getName());
//            File[] children = file.listFiles();
//            for (File child:children) {
//                this.listChild(child, level+1);
//            }
//        }else {
//            System.out.println(getPadding(level) + " + " +file.getName());
//        }
//    }
//    private String getPadding(int level){
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i <= level ; i++) {
//            sb.append("    ");
//        }
//        return  sb.toString();


    }


}
