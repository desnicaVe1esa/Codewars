package kyu_6.loose_change.java;

import java.util.HashMap;

public class Change {
    public static HashMap<String, Integer> looseChange(int cent) {
        HashMap<String, Integer> map = new HashMap<>();
        if (cent <= 0) {
            map.put("Pennies", 0);
            map.put("Nickels", 0);
            map.put("Dimes", 0);
            map.put("Quarters", 0);
            return map;
        }
        int pennies = 0;
        int nickels = 0;
        int dimes = 0;
        int quarters = 0;
        while (cent > 0) {
            if (cent >= 25) {
                cent -= 25;
                quarters++;
            }
            if (cent >= 10 && cent < 25) {
                cent -= 10;
                dimes++;
            }
            if (cent >= 5 && cent < 10) {
                cent -= 5;
                nickels++;
            }
            if (cent < 5 && cent >= 1) {
                cent -= 1;
                pennies++;
            }
        }

        map.put("Pennies", pennies);
        map.put("Nickels", nickels);
        map.put("Dimes", dimes);
        map.put("Quarters", quarters);
        return map;
    }
}
