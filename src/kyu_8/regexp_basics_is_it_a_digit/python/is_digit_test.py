import codewars_test as test
from solution import is_digit

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(is_digit(""), False)
        test.assert_equals(is_digit("7"), True)
        test.assert_equals(is_digit(" "), False)
        test.assert_equals(is_digit("a"), False)
        test.assert_equals(is_digit("a5"), False)