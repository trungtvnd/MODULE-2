package BUOI43.demo.regexPassword;

import java.util.regex.Pattern;

public class ValidatePassword {
    private Pattern pattern;
    private static final String PSW="((?=.+d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!.#$@_+,?-]).{8,50})";

    public ValidatePassword() {
        this.pattern = Pattern.compile(PSW);
    }
    public boolean validate(final String psw){
        return pattern.matcher(psw).matches();
    }
}

class CheckPsw{
    public static void main(String[] args) {
        ValidatePassword validatePassword = new ValidatePassword();
        System.out.println(validatePassword.validate("Oxus20@2014"));
        System.out.println(validatePassword.validate("Oxus.20_14"));

        System.out.println(validatePassword.validate("Oxus202014"));
    }
}
