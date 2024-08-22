import codewars_test as test
from solution import my_languages


@test.it("Sample tests")
def tests():
    test.assert_equals(my_languages({"Java": 10, "Ruby": 80, "Python": 65}),
                       ["Ruby", "Python"])
    test.assert_equals(my_languages({"Hindi": 60, "Dutch": 93, "Greek": 71}),
                       ["Dutch", "Greek", "Hindi"])
    test.assert_equals(my_languages({"C++": 50, "ASM": 10, "Haskell": 20}),
                       [])