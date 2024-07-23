using System;
using NUnit.Framework;

[TestFixture]
public class TicTacToeTest {
	private TicTacToe tictactoe = new TicTacToe();

	[Test]
	public void test1() {
		int[,] board = new int[,] { { 1, 1, 1 }, { 0, 2, 2 }, { 0, 0, 0 } };
    Assert.AreEqual(1, tictactoe.IsSolved(board));
	}
}