package kyu_8.training_js_number_7_if_dot_else_and_ternary_operator.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaleHotdogsTest {
    @Test
    public void BasicTests() {
        assertEquals(100, SaleHotdogs.saleHotdogs(1));
        assertEquals(400, SaleHotdogs.saleHotdogs(4));
        assertEquals(475, SaleHotdogs.saleHotdogs(5));
        assertEquals(855, SaleHotdogs.saleHotdogs(9));
        assertEquals(900, SaleHotdogs.saleHotdogs(10));
        assertEquals(9000, SaleHotdogs.saleHotdogs(100));
    }
}