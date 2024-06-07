package kyu_6.make_the_deadfish_swim.groovy

import org.junit.Test

class ExampleTests {
    @Test
    void "Example Tests"() {
        assert DeadFish.parse("iiisdoso") == [8, 64]
        assert DeadFish.parse("iiisdosodddddiso") == [8, 64, 3600]
    }
}