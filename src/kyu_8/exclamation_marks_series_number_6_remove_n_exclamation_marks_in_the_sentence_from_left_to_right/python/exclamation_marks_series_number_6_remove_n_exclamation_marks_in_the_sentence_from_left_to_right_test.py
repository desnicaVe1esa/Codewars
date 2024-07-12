import codewars_test as test
from solution import remove

@test.describe("Fixed Tests")
def fixed_tests():
        @test.it('Basic Test Cases')
        def basic_test_cases():

                tests = [
                        #[[input], [expected]],
                        [["Hi!",1] , "Hi"],
                        [["Hi!",100] , "Hi"],
                        [["Hi!!!",1] , "Hi!!"],
                        [["Hi!!!",100] , "Hi"],
                        [["!Hi",1] , "Hi"],
                        [["!Hi!",1] , "Hi!"],
                        [["!Hi!",100] , "Hi"],
                        [["!!!Hi !!hi!!! !hi",1] , "!!Hi !!hi!!! !hi"],
                        [["!!!Hi !!hi!!! !hi",3] , "Hi !!hi!!! !hi"],
                        [["!!!Hi !!hi!!! !hi",5] , "Hi hi!!! !hi"],
                        [["!!!Hi !!hi!!! !hi",100] , "Hi hi hi"],
                ]


                for inp, exp in tests:
                        test.assert_equals(remove(*inp), exp)