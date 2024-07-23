enum game_state {
    NOT_FINISHED = -1, DRAW = 0, X_WON = 1, O_WON = 2
};

enum square { EMPTY = 0, X = 1, O = 2 };

enum game_state check_game_state (const enum square board[3][3])
{
                return (board[0][0] == 1 && board[0][1] == 1 && board[0][2] == 1)
                    || (board[1][0] == 1 && board[1][1] == 1 && board[1][2] == 1)
                    || (board[2][0] == 1 && board[2][1] == 1 && board[2][2] == 1)
                    || (board[0][0] == 1 && board[1][1] == 1 && board[2][2] == 1)
                    || (board[0][1] == 1 && board[1][1] == 1 && board[2][1] == 1)
                    || (board[0][0] == 1 && board[1][0] == 1 && board[2][0] == 1)
                    || (board[0][2] == 1 && board[1][2] == 1 && board[2][2] == 1)
                    || (board[2][0] == 1 && board[1][1] == 1 && board[0][2] == 1) ? X_WON :

                    (board[0][0] == 2 && board[0][1] == 2 && board[0][2] == 2)
                    || (board[1][0] == 2 && board[1][1] == 2 && board[1][2] == 2)
                    || (board[2][0] == 2 && board[2][1] == 2 && board[2][2] == 2)
                    || (board[0][0] == 2 && board[1][1] == 2 && board[2][2] == 2)
                    || (board[0][1] == 2 && board[1][1] == 2 && board[2][1] == 2)
                    || (board[0][0] == 2 && board[1][0] == 2 && board[2][0] == 2)
                    || (board[0][2] == 2 && board[1][2] == 2 && board[2][2] == 2)
                    || (board[2][0] == 2 && board[1][1] == 2 && board[0][2] == 2) ? O_WON :

                    board[0][0] != 0 && board[0][1] != 0 && board[0][2]!= 0
                    && board[1][0]!= 0 && board[1][1] != 0 && board[1][2] != 0
                    && board[2][0] != 0 && board[2][1] != 0 && board[2][2] != 0 ? DRAW : NOT_FINISHED;
}