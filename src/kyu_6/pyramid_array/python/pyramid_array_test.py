import codewars_test as test
from solution import pyramid

@test.describe("Pyramid Array")
def pyramid_tests():
    @test.it("Sample Tests")
    def sample_tests():
        test.assert_equals(pyramid(0), [])
        test.assert_equals(pyramid(1), [[1]])
        test.assert_equals(pyramid(2), [[1], [1, 1]])
        test.assert_equals(pyramid(3), [[1], [1, 1], [1, 1, 1]])