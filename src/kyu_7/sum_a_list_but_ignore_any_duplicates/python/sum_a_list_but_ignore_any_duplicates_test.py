import codewars_test as test
from solution import sum_no_duplicates

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(sum_no_duplicates([1, 1, 2, 3]), 5)
        test.assert_equals(sum_no_duplicates([1, 1, 2, 2, 3]), 3)
        test.assert_equals(sum_no_duplicates([]), 0)
        test.assert_equals(sum_no_duplicates([5, 6, 10, 3, 10, 10, 6, 7, 0, 9, 1, 1, 6, 3, 1]), 21)
        test.assert_equals(sum_no_duplicates([0, 10, 8, 9, 7, 3, 3, 9, 3, 6, 0]), 31)
        test.assert_equals(sum_no_duplicates([0, 1, 4, 4, 0, 4, 2, 5, 9, 0, 10, 9, 0, 1, 2]), 15)
        test.assert_equals(sum_no_duplicates([7, 2, 10, 9, 10, 2, 7, 3, 10, 8, 2, 5]), 25)
        test.assert_equals(sum_no_duplicates([7, 2, 0, 3, 5, 7, 8, 3, 2, 10, 9, 5]), 27)
        test.assert_equals(sum_no_duplicates([1, 9, 9, 5, 7, 7, 6, 1, 5, 6]), 0)
        test.assert_equals(sum_no_duplicates([10, 10, 1, 4, 10, 3, 9, 6, 10, 10, 9, 9, 10, 5, 6, 10, 4, 1]), 8)
        test.assert_equals(sum_no_duplicates([7, 10, 10, 9, 0, 2, 5, 10, 3, 8, 1, 4, 9, 9, 5, 8, 8, 8, 5, 3]), 14)
        test.assert_equals(sum_no_duplicates([1, 9, 2, 1, 5, 5, 1, 1, 5, 10, 5, 9, 5, 2, 1]), 10)
        test.assert_equals(sum_no_duplicates([8, 6, 3, 6, 7, 3, 4, 4, 2, 1, 4, 5, 8, 6]), 15)
        test.assert_equals(sum_no_duplicates([10, 9, 2, 8, 9, 10, 4, 6, 9, 5, 1, 1, 4, 3, 9, 7, 8, 5, 5]), 18)
        test.assert_equals(sum_no_duplicates([5, 5, 0, 0, 6, 3, 7, 2, 4, 2]), 20)
        test.assert_equals(sum_no_duplicates([0, 8, 5, 10, 1, 1, 6, 8]), 21)
        test.assert_equals(sum_no_duplicates([4, 2, 10, 9, 10, 5, 1, 7, 1, 9, 8, 7, 4, 2, 5, 8, 3, 10, 8]), 3)
        test.assert_equals(sum_no_duplicates([9, 8, 3, 1, 8, 1, 7]), 19)
        test.assert_equals(sum_no_duplicates([1, 4, 3, 8, 9, 4, 7, 5, 10, 10, 7, 6, 9, 3]), 20)
        test.assert_equals(sum_no_duplicates([2, 0, 4, 2, 2, 3, 6, 7, 3, 8, 10, 6, 8]), 21)
        test.assert_equals(sum_no_duplicates([7, 9, 5, 6, 1, 0, 5, 0, 4, 7, 1, 2, 8, 9, 6, 1]), 14)
        test.assert_equals(sum_no_duplicates([7, 1, 8, 8, 5, 5, 1, 4, 0, 1, 10, 1]), 21)