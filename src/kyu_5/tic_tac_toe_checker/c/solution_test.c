#include <stdio.h>
#include <criterion/criterion.h>

enum game_state {
	NOT_FINISHED = -1, DRAW = 0, X_WON = 1, O_WON = 2
};

enum square { EMPTY = 0, X = 1, O = 2 };

extern enum game_state check_game_state (const enum square board[3][3]);
static void do_test (const enum square board[3][3], enum game_state expected);

Test(tests_suite, sample_tests)
{
	do_test((enum square[3][3]){
		{1,1,1},
		{0,2,2},
		{0,0,0}
	}, 1);

	do_test((enum square[3][3]){
		{1,2,0},
		{0,1,2},
		{0,0,1}
	}, 1);

	do_test((enum square[3][3]){
		{2,1,1},
		{0,1,1},
		{2,2,2}
	}, 2);

	do_test((enum square[3][3]){
		{2,2,2},
		{0,1,1},
		{1,0,0}
	}, 2);

	do_test((enum square[3][3]){
		{2,1,2},
		{2,1,1},
		{1,2,1}
	}, 0);

	do_test((enum square[3][3]){
		{1,2,1},
		{1,1,2},
		{2,1,2}
	}, 0);

	do_test((enum square[3][3]){
		{2,0,2},
		{2,1,1},
		{1,2,1}
	}, -1);

	do_test((enum square[3][3]){
		{0,0,2},
		{0,0,0},
		{1,0,1}
	}, -1);

	do_test((enum square[3][3]){
		{1,2,1},
		{1,1,2},
		{2,2,0}
	}, -1);

	do_test((enum square[3][3]){
		{0,2,2},
		{2,1,1},
		{0,0,1}
	}, -1);

	do_test((enum square[3][3]){
		{0,1,1},
		{2,0,2},
		{2,1,0}
	}, -1);

	do_test((enum square[3][3]){
		{0,0,1},
		{0,1,2},
		{2,1,0}
	}, -1);
}

static char *sprint_board (char *string, const enum square board[3][3])
{
	static const char chars[] = { [EMPTY] = '_', [X] = 'X', [O] = 'O' };

	sprintf(string,
		"+---+---+---+\n"
		"| %c | %c | %c |\n"
		"+---+---+---+\n"
		"| %c | %c | %c |\n"
		"+---+---+---+\n"
		"| %c | %c | %c |\n"
		"+---+---+---+",
		chars[board[0][0]], chars[board[0][1]], chars[board[0][2]],
		chars[board[1][0]], chars[board[1][1]], chars[board[1][2]],
		chars[board[2][0]], chars[board[2][1]], chars[board[2][2]]
	);
	return string;
}

static void do_test (const enum square board[3][3], enum game_state expected)
{
	static const char *const state_strings[] = {
		"NOT_FINISHED", "DRAW", "X_WON", "O_WON"
    };

	enum game_state actual = check_game_state(board);
	cr_assert_eq(actual, expected,
		"expected %s, but got %s, for board:\n%s",
		state_strings[expected + 1], state_strings[actual + 1],
		sprint_board((char[256]){""}, board)
	);
}