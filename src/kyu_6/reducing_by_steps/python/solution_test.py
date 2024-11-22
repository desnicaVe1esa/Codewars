from solution import *
import codewars_test as test

@test.describe("Reducing by steps")
def tests():

    def testing(actual, expected):
        test.assert_equals(actual, expected)

    @test.it("basic tests gcdi, lcmu, som, mini, maxi")
    def basics1():
        a = [ 18, 69, -90, -78, 65, 40 ]
        r = [ 18, 3, 3, 3, 1, 1 ]
        op = oper_array(gcdi, a, a[0])
        testing(op, r)
        r = [ 18, 414, 2070, 26910, 26910, 107640 ]
        op = oper_array(lcmu, a, a[0])
        testing(op, r)
        r = [ 18, 87, -3, -81, -16, 24 ]
        op = oper_array(som, a, 0)
        testing(op, r)
        r = [ 18, 18, -90, -90, -90, -90 ]
        op = oper_array(mini, a, a[0])
        testing(op, r)
        r = [ 18, 69, 69, 69, 69, 69 ]
        op = oper_array(maxi, a, a[0])
        testing(op, r)