package kyu_8.is_your_period_late.java;

import java.time.*;
import static java.time.temporal.ChronoUnit.*;

public class PeriodTime {
    public static boolean periodIsLate(LocalDate last,LocalDate today,int cycleLength) {
        return DAYS.between(last, today) > cycleLength;
    }
}
