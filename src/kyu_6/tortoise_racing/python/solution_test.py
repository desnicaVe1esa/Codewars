import codewars_test as test

@test.describe("race")
def tests():
    @test.it("basic tests")
    def basics():
        test.assert_equals(race(720, 850, 70), [0, 32, 18])
        test.assert_equals(race(80, 91, 37), [3, 21, 49])
        test.assert_equals(race(820, 81, 550), None)
