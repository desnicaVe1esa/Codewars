package kyu_6.stop_gninnips_my_sdrow;

// Функция, которая принимает строку из одного или нескольких слов и возвращает ту же строку,
// но со всеми пятью или более буквенными словами в обратном порядке.
// Передаваемые строки будут состоять только из букв и пробелов.
// Пробелы будут включены только в том случае, если присутствует более одного слова.

import java.util.ArrayList;
import java.util.List;

public class SpinWords {

    public String spinWords(String sentence) {
        List<String> result = new ArrayList<>();
        if (sentence.length() == 5) {
            return String.valueOf(new StringBuilder(sentence).reverse());
        }
        if(sentence.length() > 5) {
            String[] strings = sentence.split(" ");
            for (String s : strings) {
                if (s.length() < 5) {
                    result.add(s);
                }
                if (s.length() >= 5) {
                    result.add(String.valueOf(new StringBuilder(s).reverse()));
                }
            }
        }
        return String.join(" ", result);
    }
}

