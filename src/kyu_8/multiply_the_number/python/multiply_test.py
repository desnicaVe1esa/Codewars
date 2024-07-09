import codewars_test as test
from solution import multiply

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(multiply(10),250)
        test.assert_equals(multiply(5),25)
        test.assert_equals(multiply(200),25000)
        test.assert_equals(multiply(0),0)
        test.assert_equals(multiply(-2),-10)