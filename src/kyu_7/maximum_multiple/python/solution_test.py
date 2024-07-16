import codewars_test as test
from solution import max_multiple

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(max_multiple(2,7),6)
        test.assert_equals(max_multiple(3,10),9)
        test.assert_equals(max_multiple(7,17),14)
        test.assert_equals(max_multiple(10,50),50)
        test.assert_equals(max_multiple(37,200),185)
        test.assert_equals(max_multiple(7,100),98)