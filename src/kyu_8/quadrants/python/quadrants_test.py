import codewars_test as test
from solution import quadrant

@test.describe("Basic Tests")
def basic_tests():

    @test.it("Basic Tests")
    def basic_tests():

        tests = [[1, 2, 1], [3, 5, 1], [-10, 100, 2], [-1, -9, 3], [19, -56, 4], [1, 1, 1], [-60, -12, 3]]

        for x, y, expected in tests:
            test.assert_equals(quadrant(x, y), expected, f"{x = }, {y = }")


