package BUOI40.thuchanh.doctxt;

import javax.swing.filechooser.FileFilter;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileFindMax {
    public static void main(String[] args) throws FileNotFoundException {
        ReadFileFindMax readFileFindMax = new ReadFileFindMax();
        List<Integer> numbers = readFileFindMax.readFile("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 8\\src\\BUOI40\\thuchanh\\doctxt\\numberFindMax");
        int maxValue = findMax(numbers);
        readFileFindMax.writeFile("C:\\TRUNGTV\\HOC TAP\\CODEGYM\\MODULE2\\FILE CODE\\MODULE 2\\TUAN 8\\src\\BUOI40\\thuchanh\\doctxt\\outputFindMax", maxValue);


    }

    public List<Integer> readFile(String filePath) throws FileNotFoundException {
        List<Integer> numbers = new ArrayList<>();
        try{
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine())!=null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();

        }catch (Exception e){
            System.err.println("File không tồn tại hoặc có lỗi");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max){
        try{
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất là: " + max);
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(max < numbers.get(i)){
                max = numbers.get(i);
            }
        }return max;
    }

}
