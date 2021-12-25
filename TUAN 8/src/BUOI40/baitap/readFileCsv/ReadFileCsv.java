package BUOI40.baitap.readFileCsv;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class ReadFileCsv {
    public static void main(String[] args) {
        ReadFileCsv readFileCsv = new ReadFileCsv();
        List<String> stringList = readFileCsv.ReadFile("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 8\\src\\BUOI40\\baitap\\readFileCsv\\sourceFile.csv");
        for (String s : stringList) {
            System.out.println(s);
        }
    }

    public List<String> ReadFile(String path) {
       List<String> list = new ArrayList<>();
        File file = new File(path);
        if (!file.exists()) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        try {
            List<String> stringList = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            String str1 = null;
            while ((line = br.readLine())!= null){
                stringList.add(line);
            }
            for (String s : stringList) {
                str1 = s.replace(",", "\t");
                list.add(str1);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
