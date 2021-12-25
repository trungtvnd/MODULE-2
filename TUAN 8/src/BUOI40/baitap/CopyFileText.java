package BUOI40.baitap;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<String> stringList = copyFileText.readFile("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 8\\src\\BUOI40\\baitap\\sourceFile");
        copyFileText.writeToFile(stringList, "src/BUOI40/baitap/targetFile.txt");

    }
    public List<String> readFile(String path){
        List<String> stringList = null;
        File file = new File(path);
        if(!file.exists()){
            try {
                throw  new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        try {
            stringList = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public void writeToFile(List<String> stringList, String path){
        File file;
        try {
            //FileWriter fw = new FileWriter(path, true); ghi tiep vào cuoi
            //FileWriter fw = new FileWriter(path);  ghi đè

            FileWriter fw = new FileWriter(path, true);
            //Su dung bufferwwriter dẻ tăng tốc độ ghi
            BufferedWriter bf = new BufferedWriter(fw);

            for (String string: stringList) {
//                fw.write(string + "\n");
                bf.write(string + "\n");
            }
//            fw.close();
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
