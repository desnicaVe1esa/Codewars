package kyu_5.molecule_to_atoms.java;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.*;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class SolutionTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {Arrays.asList("H", "O"),
                Arrays.asList(2, 1),
                "H2O",
                "water"},

                {Arrays.asList("Mg", "H", "O"),
                        Arrays.asList(1, 2, 2),
                        "Mg(OH)2",
                        "magnesium hydroxide"},

                {Arrays.asList("K", "O", "N", "S"),
                        Arrays.asList(4, 14, 2, 4),
                        "K4[ON(SO3)2]2",
                        "Fremy's salt"},
        });
    }

    private Map<String, Integer> expected;
    private String formula, name;

    public SolutionTest(List<String> atoms, List<Integer> nums, String formula, String name) {
        Map<String, Integer> exp = new HashMap<>();
        for (int i = 0; i < atoms.size(); i++) exp.put(atoms.get(i), nums.get(i));

        this.expected = exp;
        this.formula = formula;
        this.name = name;
    }

    @Test
    public void testMolecule() {
        System.out.println(expected);
        assertEquals(String.format("Should parse %s: %s", name, formula), expected, ParseMolecule.getAtoms(formula));
    }
}

