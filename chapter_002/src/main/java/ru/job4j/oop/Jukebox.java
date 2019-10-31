package ru.job4j.oop;
/**
 * Вызов метода с аргументами.
 *
 * @author Alexandr Bulanov
 * @version $Id$
 * @since 31.10.2019
 */
public class Jukebox {
    public static void main(String[] args) {
        Jukebox view = new Jukebox();
        view.music(1);
        view.music(2);
        view.music(3);
    }

    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (position == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
}
