package kyu_8.will_there_be_enough_space.java;

public class Bob {
    public static int enough(int cap, int on, int wait){
        return cap >= on + wait ? 0 : on + wait - cap;
    }
}
