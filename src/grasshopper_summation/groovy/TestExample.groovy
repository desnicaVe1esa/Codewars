package grasshopper_summation.groovy

import org.junit.Test

class TestExample {
    @Test
    void test1() {
        assert 1 == GrassHopper.summation(1)
    }
    @Test
    void test2() {
        assert 36 == GrassHopper.summation(8)
    }
}
