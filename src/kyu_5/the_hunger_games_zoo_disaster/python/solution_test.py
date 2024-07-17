from solution import who_eats_who
import codewars_test as test

@test.it("example")
def example():
    input = "fox,bug,chicken,grass,sheep"
    expected = ["fox,bug,chicken,grass,sheep",
                "chicken eats bug",
                "fox eats chicken",
                "sheep eats grass",
                "fox eats sheep",
                "fox"]
    test.assert_equals(who_eats_who(input), expected)