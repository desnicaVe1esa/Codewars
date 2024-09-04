import codewars_test as test
from solution import over_the_road
test.assert_equals(over_the_road(1, 3), 6)
test.assert_equals(over_the_road(3, 3), 4)
test.assert_equals(over_the_road(2, 3), 5)
test.assert_equals(over_the_road(3, 5), 8)
test.assert_equals(over_the_road(7, 11), 16)
test.assert_equals(over_the_road(23633656673, 310027696726), 596421736780)