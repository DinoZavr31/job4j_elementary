package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int a = 0; a < post.length; a++) {
            if (post[post.length - a - 1] != word[word.length - 1 - a]) {
                result = false;
                    break;
            }
        }
        return result;
    }
}
