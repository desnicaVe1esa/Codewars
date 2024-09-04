import codewars_test as test

@test.describe("Cheating Friend")
def tests():
    def testing(n, exp):
        try:
            actual = removNb(n)
        except NameError:
            actual = remov_nb(n)
        test.assert_equals(actual, exp)
    @test.it("Fixed tests")
    def basics():
        testing(26, [(15, 21), (21, 15)])
        testing(100, [])
        testing(101, [(55, 91), (91, 55)])

