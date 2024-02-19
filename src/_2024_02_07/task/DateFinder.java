package _2024_02_07.task;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Найдите все даты в формате "DD/MM/YYYY" в строке.
 */
public class DateFinder {
    public static List<String> findDates(String input) {
        List<String> dates = new ArrayList<>();
        String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            dates.add(matcher.group());
        }
        return dates;
    }

    public static void main(String[] args) {
        String text = "The meeting is scheduled for 25/09/2023. Please RSVP by 20/09/2023.";
        List<String> dates = findDates(text);
        for (String date : dates) {
            System.out.println(date);
        }
    }
}
