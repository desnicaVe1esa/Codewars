package kyu_7.predict_your_age.groovy

import org.junit.Test

class Tests {
    @Test
    void BasicTests() {
        assert Solution.predictAge(65, 60, 75, 55, 60, 63, 64, 45) == 86
        assert Solution.predictAge(32, 54, 76, 65, 34, 63, 64, 45) == 79
    }
}