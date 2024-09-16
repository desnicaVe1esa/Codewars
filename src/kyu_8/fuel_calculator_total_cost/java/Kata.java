package kyu_8.fuel_calculator_total_cost.java;

public class Kata{
    public static double fuelPrice(int litres, double pricePerLitre) {
        return litres * (pricePerLitre - Math.min((double) litres / 2 * 0.05, 0.25));
    }
}