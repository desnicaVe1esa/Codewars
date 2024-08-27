import codewars_test as test
from solution import explode

sample_test_cases = [
    # (input, expected),
    ('312', '333122'),
    ('102269','12222666666999999999'),
    ('0', ''),
    ('000', ''),
    ('123', '122333'),
]

@test.describe('Sample tests')
def sample_tests():
    for s, expected in sample_test_cases:
        @test.it(f'explode({s!r})')
        def _():
            test.assert_equals(explode(s), expected)