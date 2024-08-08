from solution import spacify
import codewars_test as test

@test.describe("Basic tests")
def basic_tests():
    @test.it('Basic text')
    def basic():
        test.assert_equals(spacify("hello world"),"h e l l o   w o r l d");
        test.assert_equals(spacify("12345"),"1 2 3 4 5")
        test.assert_equals(spacify("Pippi"),"P i p p i")
    @test.it('Empty or length 1 strings')
    def empty():
        test.assert_equals(spacify("a"),"a")
        test.assert_equals(spacify(""),"")