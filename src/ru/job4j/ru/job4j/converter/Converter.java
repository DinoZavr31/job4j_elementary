package ru.job4j.ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");
        int ab = 140;
        int expected = Converter.rubleToEuro(ab);
        int v1 = 2;
        boolean pas1 = expected == v1;
        System.out.println("140 rubles are 2. Test result : " + pas1);
        int ac = 120;
        int ad = Converter.rubleToDollar(ac);
        int v2 = 2;
        boolean pas2 = ad == v2;
        System.out.println("140 rubles are 2. Test result : " + pas2);

    }
}
