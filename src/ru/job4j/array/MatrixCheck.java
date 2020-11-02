package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int index = 0; index < board.length - 1; index++) {
            if ((board[row][index] != 'X') && (board[row][index] == board[row][index + 1])) {
                result = false;
                break;
            }
        }
        return result;
    }
}