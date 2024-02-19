package otherTask;

import java.util.Arrays;
import java.util.Random;

public class AlgorithmLuna {
    public static void main(String[] args) {
       String validCardNum = validCardNum();
        System.out.println(validCardNum);
    }

    private static String genrateCardNumber() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            stringBuilder.append(random.nextInt(9));
        }

        return stringBuilder.toString();
    }

    private static boolean isValid(String cardNum) {
        int sum = 0;
        int nDigits = cardNum.length();
        int parity = nDigits % 2;

        for (int i = 0; i < cardNum.length(); i++) {
            int digit = Character.getNumericValue(cardNum.charAt(i));

            if (i % 2 == parity) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }

            sum += digit;
        }

        return sum % 10 == 0;
    }

    private static String makeValid(String cardNum) {
        for (int i = 0; i < cardNum.length(); i++) {
            if (Character.isDigit(cardNum.charAt(i))) {
                int originalDigit = Character.getNumericValue(cardNum.charAt(i));

                for (int j = 0; j <= 9; j++) {
                    if (j != originalDigit) {

                        StringBuilder sB = new StringBuilder(cardNum);
                        sB.setCharAt(i, Character.forDigit(j, 10));

                        if (isValid(sB.toString())) {
                            return sB.toString();
                        }
                    }
                }
            }
        }
        return cardNum;
    }
    private static String validCardNum(){
        String cardNum = genrateCardNumber();

        boolean isValid = isValid(cardNum);

        if (!isValid) {
            cardNum = makeValid(cardNum);
        }
        return cardNum;
    }
}
