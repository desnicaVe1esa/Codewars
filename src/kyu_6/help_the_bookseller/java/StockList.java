package kyu_6.help_the_bookseller.java;

public class StockList {

    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        StringBuilder result = new StringBuilder();
        if (lstOfArt.length != 0 && lstOf1stLetter.length != 0) {
            for (int i = 0; i < lstOf1stLetter.length; i++) {
                String currentLetter = lstOf1stLetter[i];
                int count = 0;
                for (String currentArt : lstOfArt) {
                    if (currentArt.substring(0, 1).equals(currentLetter)) {
                        String[] artValues = currentArt.split(" ");
                        count += Integer.parseInt(artValues[1]);
                    }
                }
                String stock = "(" + currentLetter + " : " + count + ")";
                if (i != lstOf1stLetter.length - 1) {
                    result.append(stock).append(" - ");
                } else {
                    result.append(stock);
                }
            }
        }
        return result.toString();
    }
}