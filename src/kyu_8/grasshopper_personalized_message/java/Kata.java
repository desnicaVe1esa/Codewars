package kyu_8.grasshopper_personalized_message.java;

class Kata {
    static String greet(String name, String owner) {
       return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}