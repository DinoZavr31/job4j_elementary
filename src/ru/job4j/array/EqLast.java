package ru.job4j.array;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        boolean result = true;
        for (int a = 0; a < left.length; a++) {
            for (int b = 0; b < right.length; b++) {
                if (left[left.length - 1] == right[right.length - 1]) {
                    result = true;
                    break;
                } else {
                    result = false;
                }
            }
        }
        return result;
    }
}

