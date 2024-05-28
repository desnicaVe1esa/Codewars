package kyu_5.find_the_smallest.groovy;

public class ToSmallest {

    public static long[] smallest(long n) {
        def digits = n.toString().collect()
        (0..<digits.size()).collectMany { from ->
            (0..<digits.size()).findAll { it != from }.collect { to ->
                [new Long(move(digits, from, to).join()), from, to]
            }
        }.toSorted { a, b ->
            a[0] <=> b[0] ?:
                    a[1] <=> b[1]
        }.first()
    }

    static move(digits, from, to) {
        digits.withIndex()
                .findAll { it[1] != from }
                .collect {
                    [it[0], it[1] >= to && it[1] < from ? it[1] + 1 : it[1]]
                }
                .plus([[digits[from], to]])
                .toSorted { it[1] }
                .collect { it[0] }
    }
}