package kyu_5.histogram_v1.java;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Examples {

    @Test
    public void basic() {
        final String expected =
                "    10\n" +
                        "    #\n" +
                        "    #\n" +
                        "7   #\n" +
                        "#   #\n" +
                        "#   #     5\n" +
                        "#   #     #\n" +
                        "# 3 #     #\n" +
                        "# # #     #\n" +
                        "# # # 1   #\n" +
                        "# # # #   #\n" +
                        "-----------\n" +
                        "1 2 3 4 5 6\n";
        assertEquals(expected, Dinglemouse.histogram(new int[]{7, 3, 10, 1, 0, 5}));
    }
}
