from solution import get_sum
import codewars_test as test
import random

@test.describe("Example tests")
def tests():
    @test.it("Small tests")
    def test0():
        test.assert_equals(get_sum(0), 1)
        test.assert_equals(get_sum(1), 7)
        test.assert_equals(get_sum(2), 22)
        test.assert_equals(get_sum(3), 50)