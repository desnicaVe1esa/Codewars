import codewars_test as test
from solution import duck_duck_goose
class Player:
    def __init__(self, name):
        self.name = name
        
ex_names = ["a", "b", "c", "d", "c", "e", "f", "g", "h", "z"]
players = list(map((lambda x: Player(x)), ex_names))

@test.describe("Fixed Tests")
def fixed_tests():
    @test.it("should find the correct goose")
    def basic_test_cases():
        test.assert_equals(duck_duck_goose(players, 1),  "a")
        test.assert_equals(duck_duck_goose(players, 3),  "c")
        test.assert_equals(duck_duck_goose(players, 10), "z")
        test.assert_equals(duck_duck_goose(players, 20), "z")
        test.assert_equals(duck_duck_goose(players, 30), "z")
        test.assert_equals(duck_duck_goose(players, 18), "g")
        test.assert_equals(duck_duck_goose(players, 28), "g")
        test.assert_equals(duck_duck_goose(players, 12), "b")
        test.assert_equals(duck_duck_goose(players, 2),  "b")
        test.assert_equals(duck_duck_goose(players, 7),  "f")