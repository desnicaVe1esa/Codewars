import codewars_test as test
from solution import sum_strings


@test.describe('Basic tests')
def test_examples():

    @test.it('Example tests')
    def basic_tests():
        test.assert_equals(sum_strings("1", "1"), "2")
        test.assert_equals(sum_strings("123", "456"), "579")
