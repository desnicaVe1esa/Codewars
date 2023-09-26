package return_negative.groovy

class Test {

    @org.junit.Test
    void sampleTests() {
        assert Kata.makeNegative(42) == -42
        assert Kata.makeNegative(-9) == -9
        assert Kata.makeNegative(0) == 0
        assert Kata.makeNegative(1) == -1
        assert Kata.makeNegative(-1) == -1
    }
}
