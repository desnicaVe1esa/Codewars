from solution import mxdiflg
import codewars_test as test

@test.describe("mxdiflg")
def _():
    @test.it("Basic tests")
    def _():
        s1 = ["hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"]
        s2 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
        test.assert_equals(mxdiflg(s1, s2), 13)
        s1 = ["ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"]
        s2 = ["bbbaaayddqbbrrrv"]
        test.assert_equals(mxdiflg(s1, s2), 10)
        s2 = []
        s1 = ["cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"]
        test.assert_equals(mxdiflg(s1, s2), -1) 