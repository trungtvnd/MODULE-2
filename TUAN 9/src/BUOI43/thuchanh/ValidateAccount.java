package BUOI43.thuchanh;

import BUOI43.thuchanh.validatePassword.PsdValidate;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAccount {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String ACCOUNT = "^[_a-z0-9]{6,}$";
    public ValidateAccount(){
        pattern = Pattern.compile(ACCOUNT);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
class AccountMain {
    public static void main(String[] args) {
        ValidateAccount validateAccount = new ValidateAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập password");
        String acc = sc.nextLine();
        System.out.println(validateAccount.validate(acc));
    }
}