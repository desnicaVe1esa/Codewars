package kyu_6.help_the_bookseller.groovy;

public class StockList {
    public static String stockSummary(String[] lstOfArt, String[] lstOfCat) {
        if (lstOfArt == [] || lstOfCat == []) return ""
        lstOfCat.collect { cat ->
            def count = lstOfArt.collect { it ->
                (it[0] == cat) ? it.split().last().toInteger() : 0
            }.sum()
            "($cat : $count)"
        }.join(' - ')
    }
}