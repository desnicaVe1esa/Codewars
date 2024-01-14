package kyu_6.punch_card_reward_system;

public class Solution {
    public static String CalculateReward(int currentPoint, int numberOfJewelry) {
        int paid = (int) Math.max(Math.ceil((5 * numberOfJewelry - currentPoint) / 6.0), 0);
        int free = numberOfJewelry - paid;

        currentPoint += paid - 5 * free;

        return String.format("Point Left: %d. Free Item: %d. Pay Item: %d", currentPoint, free, paid);
    }
}
