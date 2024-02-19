package _2024_02_07.task;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Найдите все
 * HTML теги в строке (например, "<div>", "<a href='...'>").
 */

public class HtmlTagFinder {
    public static List<String> findHtmlTags(String input) {
        List<String> tags = new ArrayList<>();

        String regex = "<[^>]+>";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String tag = matcher.group();
            tags.add(tag);
        }

        return tags;
    }

    public static void main(String[] args) {
        String text = "<div class='content'>This is some <b>formatted</b> text.</div>";
        List<String> htmlTags = findHtmlTags(text);
        for (String tag : htmlTags) {
            System.out.println(tag);
        }
    }
}
