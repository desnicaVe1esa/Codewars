package kyu_7.running_out_of_space.java;

public class OutOfSpace {
  public static String[] spacey(String[] array) {
    String[] result = new String[array.length];
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < array.length; i++) {
      stringBuilder.append(array[i]);
      result[i] = stringBuilder.toString();
    }
    return result;
  }
}