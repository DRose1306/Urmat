package _2024_02_12;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public class DateUtils {
    public static String formatDateForDisplay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
    
    public static String formatTimeForDisplay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return sdf.format(date);
    }
    

    public static String formatDateTimeForDisplay(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(date);
    }
}
class DateUtils2 {

    public static String formatDate(Date date) {
        return formatDateTimeForDisplay(date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDateTime());
    }

    public static String formatTime(Date date) {
        return formatDateTimeForDisplay(date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDateTime());
    }

    public static String formatDateTime(Date date) {
        return formatDateTimeForDisplay(date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDateTime());
    }

    public static String formatDateTimeForDisplay(LocalDateTime localDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return localDateTime.format(formatter);
    }
}
class DateUtils3 {

    private static final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static String formatDateForDisplay(Date date) {
        return formatDateTimeForDisplay(date);
    }

    public static String formatTimeForDisplay(Date date) {
        return formatDateTimeForDisplay(date);
    }

    public static String formatDateTimeForDisplay(Date date) {
        return dateTimeFormat.format(date);
    }
}