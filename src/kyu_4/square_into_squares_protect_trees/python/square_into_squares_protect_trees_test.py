import codewars_test as test
from solution import decompose


@test.describe("Sample tests")
def sample_tests():
    @test.it("Static tests")
    def static_tests():
        test.assert_equals(decompose(5), [3,4])
        test.assert_equals(decompose(8), None)
