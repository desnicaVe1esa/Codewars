package kyu_8.make_upper_case.groovy

import org.junit.Test
class SolutionTest {
    @Test
    void testSomething() {
        assert Upper.makeUpperCase("hello") == "HELLO";
        assert Upper.makeUpperCase("hello world") == "HELLO WORLD";
        assert Upper.makeUpperCase("hello world !") == "HELLO WORLD !";
        assert Upper.makeUpperCase("heLlo wORld !") == "HELLO WORLD !";
        assert Upper.makeUpperCase("1,2,3 hello world!") == "1,2,3 HELLO WORLD!";
    }
}

