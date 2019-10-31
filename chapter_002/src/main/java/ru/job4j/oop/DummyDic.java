package ru.job4j.oop;
/**
 * Вызов метод с возвращаемым типом.
 *
 * @author Alexandr Bulanov
 * @version $Id$
 * @since 31.10.2019
 */

public class DummyDic {
    public static void main(String[] args) {
        DummyDic slovar = new DummyDic();
        String words = slovar.engToRus("Тру-ля-ля");
        System.out.println(words);
    }

    public String engToRus(String eng) {
        return "Неизвестное слово: " + eng;
    }
}
