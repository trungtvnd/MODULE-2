package BUOI43.baitap.validatetenlop;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String CLASS_NAME = "^[ACP][0-9]{4}[GHIKLM]$";

    public ValidateClassName() {
        pattern = Pattern.compile(CLASS_NAME);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
class ClassNameValidateMain{
    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        System.out.println("Nhập vào tên lớp");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(validateClassName.validate(name));;

    }
}