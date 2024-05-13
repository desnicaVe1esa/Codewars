package kyu_7.simple_fun_number_74_growing_plant.groovy;

class Kata {
    static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int currentHeight = 0;
        int days = 1;
        for (int i = 1; ; i++) {
            currentHeight += upSpeed;
            if (currentHeight >= desiredHeight) {
                break;
            } else {
                currentHeight -= downSpeed;
            }
            days++;
        }
        return days;
    }
}