import codewars_test as test
from solution import longest_repetition

@test.describe("Example Tests")
def example_tests():

    @test.it("Example Tests")
    def example_tests():

        tests = [
            # [input, expected],
            ["aaaabb", ('a', 4)],
            ["bbbaaabaaaa", ('a', 4)],
            ["cbdeuuu900", ('u', 3)],
            ["abbbbb", ('b', 5)],
            ["aabb", ('a', 2)],
            ["ba", ('b', 1)],
            ["", ('', 0)],
        ]

        for inp, exp in tests:
            test.assert_equals(longest_repetition(inp), exp)