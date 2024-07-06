from solution import get_sum
import codewars_test as test

@test.describe("Example tests")
def tests():
    @test.it("Small tests")
    def test0():
        test.assert_equals(get_sum(0), 1)
        test.assert_equals(get_sum(1), -4)
        test.assert_equals(get_sum(2), 0)
        test.assert_equals(get_sum(3), -18)
        test.assert_equals(get_sum(4), -9)