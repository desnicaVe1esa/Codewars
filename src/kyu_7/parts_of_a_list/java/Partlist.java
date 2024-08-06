package kyu_7.parts_of_a_list.java;


public class Partlist {

    public static String[][] partlist(String[] arr) {
        String[][] result = new String[arr.length - 1][2];
        StringBuilder str1 = new StringBuilder();
        for (int index1 = 0; index1 < arr.length - 1; index1++) {
            str1.append(arr[index1]).append(" ");
            StringBuilder str2 = new StringBuilder();
            for (int index2 = index1 + 1; index2 < arr.length; index2++) {
                str2.append(arr[index2]).append(" ");
            }
            result[index1][0] = str1.substring(0, str1.length() - 1);
            result[index1][1] = str2.substring(0, str2.length() - 1);
        }
        return result;
    }
}
