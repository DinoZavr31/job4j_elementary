package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int b = 0; b < pref.length; b++) {
            if (pref[b] != word[b]) {
                result = false;
                break;
            }
        }
        return result;
    }
}