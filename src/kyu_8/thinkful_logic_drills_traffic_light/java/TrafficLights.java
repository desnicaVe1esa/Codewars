package kyu_8.thinkful_logic_drills_traffic_light.java;

public class TrafficLights {

    public static String updateLight(String current) {
        switch (current) {
            case "red" -> {
                return "green";
            }
            case "green" -> {
                return "yellow";
            }
            case "yellow" -> {
                return "red";
            }
        }
        return "";
    }
}
