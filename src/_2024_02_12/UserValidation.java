package _2024_02_12;


public class UserValidation {
    public boolean validateUsername(String username) {
        // Проверка на длину имени
        if (username.length() < 6 || username.length() > 20) {
            return false;
        }
        
        // Проверка на наличие специальных символов
        if (!username.matches("^[a-zA-Z0-9]+$")) {
            return false;
        }
        
        return true;
    }
    
    public boolean validateEmail(String email) {
        // Проверка на длину email
        if (email.length() < 6 || email.length() > 50) {
            return false;
        }
        
        // Проверка на наличие символа '@'
        if (!email.contains("@")) {
            return false;
        }
        
        return true;
    }

}
class UserValidationCorrect {

    private static final int MIN_USERNAME_LENGTH = 6;
    private static final int MAX_USERNAME_LENGTH = 20;
    private static final int MIN_EMAIL_LENGTH = 6;
    private static final int MAX_EMAIL_LENGTH = 50;
    private static final String USERNAME_REGEX = "^[a-zA-Z0-9]+$";

    public boolean validateUsername(String username) {
        if (username == null || username.length() < MIN_USERNAME_LENGTH || username.length() > MAX_USERNAME_LENGTH) {
            return false;
        }

        if (!username.matches(USERNAME_REGEX)) {
            return false;
        }

        return true;
    }

    public boolean validateEmail(String email) {
        if (email == null || email.length() < MIN_EMAIL_LENGTH || email.length() > MAX_EMAIL_LENGTH) {
            return false;
        }

        if (!email.contains("@")) {
            return false;
        }

        return true;
    }
}
