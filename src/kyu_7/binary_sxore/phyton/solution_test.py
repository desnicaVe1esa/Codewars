import codewars_test as test
from solution import sxore

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(sxore(0), 0)
        test.assert_equals(sxore(1), 1)
        test.assert_equals(sxore(2), 3)
        test.assert_equals(sxore(50), 51)
        test.assert_equals(sxore(1000000), 1000000)
        test.assert_equals(sxore(1000001), 1)
        test.assert_equals(sxore(9999999999999999999999999), 0)