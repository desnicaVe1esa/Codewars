package kyu_6.string_array_duplicates.java;

class Solution{
    public static String[] dup(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("([a-z])\\1+", "$1");
        }
        return arr;
    }
}