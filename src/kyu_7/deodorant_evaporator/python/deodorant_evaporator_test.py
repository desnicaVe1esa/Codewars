import codewars_test as test
from solution import evaporator

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(evaporator(10, 10, 10), 22)
        test.assert_equals(evaporator(10, 10, 5), 29)
        test.assert_equals(evaporator(100, 5, 5), 59)
        test.assert_equals(evaporator(50, 12, 1), 37)
        test.assert_equals(evaporator(47.5, 8, 8), 31)
        test.assert_equals(evaporator(100, 1, 1), 459)
        test.assert_equals(evaporator(10, 1, 1), 459)
        test.assert_equals(evaporator(100, 1, 5), 299)