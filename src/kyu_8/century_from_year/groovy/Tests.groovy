package kyu_8.century_from_year.groovy;

import org.junit.Test

class Tests {
    @Test
    void BasicTests() {
        assert Solution.century(1705) == 18
        assert Solution.century(1900) == 19
        assert Solution.century(1601) == 17
        assert Solution.century(2000) == 20
        assert Solution.century(89) == 1
    }
}