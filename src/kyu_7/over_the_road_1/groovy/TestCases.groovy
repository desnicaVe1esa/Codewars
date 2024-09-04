package kyu_7.over_the_road_1.groovy;

import org.junit.Test

class TestCases {
    @Test
    void basicTestCases() {
        assert CodeWars.overTheRoad(1, 3) == 6;
        assert CodeWars.overTheRoad(3, 3) == 4;
        assert CodeWars.overTheRoad(2, 3) == 5;
        assert CodeWars.overTheRoad(3, 5) == 8;
        assert CodeWars.overTheRoad(7, 11) == 16;
        assert CodeWars.overTheRoad(20, 1000000) == 1999981L;
        assert CodeWars.overTheRoad(23633656673L, 310027696726L) == 596421736780L;
    }
}
