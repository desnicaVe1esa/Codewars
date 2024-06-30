package kyu_8.sleigh_authentication.java;

public class Sleigh {
    public static Boolean authenticate(String name, String password) {
        return name.equals("Santa Claus") && password.equals("Ho Ho Ho!");
    }
}