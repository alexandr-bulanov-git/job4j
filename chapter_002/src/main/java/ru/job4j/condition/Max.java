package ru.job4j.condition;
/**
 * Максимум из двух чисел добавить перегруженный метод max для трех и четырех чисел.
 * *author – Alexandr Bulanov;
 * *since – 03.11.2019;
 * *version – $ID$
 */
public class Max {
    public int max(int first, int second) {
        second = first < 0 ? first : second;
        return second;
    }

    public int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public int max(int first, int second, int third, int four) {
        return max(first, max(second, third, four));

    }
}
