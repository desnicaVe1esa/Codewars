package return_negative.groovy

class Kata {
    static makeNegative(number) {
        return number < 0 ? number : number * -1;
    }
}