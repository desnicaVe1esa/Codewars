import codewars_test as test
import preloaded
from solution import find
from math import pi

@test.describe("Your refactored find() function")
def test_find():
        @test.it("should behave as expected")
        def test_behav():
                array = [2,3,5,7,11]
                test.assert_equals(find(array, 5), 2)
                test.assert_equals(find(array, 11), 4)
                test.assert_equals(find(array, 3), 1)
                test.assert_equals(find(array, 2), 0)
                test.assert_equals(find(array, 7), 3)
                test.assert_equals(find(array, 1), 'Not found')
                test.assert_equals(find(array, 8), 'Not found')

                array = [True, 'Hello World', False, 'Lorem Ipsum', 6, pi];
                test.assert_equals(find(array, 'Hello World'), 1)
                test.assert_equals(find(array, 'lorem ipsum'), 'Not found')
                test.assert_equals(find(array, 'Lorem Ipsum'), 3)
                test.assert_equals(find(array, False), 2)
                test.assert_equals(find(array, True), 0)
                test.assert_equals(find(array, pi), 5)
                test.assert_equals(find(array, 3.14), 'Not found')
                test.assert_equals(find(array, 6), 4)
