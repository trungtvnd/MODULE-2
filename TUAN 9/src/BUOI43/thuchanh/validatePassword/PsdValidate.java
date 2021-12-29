package BUOI43.thuchanh.validatePassword;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PsdValidate {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String PSD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.+[@#$]).{8,20}$";
    public PsdValidate(){
        pattern = Pattern.compile(PSD);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

class PsdMain{
    public static void main(String[] args) {
        PsdValidate psdValidate = new PsdValidate();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập password");
        String psw = sc.nextLine();
        System.out.println(psdValidate.validate(psw));
    }
}
