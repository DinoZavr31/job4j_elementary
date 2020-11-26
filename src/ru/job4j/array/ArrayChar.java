package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int b = 0; b < pref.length; b++) {
            for (int a = 0; a < word.length; a++) {
                if (pref[b] == word[a]) {
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
