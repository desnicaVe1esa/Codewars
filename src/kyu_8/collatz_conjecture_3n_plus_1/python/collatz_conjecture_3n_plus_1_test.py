import codewars_test as test
from solution import hotpo

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(hotpo(1), 0);
        test.assert_equals(hotpo(5), 5);
        test.assert_equals(hotpo(6), 8);
        test.assert_equals(hotpo(23), 15);