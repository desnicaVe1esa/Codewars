package kyu_8.determine_offspring_sex_based_on_genes_xx_and_xy_chromosomes.groovy

class Check {
    static chromosomeCheck(String sperm) {
        return sperm.equals("XY") ? "Congratulations! You're going to have a son." : "Congratulations! You're going to have a daughter."
    }
}
