import codewars_test as test
from solution import websites

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(len(websites), 1000)
        test.assert_equals(type(websites), list)
        test.assert_equals(list(set(websites)), ["codewars"])