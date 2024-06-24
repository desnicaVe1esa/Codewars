package kyu_7.predict_your_age.groovy;

class Solution {
    static predictAge(age1, age2, age3, age4, age5, age6, age7, age8) {
        def total = age1 * age1 + age2 * age2 + age3 * age3 + age4 * age4 + age5 * age5 + age6 * age6 + age7 * age7 + age8 * age8;
        def sqrt = Math.sqrt(total)
        return (sqrt / 2).intValue()
    }
}