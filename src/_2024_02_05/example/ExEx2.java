package _2024_02_05.example;

import _2024_02_05.SomethingNotExistException;

public class ExEx2 {

    public void div(int a, int b) throws SomethingNotExistException {
        if (b == 0) {
            throw new SomethingNotExistException(ErrorMessage.SOMETHING_NOT_FOUND);
        } else {
            System.out.println(a / b);
        }
    }
}
