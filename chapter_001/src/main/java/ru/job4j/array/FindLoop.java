package ru.job4j.array;

/**
 * Классический поиск перебором.
 *
 * @author Alexandr Bulanov (bulanov.alexander@mail.ru)
 * @version $Id$
 * @since 21.10.2019
 */

public class FindLoop {
    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}
