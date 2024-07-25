from solution import sort_my_string
import codewars_test as test

@test.describe("Other Tests")
def _():
    @test.it('sample tests')
    def _():
        test.assert_equals(sort_my_string("CodeWars"), "CdWr oeas")
        test.assert_equals(sort_my_string("YCOLUE'VREER"), "YOU'RE CLEVER")
        