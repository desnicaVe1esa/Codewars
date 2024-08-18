import codewars_test as test
from solution import pascals_triangle

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(pascals_triangle(1), [1],"1 level triangle incorrect");
        test.assert_equals(pascals_triangle(2), [1,1,1],"2 level triangle incorrect");
        test.assert_equals(pascals_triangle(3), [1,1,1,1,2,1],"3 level triangle incorrect");