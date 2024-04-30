package kyu_8.determine_offspring_sex_based_on_genes_xx_and_xy_chromosomes.java;

public class Kata {
    public static String chromosomeCheck(String sperm) {
        return sperm.equals("XY") ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter.";
    }
}