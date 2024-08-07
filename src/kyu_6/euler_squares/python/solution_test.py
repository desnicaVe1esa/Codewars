import codewars_test as test
from solution import create_euler_square
from preloaded import *

@test.describe('Example tests')
def example_tests():

    for i in range(1,10,2):
        sqr1, sqr2 = create_euler_square(i)
        show_squares = stringify_two_arrays(sqr1, sqr2)
        result, message = validate_euler_square(sqr1, sqr2 ,i)
        test.expect(result, show_squares + "\nProblem: " + message)