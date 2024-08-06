package kyu_7.parts_of_a_list.java;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PartlistTest {

    private static void testing(String[][] actual, String[][] expected) {
        assertArrayEquals(expected, actual);
    }

    @Test
    public void test() {
        System.out.println("Fixed Tests partlist");
        String[] s1;
        String[][] a;

        s1 = new String[] {"cdIw", "tzIy", "xDu", "rThG"};
        a = new String[][] {{"cdIw", "tzIy xDu rThG"}, {"cdIw tzIy", "xDu rThG"}, {"cdIw tzIy xDu", "rThG"}};
        testing(Partlist.partlist(s1), a);

        s1 = new String[] {"I", "wish", "I", "hadn't", "come"};
        a = new String[][] {{"I", "wish I hadn't come"}, {"I wish", "I hadn't come"}, {"I wish I", "hadn't come"}, {"I wish I hadn't", "come"}};
        testing(Partlist.partlist(s1), a);

        s1 = new String[] {"vJQ", "anj", "mQDq", "sOZ"};
        a = new String[][] {{"vJQ", "anj mQDq sOZ"}, {"vJQ anj", "mQDq sOZ"}, {"vJQ anj mQDq", "sOZ"}};
        testing(Partlist.partlist(s1), a);
    }
}
