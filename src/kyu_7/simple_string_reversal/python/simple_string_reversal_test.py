import codewars_test as test
from solution import solve
@test.describe('Fixed Tests')
def fixed_tests():
    @test.it('Simple Cases')
    def example_cases():
        test.assert_equals(solve("codewars"),"srawedoc")
        test.assert_equals(solve("your code"),"edoc ruoy")
        test.assert_equals(solve("your code rocks"),"skco redo cruoy")
        test.assert_equals(solve("i love codewars"),"s rawe docevoli")