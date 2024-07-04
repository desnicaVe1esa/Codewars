import codewars_test as test
from solution import sort_gift_code

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(sort_gift_code('abcdef'), 'abcdef')
        test.assert_equals(sort_gift_code('pqksuvy'), 'kpqsuvy')
        test.assert_equals(sort_gift_code('zyxwvutsrqponmlkjihgfedcba'), 'abcdefghijklmnopqrstuvwxyz')