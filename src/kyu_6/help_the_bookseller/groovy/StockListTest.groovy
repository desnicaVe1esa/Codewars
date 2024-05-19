package kyu_6.help_the_bookseller.groovy

import org.junit.Test

import static org.junit.Assert.assertEquals;

public class StockListTest {

    private static void testing(String[] lstOfArt, String[] lstOfCat, String expect) {
        String actual = StockList.stockSummary(lstOfArt, lstOfCat)
        assertEquals(expect, actual)
    }
    @Test
    public void basicTests() {
        String[] b = ["BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"]
        String[]  c = ["A", "B", "C", "D"]
        String res = "(A : 0) - (B : 1290) - (C : 515) - (D : 600)"
        testing(b, c, res)

        b = ["ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"]
        c = ["A", "B"]
        res = "(A : 200) - (B : 1140)"
        testing(b, c, res)

    }
}