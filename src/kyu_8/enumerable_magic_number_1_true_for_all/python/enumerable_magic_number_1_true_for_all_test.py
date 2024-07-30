import codewars_test as test
from solution import _all

@test.describe('Example Tests')
def example_tests():

    greater_than_9 = lambda x: x>9
    less_than_9 = lambda x: x<9

    @test.it('greater than 9')
    def _():
        test.assert_equals(_all((1, 2, 3, 4, 5), greater_than_9), False)

    @test.it('less than 9')
    def _():
        test.assert_equals(_all((1, 2, 3, 4, 5), less_than_9), True)