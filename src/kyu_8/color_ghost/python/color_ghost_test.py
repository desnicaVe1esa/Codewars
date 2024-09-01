import codewars_test as test
from solution import *

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it('Basic Test Cases')
    def basic_test_cases():
        ghosts = [Ghost().color for _ in range(100)]
        test.expect(ghosts.count("white") >= 1)
        test.expect(ghosts.count("yellow") >= 1)
        test.expect(ghosts.count("purple") >= 1)
        test.expect(ghosts.count("red") >= 1)