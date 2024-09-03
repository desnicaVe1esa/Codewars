import codewars_test as test
from solution import remove

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():

        tests = [
            ["Hi!" , "Hi!"],
            ["Hi!!!" ,"Hi!"],
            ["!Hi" , "Hi!"],
            ["!Hi!" , "Hi!"],
            ["Hi! Hi!" , "Hi Hi!"],
            ["Hi" , "Hi!"],
        ]

        for inp, exp in tests:
            test.assert_equals(remove(inp), exp)