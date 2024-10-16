package kyu_7.the_office_iv_find_a_meeting_room.java;

public class TheOffice {
    public static Object meeting(char[] x) {
        int index = -1;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'O') {
                index = i;
                break;
            }
        }
        return index == -1 ? "None available!" : index;
    }
}