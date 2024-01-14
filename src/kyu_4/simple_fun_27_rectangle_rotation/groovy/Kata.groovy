package kyu_4.simple_fun_27_rectangle_rotation.groovy

class Kata {
    static rectangleRotation(a, b) {
        def x = Math.floor(a / Math.sqrt(2)).toLong();
        def y = Math.floor(b / Math.sqrt(2)).toLong();
        def r = (x + 1) * (y + 1) + x * y;
        return r + r % 2 - 1;
    }
}