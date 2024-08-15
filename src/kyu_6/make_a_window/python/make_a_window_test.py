import codewars_test as test
from solution import make_a_window

@test.describe('Example Tests')
def example_tests():
    @test.it('Example Test Case')
    def example_test_case():
        test.assert_equals(make_a_window(3), "---------\n|...|...|\n|...|...|\n|...|...|\n|---+---|\n|...|...|\n|...|...|\n|...|...|\n---------")