# not yet finished
board = [[0, 0, 1],
         [0, 1, 2],
         [2, 1, 0]]
test.assert_equals(is_solved(board), -1)

# winning row
board = [[1, 1, 1],
         [0, 2, 2],
         [0, 0, 0]]
test.assert_equals(is_solved(board), 1)

# winning column
board = [[2, 1, 2],
         [2, 1, 1],
         [1, 1, 2]]
test.assert_equals(is_solved(board), 1)

# draw
board = [[2, 1, 2],
         [2, 1, 1],
         [1, 2, 1]]
test.assert_equals(is_solved(board), 0)