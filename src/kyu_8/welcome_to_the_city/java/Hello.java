package kyu_8.welcome_to_the_city.java;

public class Hello{
    public String sayHello(String [] name, String city, String state){
        return "Hello, " + String.join(" ", name) + "! Welcome to " + city + ", " + state + "!";
    }
}