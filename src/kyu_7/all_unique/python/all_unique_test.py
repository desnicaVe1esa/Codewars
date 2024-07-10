import codewars_test as test
from solution import has_unique_chars


@test.describe("Basic Examples")
def test_bacis():

    @test.it("should test characters uniqueness")
    def test_uniqueness():
        test.assert_equals(has_unique_chars("abcdef"), True)
        test.assert_equals(has_unique_chars("++-"), False)
        test.assert_equals(has_unique_chars("  nAa"), False)
