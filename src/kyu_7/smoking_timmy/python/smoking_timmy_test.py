import codewars_test as test
from solution import start_smoking

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it ("Should be: start_smoking(0,1) --> 22")
    def basic_test_cases():
        test.assert_equals(start_smoking(0,1),22)

    @test.it ("Should be: start_smoking(1,0) --> 224")
    def basic_test_cases():
        test.assert_equals(start_smoking(1,0),224)

    @test.it ("Should be: start_smoking(1,1) --> 247")
    def basic_test_cases():
        test.assert_equals(start_smoking(1,1),247)

    @test.it ("Should be: start_smoking(10,2) --> 2294")
    def basic_test_cases():
        test.assert_equals(start_smoking(10,2),2294);