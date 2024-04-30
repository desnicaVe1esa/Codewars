package kyu_8.determine_offspring_sex_based_on_genes_xx_and_xy_chromosomes.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", Kata.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", Kata.chromosomeCheck("XX"));
    }
}