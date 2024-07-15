package kyu_5.not_very_secure.java;

public class SecureTester{

  public static boolean alphanumeric(String s){
    return s.matches("^[a-zA-Z0-9]+$");
  }

}