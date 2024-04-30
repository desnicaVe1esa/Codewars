package kyu_8.determine_offspring_sex_based_on_genes_xx_and_xy_chromosomes.groovy;

import org.junit.Test

class CheckTest {
    @Test
    void BasicTests() {
        assert Check.chromosomeCheck("XY") == "Congratulations! You're going to have a son."
        assert Check.chromosomeCheck("XX") == "Congratulations! You're going to have a daughter."
    }
}