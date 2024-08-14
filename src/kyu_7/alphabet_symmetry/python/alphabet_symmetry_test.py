import codewars_test as test
from solution import solve

@test.describe('tests')
def tests():

    def do_test(strings, expected):
        actual = solve(strings.copy())
        test.assert_equals(actual, expected, f'for strings {strings}\n')

    @test.it("Basic tests")
    def basic_tests():
        do_test(["abode","ABc","xyzD"] ,[4,3,1])
        do_test(["abide","ABc","xyz"] ,[4,3,0])
        do_test(["IAMDEFANDJKL","thedefgh","xyzDEFghijabc"] ,[6,5,7])
        do_test(["encode","abc","xyzD","ABmD"] ,[1, 3, 1, 3])