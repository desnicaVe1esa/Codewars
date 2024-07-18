import codewars_test as test
from solution import billboard

sample_test_cases = [
    #  name                price  expected
    (('Jeong-Ho Aristotelis',  ),   600),
    (('Abishai Charalampos',   ),   570),
    (('Idwal Augustin',        ),   420),
    (('Hadufuns John',       20),   260),
    (('Zoroaster Donnchadh',   ),   570),
    (('Claude Miljenko',       ),   450),
    (('Werner Vigi',         15),   165),
    (('Anani Fridumar',        ),   420),
    (('Paolo Oli',             ),   270),
    (('Hjalmar Liupold',     40),   600),
    (('Simon Eadwulf',         ),   390),
]

@test.describe('Sample tests')
def sample_tests():
    for args, expected in sample_test_cases:
        @test.it(f'billboard({", ".join(map(repr, args))})')
        def _():
            test.assert_equals(billboard(*args), expected)