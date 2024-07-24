package kyu_6.reverse_or_rotate.java;

class RevRot {

    public static String revRot(String nums, int sz) {
        StringBuilder groups = new StringBuilder();
        for (int i = 0, len = nums.length(); i + sz <= len && sz > 0; i += sz) {
            String group = nums.substring(i, i + sz);
            groups.append(isDivisible(group) ? new StringBuffer(group).reverse() : group.substring(1) + group.charAt(0));
        }
        return groups.toString();
    }

    public static boolean isDivisible(String group) {
        int sum = 0;
        for (char num : group.toCharArray()) {
            sum += Character.getNumericValue(num);
        }
        return sum % 2 == 0;
    }

}
