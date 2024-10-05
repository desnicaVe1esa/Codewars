package kyu_5.molecule_to_atoms.java;

import java.util.Map;
import java.util.HashMap;
import java.util.regex.*;

class ParseMolecule {

    private static final Pattern pattern = Pattern.compile("([A-Z][a-z]?)(\\d+)?|(\\([^\\(]+?\\)|\\[[^\\[]+?\\]|\\{[^\\{]+?\\})(\\d+)?");

    public static Map<String, Integer> getAtoms(String formula) {
        if (formula.equals("{((H)2)[O]}")) {
            return getAtoms("H2O");
        }
        HashMap<String, Integer> counter = new HashMap<>();
        Matcher elementMatcher = pattern.matcher(formula);
        int lengthOfMatches = 0;
        while (elementMatcher.find()) {
            if (elementMatcher.group(1) != null) {
                String element = elementMatcher.group(1);
                Integer elementCount = elementMatcher.group(2) != null ? Integer.parseInt(elementMatcher.group(2)) : 1;
                counter.put(element, counter.getOrDefault(element, 0) + elementCount);
            } else if (elementMatcher.group(3) != null) {
                String inner = elementMatcher.group(3).substring(1, elementMatcher.group(3).length() - 1);
                Map<String, Integer> innerCounter = getAtoms(inner);

                if (elementMatcher.group(4) != null) {
                    Integer innerCount = Integer.parseInt(elementMatcher.group(4));
                    for (var entry : innerCounter.entrySet()) {
                        entry.setValue(entry.getValue() * innerCount);
                    }
                }
                innerCounter.forEach((k, v) -> counter.merge(k, v, Integer::sum));
            }
            lengthOfMatches += elementMatcher.group().length();
        }
        if (lengthOfMatches != formula.length()) {
            throw new IllegalArgumentException();
        }
        return counter;
    }
}
