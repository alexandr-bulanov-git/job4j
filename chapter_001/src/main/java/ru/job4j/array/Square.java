package ru.job4j.array;

/**
 * Заполнить массив степенями чисел.
 *
 * @author Alexandr Bulanov (bulanov.alexander@mail.ru)
 * @version $Id$
 * @since 21.10.2019
 */

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        for (int i = 0; i < bound; i++) {
            rst[i] = (i + 1) * (i + 1);
            System.out.println(rst[i]);
        }
        return rst;
    }
}
