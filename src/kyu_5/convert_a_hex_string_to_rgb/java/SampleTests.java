package kyu_5.convert_a_hex_string_to_rgb.java;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sample tests")
class SampleTests {

    @Test
    @DisplayName("#111111 -> {r: 17, g: 17, b: 17}")
    void allOne() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("r", 17);
        map.put("g", 17);
        map.put("b", 17);
        assertEquals(map, HexToRGB.hexStringToRGB("#111111"));
    }

    @Test
    @DisplayName("#000000 -> {r: 0, g: 0, b: 0}")
    void allZeros() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("r", 0);
        map.put("g", 0);
        map.put("b", 0);
        assertEquals(map, HexToRGB.hexStringToRGB("#000000"));
    }

    @Test
    @DisplayName("#FF9933 -> {r: 255, g: 153, b: 51}")
    void customTest1() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("r", 255);
        map.put("g", 153);
        map.put("b", 51);
        assertEquals(map, HexToRGB.hexStringToRGB("#FF9933"));
    }

    @Test
    @DisplayName("#beaded -> {r: 190, g: 173, b: 237}")
    void customTest2() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("r", 190);
        map.put("g", 173);
        map.put("b", 237);
        assertEquals(map, HexToRGB.hexStringToRGB("#beaded"));
    }

    @Test
    @DisplayName("#Fa3456 -> {r: 250, g: 52, b: 86}")
    void customTest3() {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("r", 250);
        map.put("g", 52);
        map.put("b", 86);
        assertEquals(map, HexToRGB.hexStringToRGB("#Fa3456"));
    }
}
