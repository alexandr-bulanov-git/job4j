package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) { return value / 70; }

    public static int rubleToDollar(int value) { return value / 60; }

    public static int dollarToRuble(int value) { return value * 60; }

    public static int euroToRuble(int value) { return value * 70; }


    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int dollar = rubleToDollar(700);
        System.out.println("700 rubles are " + dollar + " dollar.");

        int dollar2 = dollarToRuble(140);
        System.out.println("140 dollar are " + dollar2 + " ruble.");

        int euro2 = euroToRuble(700);
        System.out.println("700 euro are " + euro2 + " ruble.");
    }
}
