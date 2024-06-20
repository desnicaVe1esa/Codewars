package kyu_5.histogram_v1.java;

public class Dinglemouse {

    public static String histogram(final int[] results) {
        StringBuilder result = new StringBuilder();
        int max = -1;
        for (int i : results) {
            if (i > max)
                max = i;
            max++;
        }
        while (max > 0) {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                if (results[i] == max - 1 && results[i] > 0) {
                    line.append(results[i]);
                    if (results[i] < 10)
                        line.append(" ");
                } else {
                    line.append(results[i] >= max ? "# " : "  ");
                }
            }
            line = new StringBuilder(line.toString().replaceAll("( )+$", ""));
            if (line.length() > 0)
                result.append(line).append("\n");
            max--;
        }
        result.append("-----------\n");
        result.append("1 2 3 4 5 6\n");
        return result.toString();
    }
}