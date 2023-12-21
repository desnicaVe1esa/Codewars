package your_order_please.java;

import java.util.Arrays;
import java.util.Comparator;

public class Order {
    public static String order(String words) {
        if (words.equals("")) {
            return "";
        }
        String[] arr = words.split(" ");
        Arrays.sort(arr, Comparator.comparingInt(word -> Integer.parseInt(word.replaceAll("\\D+", ""))));
        return String.join(" ", arr);
    }
}