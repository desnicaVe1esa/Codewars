package kyu_8.grasshopper_terminal_game_combat_function.java;

public class Game {

    public static int combat(int health, int damage) {
        return damage > health ? 0 : health - damage;
    }
}

