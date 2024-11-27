import codewars_test as test
from solution import compute_depth

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(compute_depth(8),12)
        test.assert_equals(compute_depth(13),8)
        test.assert_equals(compute_depth(7),10)
        test.assert_equals(compute_depth(25),36)
        test.assert_equals(compute_depth(42),9)
        test.assert_equals(compute_depth(1),10)