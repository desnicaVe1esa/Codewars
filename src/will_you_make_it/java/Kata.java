package will_you_make_it.java;

public class Kata {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return !(distanceToPump > mpg * fuelLeft);
    }
}
