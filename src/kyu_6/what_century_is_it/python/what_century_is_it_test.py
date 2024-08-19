import codewars_test as test
from solution import what_century

def dotest(y, expected):
    actual = what_century(y)
    test.assert_equals(actual, expected, f"Test failed with year = \"{y}\"")

@test.describe("Tests")
def fixed_tests():
    @test.it('Sample tests')
    def basic_test_cases():
        dotest("2011", "21st")
        dotest("2154", "22nd")
        dotest("2259", "23rd")
        dotest("1234", "13th")
        dotest("1023", "11th")