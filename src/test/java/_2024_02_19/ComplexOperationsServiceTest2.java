package _2024_02_19;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ComplexOperationsServiceTest2 {
    private final ComplexOperationsService service = new ComplexOperationsService();

    @ParameterizedTest
    @ValueSource(strings = {"strongPassword1@", "ABCde123*", "JAVApro124+"})
    void validatePasswordStrengthTest(String password) {
        Assertions.assertTrue(service.validatePasswordStrength(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"weak", "noDigit*", "NoSpecialChar1"})
    void validatePasswordStrengthTest2(String password) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.validatePasswordStrength(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"java", "databace", "messege", "file"})
    void processTextTest(String text) {
        Assertions.assertFalse(service.processText(text));
    }

    @ParameterizedTest
    @ValueSource(strings = {"error databace", "wrong messege", "fail file"})
    void processText2Test(String text) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> service.processText(text));
    }

    @ParameterizedTest
    @CsvSource({"1,2,3", "one,two,three", "10,,20", "5.5,6.5"})
    void sumOfNumbersInStringTest(String numbers) {
        if (numbers.matches(".*[a-zA-Z]+.*") || numbers.contains(",,")) {
            assertThrows(IllegalArgumentException.class, () -> service.sumOfNumbersInString(numbers));
        } else {
            Assertions.assertTrue(service.sumOfNumbersInString(numbers));
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"http://valid.com", "https://valid.com", "ftp://invalid.com", "justtext"})
    void validateUrlFormatTest(String url) {
        if (!url.startsWith("http")) {
            assertThrows(IllegalArgumentException.class, () -> service.validateUrlFormat(url));
        } else {
            assertTrue(service.validateUrlFormat(url));
        }
    }

    public static Stream<Arguments> emailListProvider() {
        return Stream.of(
                Arguments.of(Arrays.asList("valid@email.com", "invalid-email"), false),
                Arguments.of(Arrays.asList("valid@email.com", "also.valid@email.com"), true)
        );
    }

    // Example test method using @MethodSource for email lists
    @ParameterizedTest
    @MethodSource("emailListProvider")
    void checkEmailListConsistencyTest(List<String> emails, boolean isValid) {
        if (!isValid) {
            assertThrows(IllegalArgumentException.class, () -> service.checkEmailListConsistency(emails));
        } else {
            assertTrue(service.checkEmailListConsistency(emails));
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"Asa", "argentinamanitnegra"})
    void checkStringPalindromeTest(String word) {
        assertTrue(service.checkStringPalindrome(word));
    }

    @ParameterizedTest
    @ValueSource(strings = {"java pro", "some string"})
    void checkStringPalindromeTest2(String word) {
        assertThrows(IllegalArgumentException.class, () -> service.checkStringPalindrome(word));
    }


    /********/
    @ParameterizedTest
    @ValueSource(strings = {"ab123456", "cd098765"})
    void validateIdentificationNumberTest(String id) {
        assertTrue(service.validateIdentificationNumber(id));
    }

    @ParameterizedTest
    @ValueSource(strings = {"A1B23456", "ABC1234567"})
    void testInvalidIdentificationNumberFormat(String id) {
        assertThrows(IllegalArgumentException.class, () -> service.validateIdentificationNumber(id));
    }

    @Test
    void testNullIdentificationNumber() {
        assertThrows(NullPointerException.class, () -> service.validateIdentificationNumber(null));
    }

    @Test
    void testEmptyIdentificationNumber() {
        assertThrows(IllegalArgumentException.class, () -> service.validateIdentificationNumber(""));
    }

    /*******/

    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(Arrays.asList(1, 2, 3, 4, 5), 10),
                Arguments.of(Arrays.asList(5, 10, 15, 20), 40),
                Arguments.of(Arrays.asList(2, 4, 6, 8), 25)
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void checkSumOfListAgainstThresholdTest(List<Integer> numbers, int threshold) {
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        if (sum <= threshold || numbers.isEmpty()) {
            assertThrows(IllegalArgumentException.class, () -> service.checkSumOfListAgainstThreshold(numbers, threshold));
        } else {
            assertTrue(service.checkSumOfListAgainstThreshold(numbers, threshold));
        }
    }

    /*********/

    @ParameterizedTest
    @ValueSource(strings = {"192.168.0.1", "10.0.0.255", "127.0.0.1", "255.255.255.0"})
    void validateIPAddressTest(String ipAddress) {
        if (!ipAddress.matches("^([0-9]{1,3}\\.){3}[0-9]{1,3}$") || ipAddress.equals("")) {
            assertThrows(IllegalArgumentException.class, () -> service.validateIPAddress(ipAddress));
        } else {
            assertTrue(service.validateIPAddress(ipAddress));
        }
    }
}