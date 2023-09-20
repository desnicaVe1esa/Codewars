package abbreviate_a_two_word_name;

public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] string = name.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : string) {
            if (Character.isUpperCase(s.charAt(0))) stringBuilder.append(s.charAt(0)).append('.');
            if (Character.isLowerCase(s.charAt(0))) stringBuilder.append(s.toUpperCase().charAt(0)).append('.');
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }
}
