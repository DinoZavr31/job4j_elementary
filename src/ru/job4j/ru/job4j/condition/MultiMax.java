package ru.job4j.ru.job4j.condition;

public class MultiMax {
    public  static int max(int first, int second, int third) {
        int result = first;
        if (second > first && second > third) {
            result = second;
        } else if (third > first && third > second) {
            result = third;
        }
        return result;
    }
}
