package kyu_6.escape_the_knight.java;

/* Некорректный тест

class SolutionTest {
    @Test
    void sampleTests()  {

        final String[] kingSquares = {"a8", "e5", "g7", "a1", "b7", "f3", "c2", "h1"};
        final String[] knightSquares = {"h1", "f2", "d4", "b1", "f4", "g2", "b5", "e3"};
        final int[] numberOfMoves = {10, 20, 30, 50, 17, 29, 9, 44};

        for (int count = 0; count < kingSquares.length; count++) {
            final String[] moves = EscapeTheKnight.chooseKingMoves(kingSquares[count], knightSquares[count], numberOfMoves[count]);
            final ResultMessage test = Preloaded.play(kingSquares[count], knightSquares[count], numberOfMoves[count], moves);
            assertTrue(test.result, " Result: " + test.message);
        }
    }
}
 */
