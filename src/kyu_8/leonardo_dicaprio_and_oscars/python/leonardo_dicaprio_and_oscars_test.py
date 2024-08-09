import codewars_test as test
from solution import leo

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(leo(88),"Leo finally won the oscar! Leo is happy")
        test.assert_equals(leo(87),"When will you give Leo an Oscar?")
        test.assert_equals(leo(86),"Not even for Wolf of wallstreet?!")