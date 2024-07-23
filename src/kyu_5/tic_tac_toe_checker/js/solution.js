function isSolved(board) {
    return (board[0][0] === 1 && board[0][1] === 1 && board[0][2] === 1)
    || (board[1][0] === 1 && board[1][1] === 1 && board[1][2] === 1)
    || (board[2][0] === 1 && board[2][1] === 1 && board[2][2] === 1)
    || (board[0][0] === 1 && board[1][1] === 1 && board[2][2] === 1)
    || (board[0][1] === 1 && board[1][1] === 1 && board[2][1] === 1)
    || (board[0][0] === 1 && board[1][0] === 1 && board[2][0] === 1)
    || (board[0][2] === 1 && board[1][2] === 1 && board[2][2] === 1)
    || (board[2][0] === 1 && board[1][1] === 1 && board[0][2] === 1) ? 1 :

        (board[0][0] === 2 && board[0][1] === 2 && board[0][2] === 2)
        || (board[1][0] === 2 && board[1][1] === 2 && board[1][2] === 2)
        || (board[2][0] === 2 && board[2][1] === 2 && board[2][2] === 2)
        || (board[0][0] === 2 && board[1][1] === 2 && board[2][2] === 2)
        || (board[0][1] === 2 && board[1][1] === 2 && board[2][1] === 2)
        || (board[0][0] === 2 && board[1][0] === 2 && board[2][0] === 2)
        || (board[0][2] === 2 && board[1][2] === 2 && board[2][2] === 2)
        || (board[2][0] === 2 && board[1][1] === 2 && board[0][2] === 2) ? 2 :

            board[0][0] !== 0 && board[0][1] !== 0 && board[0][2]!== 0
            && board[1][0]!== 0 && board[1][1] !== 0 && board[1][2] !== 0
            && board[2][0] !== 0 && board[2][1] !== 0 && board[2][2] !== 0 ? 0 : -1;
}

module.exports = isSolved;