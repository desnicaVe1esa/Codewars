package kyu_8.thinkful_logic_drills_traffic_light.java;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class SolutionTest {
    @Test
    public void update_light() {
        assertEquals("green", TrafficLights.updateLight("red"));
        assertEquals("yellow", TrafficLights.updateLight("green"));
        assertEquals("red", TrafficLights.updateLight("yellow"));
    }
}
