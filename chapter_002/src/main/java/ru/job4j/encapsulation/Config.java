package ru.job4j.encapsulation;

/**
 * Что такое инкапсуляция.
 *
 * @author Alexandr Bulanov
 * @version $Id$
 * @since 21.01.2020
 *
 * Задание.
 *В этом классе есть 5 нарушений оговоренный выше правил.
 * - Для всех полей используем только модификатор private.
 * - Для классов - public. Во второй и третьей части курса так же применим для классов private.
 * - Для методов - public или private. Общее правило, если метод имеет модификатор default или
 * protected его нужно переделать на public
 * Вам необходимо устранить эти нарушения.
 */

public class Config {
   // Первое нарушение
    private String name;
    //Воторое нарушение
    private int position;
    //Нарушение
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }
    // Третье нарушение
    public void print() {
        System.out.println(position);
    }
    //Четвертое нарушени
    public String getProperty(String key) {
        return search(key);
    }
    //Пятое нарушение
    public String search(String key) {
        return key;
    }
}
