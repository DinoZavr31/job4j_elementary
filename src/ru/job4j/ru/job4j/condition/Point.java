package ru.job4j.ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        double ac = Math.pow(a, 2);
        double ad = Math.pow(b, 2);
        double f = ac + ad;
        double af = Math.sqrt(f);
        return af;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
