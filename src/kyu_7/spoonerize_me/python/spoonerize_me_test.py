import codewars_test as test
from solution import spoonerize

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        test.assert_equals(spoonerize("nit picking"), "pit nicking")
        test.assert_equals(spoonerize("wedding bells"), "bedding wells")
        test.assert_equals(spoonerize("jelly beans"), "belly jeans")
        test.assert_equals(spoonerize("pop corn"), "cop porn")