import codewars_test as test
from solution import two_sum

sample_test_cases = [
    #   numbers       target   valid results
    ([1 ,2, 3],            4,  ((0,2), (2,0))),
    ([1234,5678,9012], 14690,  ((1,2), (2,1))),
    ([2, 2, 3],            4,  ((0,1), (1,0))),
]

@test.describe('Sample tests')
def sample_tests():
    for numbers, target, valid_results in sample_test_cases:
        @test.it(f'two_sums({numbers}, {target})')
        def _():
            actual = two_sum(numbers, target)
            msg = []
            if isinstance(actual, list): msg.append('The result should be a tuple, not a list')
            msg.append(f'{actual} should be either {valid_results[0]} or {valid_results[1]}')
            test.expect(actual in valid_results, '\n'.join(msg))