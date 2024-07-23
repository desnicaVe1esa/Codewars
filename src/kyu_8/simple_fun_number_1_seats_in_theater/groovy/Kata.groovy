package kyu_8.simple_fun_number_1_seats_in_theater.groovy;

class Kata {
    static def seatsInTheater(totCols, totRows, col, row) {
        return (totCols - col + 1) * (totRows - row)
    }
}