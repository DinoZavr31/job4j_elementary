package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int a = 0; a < word.length; a++) {
            for (int b = 0; b < pref.length; b++) {
                if (word[a] == pref[b]) {
                    result = true;
                } else {
                    result = false;
                }
        }
        }
        return result;
    }
}
