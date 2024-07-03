import codewars_test as test
from solution import number

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(number([[10,0],[3,5],[5,8]]),5)
        test.assert_equals(number([[3,0],[9,1],[4,10],[12,2],[6,1],[7,10]]),17)
        test.assert_equals(number([[3,0],[9,1],[4,8],[12,2],[6,1],[7,8]]),21)