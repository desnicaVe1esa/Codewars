package kyu_6.maze_runner.java;

public class MazeRunner {
    public static String walk(int[][] maze, String[] directions) {
        int[] start = findStartIndex(maze);
        for (int i = 0; i < directions.length; i++) {
            switch (directions[i]) {
                case "N" -> {
                    start[0] -= 1;
                    if (
                            start[0] > maze.length - 1
                                    || start[1] > maze.length - 1
                                    || start[0] < 0
                                    || start[1] < 0
                                    || maze[start[0]][start[1]] == 1
                    ) {
                        return "Dead";
                    } else if (maze[start[0]][start[1]] == 3){
                        return "Finish";
                    }
                }
                case "S" -> {
                    start[0] += 1;
                    if (
                            start[0] > maze.length - 1
                                    || start[1] > maze.length - 1
                                    || start[0] < 0
                                    || start[1] < 0
                                    || maze[start[0]][start[1]] == 1
                    ) {
                        return "Dead";
                    } else if (maze[start[0]][start[1]] == 3){
                        return "Finish";
                    }
                }
                case "W" -> {
                    start[1] -= 1;
                    if (
                            start[0] > maze.length - 1
                                    || start[1] > maze.length - 1
                                    || start[0] < 0
                                    || start[1] < 0
                                    || maze[start[0]][start[1]] == 1
                    ) {
                        return "Dead";
                    } else if (maze[start[0]][start[1]] == 3){
                        return "Finish";
                    }
                }
                case "E" -> {
                    start[1] += 1;
                    if (
                            start[0] > maze.length - 1
                                    || start[1] > maze.length - 1
                                    || start[0] < 0
                                    || start[1] < 0
                                    || maze[start[0]][start[1]] == 1
                    ) {
                        return "Dead";
                    } else if (maze[start[0]][start[1]] == 3){
                        return "Finish";
                    }
                }
            }
        }
        return "Lost";
    }

    public static int[] findStartIndex(int[][] maze) {
        int[] coordinates = new int[2];
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                if (maze[i][j] == 2) {
                    coordinates[0] = i;
                    coordinates[1] = j;
                }
            }
        }
        return coordinates;
    }
}
