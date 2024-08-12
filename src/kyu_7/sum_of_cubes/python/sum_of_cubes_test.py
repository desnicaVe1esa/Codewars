import codewars_test as test
from solution import sum_cubes

@test.describe("Sum of Cubes")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(sum_cubes(1), 1)
        test.assert_equals(sum_cubes(2), 9)
        test.assert_equals(sum_cubes(3), 36)
        test.assert_equals(sum_cubes(4), 100)
        test.assert_equals(sum_cubes(10), 3025)
        test.assert_equals(sum_cubes(123), 58155876)
        