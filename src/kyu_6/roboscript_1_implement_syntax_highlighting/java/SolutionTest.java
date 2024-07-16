package kyu_6.roboscript_1_implement_syntax_highlighting.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void descriptionExamples() {
        System.out.println("Code without syntax highlighting:   F3RF5LF7");
        System.out.println("Your code with syntax highlighting: " + RoboScript.highlight("F3RF5LF7"));
        System.out.println("Expected syntax highlighting:       <span style=\"color: pink\">F</span><span style=\"color: orange\">3</span><span style=\"color: green\">R</span><span style=\"color: pink\">F</span><span style=\"color: orange\">5</span><span style=\"color: red\">L</span><span style=\"color: pink\">F</span><span style=\"color: orange\">7</span>");
        assertEquals("<span style=\"color: pink\">F</span><span style=\"color: orange\">3</span><span style=\"color: green\">R</span><span style=\"color: pink\">F</span><span style=\"color: orange\">5</span><span style=\"color: red\">L</span><span style=\"color: pink\">F</span><span style=\"color: orange\">7</span>", RoboScript.highlight("F3RF5LF7"));

        System.out.println("Code without syntax highlighting:   FFFR345F2LL");
        System.out.println("Your code with syntax highlighting: " + RoboScript.highlight("FFFR345F2LL"));
        System.out.println("Expected syntax highlighting:       <span style=\"color: pink\">FFF</span><span style=\"color: green\">R</span><span style=\"color: orange\">345</span><span style=\"color: pink\">F</span><span style=\"color: orange\">2</span><span style=\"color: red\">LL</span>");
        assertEquals("<span style=\"color: pink\">FFF</span><span style=\"color: green\">R</span><span style=\"color: orange\">345</span><span style=\"color: pink\">F</span><span style=\"color: orange\">2</span><span style=\"color: red\">LL</span>", RoboScript.highlight("FFFR345F2LL"));
    }

}
