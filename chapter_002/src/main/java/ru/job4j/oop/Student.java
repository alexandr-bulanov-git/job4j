package ru.job4j.oop;

/**
 * Вызов метода объекта.
 *
 * @author Alexandr Bulanov (bulanov.alexander@mail.ru)
 * @version $Id$
 * @since 31.10.2019
 */

public class Student {
    /**
     * Игра на баяне.
     */
    public void music() {
        System.out.println("Петя играет на баяне: Tra tra tra");
    }
    public void song() {
        /**
         * Пение.
         */
        System.out.println("Петя поет: I believe I can fly");
    }
    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
        petya.music();
        petya.music();
        petya.song();
        petya.song();
        petya.song();
    }
}
