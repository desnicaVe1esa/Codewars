package kyu_6.maze_runner.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MazeRunnerTest {
    int[][] maze = {
            { 1, 1, 1, 1, 1, 1, 1 },
            { 1, 0, 0, 0, 0, 0, 3 },
            { 1, 0, 1, 0, 1, 0, 1 },
            { 0, 0, 1, 0, 0, 0, 1 },
            { 1, 0, 1, 0, 1, 0, 1 },
            { 1, 0, 0, 0, 0, 0, 1 },
            { 1, 2, 1, 0, 1, 0, 1 } };

    @Test
    void testBasic() {
//        assertEquals("Finish", MazeRunner.walk(maze, new String[] { "N", "N", "N", "N", "N", "E", "E", "E", "E", "E" }), "Expected Finish");
//        assertEquals("Finish", MazeRunner.walk(maze, new String[] { "N", "N", "N", "N", "N", "E", "E", "S", "S", "E", "E", "N", "N", "E" }), "Expected Finish");
//        assertEquals("Finish", MazeRunner.walk(maze, new String[] { "N", "N", "N", "N", "N", "E", "E", "E", "E", "E", "W", "W" }), "Expected Finish");

//        assertEquals("Dead", MazeRunner.walk(maze, new String[] { "N", "N", "N", "W", "W" }), "Expected Dead");
        assertEquals("Dead", MazeRunner.walk(maze, new String[] { "N", "N", "N", "N", "N", "E", "E", "S", "S", "S", "S", "S", "S" }), "Expected Dead");

        assertEquals("Lost", MazeRunner.walk(maze, new String[] { "N", "E", "E", "E", "E" }), "Expected Lost");
    }
}

