package homework.hw_17_04;

interface Validator {
    boolean validate(String input);
}

class EmailValidator implements Validator{
    @Override
    public boolean validate(String input){
        return input.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
    }
}

class PasswordValidator implements Validator{
    @Override
    public boolean validate(String input){
        return input.matches("(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}");
    }
}

class PhoneNumberValidator implements Validator{
    public boolean validate(String input){
        return input.matches("\\+\\d{1,3} \\d{3} \\d{7}");
    }
}

public class Sadhu{
    public static void main(String[] args){
        Validator emailValidator = new EmailValidator();
        boolean isEmailValid = emailValidator.validate("israpil_theangel@gmail.com");
        System.out.println(isEmailValid);
        Validator passwordValidator = new PasswordValidator();
        boolean isPasswordValid = passwordValidator.validate("Randomshitalltogther123");
        System.out.println(isPasswordValid);
        Validator phoneNumberValidator = new PhoneNumberValidator();
        boolean isPhoneNumberValid = phoneNumberValidator.validate("+996 999 999 009");
        System.out.println(isPhoneNumberValid);
    }
}
