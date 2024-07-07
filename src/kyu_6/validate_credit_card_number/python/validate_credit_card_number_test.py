import codewars_test as test
from solution import validate

@test.describe("Sample tests")
def tests():
    @test.it("Some examples")
    def tests():
        test.assert_equals(validate(1714), False)
        test.assert_equals(validate(12345), False)
        test.assert_equals(validate(891), False)
        test.assert_equals(validate(123), False)
        test.assert_equals(validate(1), False)
        test.assert_equals(validate(2121), True)
        test.assert_equals(validate(1230), True)