package kyu_5.the_hunger_games_zoo_disaster.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dinglemouse {

    private static final Map<String, Set<String>> ANIMALS_TO_LUNCHES = new HashMap<>();

    static {
        ANIMALS_TO_LUNCHES.put("antelope", Collections.singleton("grass"));
        ANIMALS_TO_LUNCHES.put("big-fish", Collections.singleton("little-fish"));
        ANIMALS_TO_LUNCHES.put("bug", Collections.singleton("leaves"));
        ANIMALS_TO_LUNCHES.put("bear",
                new HashSet<>(Arrays.asList("big-fish",
                        "bug",
                        "chicken",
                        "cow",
                        "leaves",
                        "sheep")));
        ANIMALS_TO_LUNCHES.put("chicken", Collections.singleton("bug"));
        ANIMALS_TO_LUNCHES.put("cow", Collections.singleton("grass"));
        ANIMALS_TO_LUNCHES.put("fox", new HashSet<>(Arrays.asList("chicken", "sheep")));
        ANIMALS_TO_LUNCHES.put("giraffe", Collections.singleton("leaves"));
        ANIMALS_TO_LUNCHES.put("lion", new HashSet<>(Arrays.asList("antelope", "cow")));
        ANIMALS_TO_LUNCHES.put("panda", Collections.singleton("leaves"));
        ANIMALS_TO_LUNCHES.put("sheep", Collections.singleton("grass"));
    }

    public static String[] whoEatsWho(final String zoo) {
        final List<String> whoAteWhom = new LinkedList<>();
        final List<String> things = new ArrayList<>(Arrays.asList(zoo.split(",")));

        //noinspection StatementWithEmptyBody
        while (oneRound(whoAteWhom, things)) {
        }

        List<String> result = new LinkedList<>();
        result.add(zoo);
        result.addAll(whoAteWhom);
        result.add(String.join(",", things));
        return result.toArray(new String[0]);
    }

    private static boolean oneRound(List<String> whoAteWhom, List<String> things) {
        for (int i = 0; i < things.size(); i++) {
            if (canEatLeft(things, i)) {
                eatLeft(whoAteWhom, things, i);
                return true;
            } else if (canEatRight(things, i)) {
                eatRight(whoAteWhom, things, i);
                return true;
            }
        }
        return false;
    }

    private static void eatRight(List<String> whoAteWhom, List<String> things, int i) {
        eat(whoAteWhom, things, i, i + 1);
    }

    private static void eatLeft(List<String> whoAteWhom, List<String> things, int i) {
        eat(whoAteWhom, things, i, i - 1);
    }

    private static void eat(List<String> whoAteWhom, List<String> things, int who, int whom) {
        whoAteWhom.add(String.format("%s eats %s", things.get(who), things.get(whom)));
        things.remove(whom);
    }

    private static boolean canEatRight(List<String> things, int i) {
        final Set<String> lunches = ANIMALS_TO_LUNCHES.get(things.get(i));
        return i < things.size() - 1 && lunches != null && lunches.contains(things.get(i + 1));
    }

    private static boolean canEatLeft(List<String> things, int i) {
        final Set<String> lunches = ANIMALS_TO_LUNCHES.get(things.get(i));
        return i > 0 && lunches != null && lunches.contains(things.get(i - 1));
    }

}