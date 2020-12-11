package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
                if (board[row][i] != 'X') {
                    result = false;
                    break;
                }
            }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int a = 0; a < board.length; a++) {
            if (board[a][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int b = 0; b < board.length; b++) {
            rsl[b] = board[b][b];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int j = 0; j < board.length; j++) {
            if (monoHorizontal(board, j) || monoVertical(board, j)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
