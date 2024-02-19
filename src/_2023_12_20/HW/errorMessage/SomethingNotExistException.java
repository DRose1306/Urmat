package _2023_12_20.HW.errorMessage;

public class SomethingNotExistException extends RuntimeException {
    public SomethingNotExistException(String message) {
        super(message);
    }
}
