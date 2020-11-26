package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int a = 0; a < post.length; a++) {
            for (int b = 0; b < word.length; b++) {
                if (post[post.length - 1] == word[word.length - 1 - b]) {
                    result = true;
                    break;
                } else {
                    result = false;
                }
            }
        }
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        return result;
    }
}
