import codewars_test as test
from solution import switcheroo

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(switcheroo("abc"), "bac")
        test.assert_equals(switcheroo('aaabcccbaaa'), 'bbbacccabbb')
        test.assert_equals(switcheroo('ccccc'), 'ccccc')
        test.assert_equals(switcheroo('abababababababab'), 'babababababababa')
        test.assert_equals(switcheroo('aaaaa'), 'bbbbb')