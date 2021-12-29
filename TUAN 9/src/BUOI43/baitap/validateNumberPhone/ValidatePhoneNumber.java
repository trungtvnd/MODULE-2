package BUOI43.baitap.validateNumberPhone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private Pattern pattern;
    private Matcher matcher;
    private static final String PHONE_NUMBER = "^\\([0-9]{2,4}\\)\\-\\(0[0-9]{9,10}\\)$";
    public ValidatePhoneNumber(){
        pattern = Pattern.compile(PHONE_NUMBER);
    }
    public boolean checkPhoneNumber(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        System.out.println("Nhập số đt");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        System.out.println(validatePhoneNumber.checkPhoneNumber(number));;
    }

}
