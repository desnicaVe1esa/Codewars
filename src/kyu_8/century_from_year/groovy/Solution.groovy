package kyu_8.century_from_year.groovy;

class Solution {
    static century(year) {
        return Math.floor((year + 99) / 100)
    }
}