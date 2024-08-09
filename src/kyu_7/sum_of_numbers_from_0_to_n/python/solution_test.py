import codewars_test as test
from solution import show_sequence

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        tests = (
            (6, "0+1+2+3+4+5+6 = 21"),
            (7, "0+1+2+3+4+5+6+7 = 28"),
            (0, "0=0"),
            (-1, "-1<0"),
            (-10, "-10<0"),
        )

        for inp, exp in tests:
            test.assert_equals(show_sequence(inp), exp)