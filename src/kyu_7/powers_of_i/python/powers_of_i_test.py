import codewars_test as test
from solution import pofi

@test.describe("Basic Tests")
def basic_tests():

    @test.it("Basic Tests")
    def basic_tests():
        test.assert_equals(pofi(0),'1')
        test.assert_equals(pofi(1),'i')
        test.assert_equals(pofi(2),'-1')
        test.assert_equals(pofi(3),'-i')
        test.assert_equals(pofi(4),'1')
        test.assert_equals(pofi(5),'i')
        test.assert_equals(pofi(6),'-1')
        test.assert_equals(pofi(7),'-i')
        test.assert_equals(pofi(8),'1')
        test.assert_equals(pofi(9),'i')
        test.assert_equals(pofi(10),'-1')