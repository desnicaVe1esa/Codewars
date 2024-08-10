import codewars_test as test
from solution import get_length_of_missing_array

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        tests = (
            ([[1, 2], [4, 5, 1, 1], [1], [5, 6, 7, 8, 9]], 3),
            ([[5, 2, 9], [4, 5, 1, 1], [1], [5, 6, 7, 8, 9]], 2),
            ([[None], [None, None, None]], 2),
            ([['a', 'a', 'a'], ['a', 'a'], ['a', 'a', 'a', 'a'], ['a'], ['a', 'a', 'a', 'a','a', 'a']], 5)
        )


        for case in tests:
            inp, exp = case
            test.assert_equals(get_length_of_missing_array(inp), exp)