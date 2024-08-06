import codewars_test as test
from solution import jumping_number

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it("Single Digit Number")
    def single_digit_number_test():
        test.assert_equals(jumping_number(1), "Jumping!!")
        test.assert_equals(jumping_number(7), "Jumping!!")
        test.assert_equals(jumping_number(9), "Jumping!!")

    @test.it("Two Digit Number")
    def two_digit_number_test():
        test.assert_equals(jumping_number(23), "Jumping!!")
        test.assert_equals(jumping_number(32), "Jumping!!")
        test.assert_equals(jumping_number(79), "Not!!")
        test.assert_equals(jumping_number(98), "Jumping!!")

    @test.it("Larger Numbers")
    def larger_numbers_test():
        test.assert_equals(jumping_number(8987)     , "Jumping!!")
        test.assert_equals(jumping_number(4343456)  , "Jumping!!")
        test.assert_equals(jumping_number(98789876) , "Jumping!!")
        test.assert_equals(jumping_number(987654322), "Not!!")