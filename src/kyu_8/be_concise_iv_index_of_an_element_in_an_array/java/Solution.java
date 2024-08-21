package kyu_8.be_concise_iv_index_of_an_element_in_an_array.java;

public class Solution {public static String kata(String[] a, String s){for (int i=0;i< a.length;i++){if(a[i].equals(s))return i+"";}return "Not found";}}