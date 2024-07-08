from solution import triple_double
import codewars_test as test

@test.describe("Triple trouble")
def triple_trouble():

    @test.it("Sample tests")
    def sample_tests():
        test.assert_equals(triple_double(451999277, 41177722899), 1)
        test.assert_equals(triple_double(1222345, 12345), 0)
        test.assert_equals(triple_double(12345, 12345), 0)
        test.assert_equals(triple_double(666789, 12345667), 1)
        test.assert_equals(triple_double(10560002, 100), 1)
        test.assert_equals(triple_double(1112, 122), 0)