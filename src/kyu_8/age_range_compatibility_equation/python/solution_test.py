import codewars_test as test
from solution import dating_range

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(dating_range(17), "15-20")
        test.assert_equals(dating_range(40), "27-66")
        test.assert_equals(dating_range(15), "14-16")
        test.assert_equals(dating_range(35), "24-56")
        test.assert_equals(dating_range(10), "9-11")
        test.assert_equals(dating_range(53), "33-92")
        test.assert_equals(dating_range(19), "16-24")
        test.assert_equals(dating_range(12), "10-13")
        test.assert_equals(dating_range(7), "6-7")
        test.assert_equals(dating_range(33), "23-52")