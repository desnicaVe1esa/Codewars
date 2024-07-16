import codewars_test as test
from solution import generator

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        gen = generator(1);
        test.assert_equals(next(gen), '1 x 1 = 1', '1 x 1 = 1')
        test.assert_equals(next(gen), '1 x 2 = 2', '1 x 2 = 2')
        test.assert_equals(next(gen), '1 x 3 = 3', '1 x 3 = 3')
        test.assert_equals(next(gen), '1 x 4 = 4', '1 x 4 = 4')
        test.assert_equals(next(gen), '1 x 5 = 5', '1 x 5 = 5')