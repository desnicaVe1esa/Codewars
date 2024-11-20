import codewars_test as test
from solution import sort_twisted37

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(sort_twisted37([1,2,3,4,5,6,7,8,9]), [1,2,7,4,5,6,3,8,9])
        test.assert_equals(sort_twisted37([12,13,14]), [12,14,13])
        test.assert_equals(sort_twisted37([9,2,4,7,3]), [2,7,4,3,9])

    @test.it("Unchanged Array Test")
    def basic_test_cases():
        array = [9,2,4,7,3]
        arr_cloned = array[:]
        test.assert_equals(sort_twisted37(array), [2,7,4,3,9])
        test.assert_equals(array, arr_cloned, "You should not modify the input array!")