import codewars_test as test
from solution import next_smaller
@test.describe('Fixed Tests')
def fixed_tests():
    @test.it('Simple Cases')
    def example_cases():
        test.assert_equals(next_smaller(907), 790)
        test.assert_equals(next_smaller(531), 513)
        test.assert_equals(next_smaller(135), -1)
        test.assert_equals(next_smaller(2071), 2017)
        test.assert_equals(next_smaller(414), 144)
        test.assert_equals(next_smaller(123456798), 123456789)
        test.assert_equals(next_smaller(123456789), -1)
        test.assert_equals(next_smaller(1234567908), 1234567890)