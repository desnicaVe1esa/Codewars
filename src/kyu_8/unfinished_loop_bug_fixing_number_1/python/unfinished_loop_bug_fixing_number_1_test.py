import codewars_test as test
from solution import create_array

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(create_array(1),[1])
        test.assert_equals(create_array(2),[1,2])
        test.assert_equals(create_array(3),[1,2,3])
        test.assert_equals(create_array(4),[1,2,3,4])
        test.assert_equals(create_array(5),[1,2,3,4,5])
        test.assert_equals(create_array(6),[1,2,3,4,5,6])
        test.assert_equals(create_array(7),[1,2,3,4,5,6,7])
        test.assert_equals(create_array(8),[1,2,3,4,5,6,7,8])
        test.assert_equals(create_array(9),[1,2,3,4,5,6,7,8,9])
        test.assert_equals(create_array(10),[1,2,3,4,5,6,7,8,9,10])