package function_1_hello_world.groovy

import org.junit.Test

class Tests {
    @Test
    void SimpleCheck() {
        assert Greet.greet() == "hello world!"
    }
}
