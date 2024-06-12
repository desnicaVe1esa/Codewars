package kyu_8.find_nearest_square_number.groovy;

class Kata {
    static def nearestSq(def n) {
        return (int) Math.pow(Math.round(Math.sqrt(n)),2)
    }
}