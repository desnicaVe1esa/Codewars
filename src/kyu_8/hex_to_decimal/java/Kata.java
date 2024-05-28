package kyu_8.hex_to_decimal.java;

public class Kata {

  public static int hexToDec(final String hexString) {
    String digits = "0123456789abcdef";
    String preparedStr = hexString.replaceAll("-", "");
    int result = 0;
    for (int i = 0; i < preparedStr.length(); i++) {
        result = result * 16 + digits.indexOf(preparedStr.toLowerCase().charAt(i));
    }
    return hexString.contains("-") ? -1 * result : result;
  }

}