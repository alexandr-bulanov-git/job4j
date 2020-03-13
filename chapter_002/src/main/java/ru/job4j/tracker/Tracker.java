package ru.job4j.tracker;
import java.util.Random;
import java.util.Arrays;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        //Реализовать метод генерации.
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    public static class DropArray {
        public static void main(String[] args) {
            String[] names = {"Petr", null, "Ivan", "Stepan", null};
            String[] namesWithoutNull = new String[names.length];
            int size = 0;
            for (int index = 0; index < names.length; index++) {
                String name = names[index];
                if (name != null) {
                    namesWithoutNull[size] = name;
                    size++;
                }
            }
            namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
            for (int index = 0; index < namesWithoutNull.length; index++) {
                System.out.println(namesWithoutNull[index]);
            }
        }
    }
}
