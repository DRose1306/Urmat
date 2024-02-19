package _2023_12_20.HW.errorMessage;

public class SomethingWentWrongExeption extends RuntimeException {
    public SomethingWentWrongExeption(String message) {
        super(message);
    }
}
