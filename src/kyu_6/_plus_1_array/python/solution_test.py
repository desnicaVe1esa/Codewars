import codewars_test as test
from solution import up_array

@test.describe("Sample tests")
def example_tests():
    @test.it("Examples")
    def examples():
        test.assert_equals(up_array([2,3,9]), [2,4,0])
        test.assert_equals(up_array([9,9]), [1,0,0])
        test.assert_equals(up_array([0,4,2]), [0,4,3])
        test.assert_equals(up_array([4,3,2,5]), [4,3,2,6])
        test.assert_equals(up_array([1,2,3,9]), [1,2,4,0])
        test.assert_equals(up_array([9,9,9,9]), [1,0,0,0,0])
        test.assert_equals(up_array([0,1,3,7]), [0,1,3,8])
        test.assert_equals(up_array([1,-9]), None)