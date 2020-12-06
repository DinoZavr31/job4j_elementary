package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int a = 0; a < table.length; a++) {
            for (int i = 0; i < table.length; i++) {
                table[a][i] = (a + 1) * (i + 1);
            }
        }
        return table;
    }
}
