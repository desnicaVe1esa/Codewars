package kyu_6.extract_portion_of_file_name.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
        Pattern pattern = Pattern.compile("(?<=\\d_)[^.]+.[A-Za-z0-9]+");
        Matcher matcher = pattern.matcher(dirtyFileName);
        String result = "";
        if (matcher.find()){
            result = matcher.group(0);
        }
        return result;
    }
}
