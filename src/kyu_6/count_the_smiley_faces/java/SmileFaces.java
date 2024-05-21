package kyu_6.count_the_smiley_faces.java;

import java.util.List;
import java.util.regex.Pattern;

public class SmileFaces {

  public static int countSmileys(List<String> arr) {
    Pattern pattern = Pattern.compile("[:;][-~]?[)D]");
    int result = 0;
    for (String str : arr) {
      if (str.matches(String.valueOf(pattern))) {
        result++;
      }
    }
    return result;
  }
}