import codewars_test as test
from solution import min_sum

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(min_sum([5,4,2,3]), 22)
        test.assert_equals(min_sum([12,6,10,26,3,24]), 342)
        test.assert_equals(min_sum([9,2,8,7,5,4,0,6]), 74)