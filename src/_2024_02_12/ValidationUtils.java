package _2024_02_12;


public class ValidationUtils {
//    public boolean isEmailValid(String email) {
//        String emailRegex = "^[A-Za-z0-9+_.-]+@(?:[A-Za-z0-9-]+\\.)+[A-Za-z]{2,}$";
//        boolean b = checker(emailRegex);
//        return b;
//    }
    
    public boolean isPhoneNumberValid(String phoneNumber) {
        String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");

        // Проверка на допустимую длину номера (например, 10 цифр)
        if (digitsOnly.length() != 10) {
            return false;
        }

        // Проверка кода страны (например, должен начинаться с +1 для США)
        if (!digitsOnly.startsWith("+1")) {
            return false;
        }

        return true;
    }
    
    public boolean isPasswordValid(String password) {
        if (password.length() < 8) {
            return false;
        }

        // Пароль должен содержать хотя бы одну заглавную букву (A-Z)
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }

        // Пароль должен содержать хотя бы одну строчную букву (a-z)
        if (!password.matches(".*[a-z].*")) {
            return false;
        }

        // Пароль должен содержать хотя бы одну цифру (0-9)
        if (!password.matches(".*\\d.*")) {
            return false;
        }

        // Пароль должен содержать хотя бы один специальный символ (например, !, @, #, $, %)
        if (!password.matches(".*[!@#$%].*")) {
            return false;
        }

        // Пароль не должен содержать пробелов
        if (password.contains(" ")) {
            return false;
        }

        // Все правила выполнены
        return true;
    }
}
class ValidationUtilsCorrect {

    private static final int MIN_PASSWORD_LENGTH = 8;
    private static final String UPPERCASE_REGEX = ".*[A-Z].*";
    private static final String LOWERCASE_REGEX = ".*[a-z].*";
    private static final String DIGIT_REGEX = ".*\\d.*";
    private static final String SPECIAL_CHAR_REGEX = ".*[!@#$%].*";


    public boolean isPhoneNumberValid(String phoneNumber) {
        String digitsOnly = phoneNumber.replaceAll("[^0-9]", "");

        if (digitsOnly.length() != 10) {
            return false;
        }

        if (!phoneNumber.startsWith("+")) {
            return false;
        }

        return true;
    }

    public boolean isPasswordValid(String password) {
        if (password.length() < MIN_PASSWORD_LENGTH) {
            return false;
        }

        if (!password.matches(UPPERCASE_REGEX) ||
                !password.matches(LOWERCASE_REGEX) ||
                !password.matches(DIGIT_REGEX) ||
                !password.matches(SPECIAL_CHAR_REGEX) ||
                password.contains(" ")) {
            return false;
        }

        return true;
    }
}

