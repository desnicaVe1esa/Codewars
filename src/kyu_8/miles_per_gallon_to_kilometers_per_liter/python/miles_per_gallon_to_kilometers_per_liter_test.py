import codewars_test as test
from solution import converter

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(converter(10), 3.54)
        test.assert_equals(converter(20), 7.08)
        test.assert_equals(converter(30), 10.62)
        test.assert_equals(converter(24), 8.50)
        test.assert_equals(converter(36), 12.74)