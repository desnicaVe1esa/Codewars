import codewars_test as test
from solution import find_slope

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(find_slope([19,3,20,3]),"0")
        test.assert_equals(find_slope([-7,2,-7,4]),"undefined")
        test.assert_equals(find_slope([10,50,30,150]),"5")
        test.assert_equals(find_slope([10,20,20,80]),"6")
        test.assert_equals(find_slope([-10,6,-10,3]),"undefined")