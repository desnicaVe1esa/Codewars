from solution_test import rev_rot
import codewars_test as test


def testing(actual, expected):
    test.assert_equals(actual, expected)

test.describe("revrot")
test.it("Basic tests")
testing(rev_rot("1234", 0), "")
testing(rev_rot("", 0), "")
testing(rev_rot("1234", 5), "")
s = "733049910872815764"
testing(rev_rot(s, 5), "330479108928157")