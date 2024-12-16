package kyu_5.phone_directory.java;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PhoneDir {

    private static final Pattern phonePattern = Pattern.compile("\\+[\\d-]+");
    private static final Pattern namePattern = Pattern.compile("<.*>");

    public static String phone(String textFile, String queryNumber) {
        String[] phonebookData = textFile.split("\\n");
        Map<String, String[]> phonebook = new HashMap<>();
        for (String entry : phonebookData) {
            Matcher numberMatcher = phonePattern.matcher(entry);
            numberMatcher.find();
            String entryNumber = numberMatcher.group().replace("+", "");
            Matcher nameMatcher = namePattern.matcher(entry);
            nameMatcher.find();
            String entryName = nameMatcher.group().replaceAll("[<>]", "");
            String entryAddress = entry
                    .replace(entryNumber, "")
                    .replace(entryName, "")
                    .replaceAll("[^\\w^\\s\\-.]", "")
                    .replaceAll("\\s+|_", " ")
                    .strip();
            if (!phonebook.containsKey(entryNumber)) {
                String[] newEntry = {entryName, entryAddress};
                phonebook.put(entryNumber, newEntry);
            } else {
                String[] currentEntry = phonebook.get(entryNumber);
                if (currentEntry != null && !currentEntry[0].equals(entryName)) {
                    phonebook.put(entryNumber, null);
                }
            }
        }
        if (phonebook.containsKey(queryNumber)) {
            String[] result = phonebook.get(queryNumber);
            if (result != null) {
                return String.format("Phone => %s, Name => %s, Address => %s", queryNumber, result[0], result[1]);
            } else {
                return String.format("Error => Too many people: %s", queryNumber);
            }
        } else {
            return String.format("Error => Not found: %s", queryNumber);
        }
    }
}
