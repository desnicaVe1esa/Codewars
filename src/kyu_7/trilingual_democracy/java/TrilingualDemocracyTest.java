package kyu_7.trilingual_democracy.java;

import org.junit.jupiter.api.Test;

import static kyu_7.trilingual_democracy.java.TrilingualDemocracy.trilingualDemocracy;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrilingualDemocracyTest {

    @Test
    public void testExamples() {
//        test("FFF", 'F');
//        test("IIK", 'K');
//        test("DFK", 'I');
        test("FII", 'F');
    }

    static void test(String group, char want) {
        assertEquals(want, trilingualDemocracy(group.toCharArray()), group);
    }
}

