import codewars_test as test
from solution import add

@test.it("Actual Addition")
def real_addition_test():
    test.assert_equals(add(2,11), 13)
    test.assert_equals(add(0,1), 1)
    test.assert_equals(add(0,0), 0)

@test.it("Silly Addition")
def silly_addition_test():
    test.assert_equals(add(16,18), 214)
    test.assert_equals(add(26,39), 515)
    test.assert_equals(add(122,81), 1103)
