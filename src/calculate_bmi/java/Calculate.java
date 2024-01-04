package calculate_bmi.java;

public class Calculate {
    public static String bmi(double weight, double height) {
        if (weight / (height * height) <= 18.5) {
            return "Underweight";
        } else if (weight / (height * height) <= 25.0) {
            return "Normal";
        } else if (weight / (height * height) <= 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}