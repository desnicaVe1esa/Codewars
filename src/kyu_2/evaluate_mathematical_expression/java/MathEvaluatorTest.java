package kyu_2.evaluate_mathematical_expression.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MathEvaluatorTest {
    @Test public void testAddition() {
        assertEquals(2d, new MathEvaluator().calculate("1+1"), 0.01);
    }

    @Test public void testSubtraction() {
        assertEquals(0d, new MathEvaluator().calculate("1 - 1"), 0.01);
    }

    @Test public void testMultiplication() {
        assertEquals(1d, new MathEvaluator().calculate("1* 1"), 0.01);
    }

    @Test public void testDivision() {
        assertEquals(1d, new MathEvaluator().calculate("1 /1"), 0.01);
    }

    @Test public void testNegative() {
        assertEquals(-123d, new MathEvaluator().calculate("-123"), 0.01);
    }

    @Test public void testLiteral() {
        assertEquals(123d, new MathEvaluator().calculate("123"), 0.01);
    }

    @Test public void testExpression() {
        assertEquals(21.25, new MathEvaluator().calculate("2 /2+3 * 4.75- -6"), 0.01);
    }

    @Test public void testSimple() {
        assertEquals(1476d, new MathEvaluator().calculate("12* 123"), 0.01);
    }

    @Test public void testComplex() {
        assertEquals(7.732, new MathEvaluator().calculate("2 / (2 + 3) * 4.33 - -6"), 0.01);
    }
}
