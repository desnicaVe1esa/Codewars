import codewars_test as test
from solution import close_compare

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it("No margin")
    def basic_test_cases():
        test.assert_equals(close_compare(4, 5), -1)
        test.assert_equals(close_compare(5, 5), 0)
        test.assert_equals(close_compare(6, 5), 1)

    @test.it("With margin of 3")
    def basic_test_cases():
        test.assert_equals(close_compare(2, 5, 3), 0)
        test.assert_equals(close_compare(5, 5, 3), 0)
        test.assert_equals(close_compare(8, 5, 3), 0)
        test.assert_equals(close_compare(8.1, 5, 3), 1)
        test.assert_equals(close_compare(1.99, 5, 3), -1)