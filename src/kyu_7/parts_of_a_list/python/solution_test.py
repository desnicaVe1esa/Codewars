import codewars_test as test

@test.describe("Parts")
def tests():
    def testing(actual, expected):
        test.assert_equals(actual, expected)
    @test.it("basic tests")
    def basics():
        testing(partlist(["I", "wish", "I", "hadn't", "come"]),
                [("I", "wish I hadn't come"), ("I wish", "I hadn't come"), ("I wish I", "hadn't come"), ("I wish I hadn't", "come")])
        testing(partlist(["cdIw", "tzIy", "xDu", "rThG"]),
                [("cdIw", "tzIy xDu rThG"), ("cdIw tzIy", "xDu rThG"), ("cdIw tzIy xDu", "rThG")])
        testing(partlist(["vJQ", "anj", "mQDq", "sOZ"]),
                [("vJQ", "anj mQDq sOZ"), ("vJQ anj", "mQDq sOZ"), ("vJQ anj mQDq", "sOZ")])





