from solution import isPP
import codewars_test as test
from random import random, randrange
from math import log, floor

@test.describe("perfect powers")
def perfect_powers():

    @test.it("should work for some examples")
    def should_work_for_some_examples():
        test.assert_equals(isPP(4), [2,2], "4 = 2^2")
        test.assert_equals(isPP(9), [3,2], "9 = 3^2")
        test.assert_equals(isPP(5), None, "5 isn't a perfect power")

    @test.it("should work for the first perfect powers")
    def should_work_for_the_first_perfect_powers():
        pp = [4, 8, 9, 16, 25, 27, 32, 36, 49, 64, 81, 100, 121, 125, 128, 144, 169, 196, 216, 225, 243, 256, 289, 324, 343, 361, 400, 441, 484]
        for item in pp:
            test.expect(isPP(item) != None, "the perfect power "+str(item)+" wasn't recognized as one")

    @test.it("should work for random perfect powers")
    def should_work_for_random_perfect_powers():
        for i in range(100):
            m = 2 + floor(random() * 255)
            k = 2 + floor(random() * log(268435455) / log(m))
            l = m**k
            r = isPP(l)
            if r==None:
                test.expect(r != None, str(l) + " is a perfect power")
                break
            elif r[0]**r[1] != l:
                test.assert_equals(r[0]**r[1], l, "your pair (" + str(r[0]) + ", "+ str(r[1])+ ") doesn't work for "+ str(l))
                break


    @test.it("should return valid pairs for random inputs")
    def should_return_valid_pairs_for_random_inputs():
        for i in range(100):
            l = randrange(65535);
            r = isPP(l);
            if r != None and r[0]**r[1] != l:
                test.assert_equals(r[0]**r[1], l, "your pair ("+str(r[0])+", "+str(r[1])+") doesn't work for "+str(l))
                break