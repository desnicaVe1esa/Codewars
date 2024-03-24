package kyu_8.beginner_series_number_2_clock.groovy;

class Kata {
    static past(h, m, s) {
        return (s * 1_000) + (m * 60_000) + (h * 3_600_000 )
    }
}