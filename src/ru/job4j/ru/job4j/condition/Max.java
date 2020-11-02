package ru.job4j.ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left >= right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int otvet = Max.max(2, 2);
        System.out.println(otvet);
    }
}
