package human_readable_duration_format;

// Функция, которая форматирует длительность, заданную в виде количества секунд, удобным для человека способом.
// Функция должна принимать неотрицательное целое число. Если оно равно нулю, оно просто возвращает "сейчас".
// В противном случае продолжительность выражается в виде комбинации лет, дней, часов, минут и секунд.

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        return seconds == 0 ? "now" :
                Arrays.stream(
                                new String[]{
                                        formatTime("year",  (seconds / 31536000)),
                                        formatTime("day",   (seconds / 86400)%365),
                                        formatTime("hour",  (seconds / 3600)%24),
                                        formatTime("minute",(seconds / 60)%60),
                                        formatTime("second",(seconds%3600)%60)})
                        .filter(e -> !Objects.equals(e, ""))
                        .collect(Collectors.joining(", "))
                        .replaceAll(", (?!.+,)", " and ");
    }
    public static String formatTime(String s, int time){
        return time == 0 ? "" : time + " " + s + (time == 1 ? "" : "s");
    }
}
