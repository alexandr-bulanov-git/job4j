package ru.job4j.pojo;
/*
Массивы и модели.
1. Создайте модель данных книга с полями: имя и количество страниц. ru.job4j.pojo.Book.
2. Создайте класс ru.job4j.pojo.Library и в нем метод main.
3. В методе main создайте 4 объекта Book. Добавьте их в массив. Сделайте одну книгу с именем "Clean code".
4. Выведите содержимое массива на консоль через цикл for + index.
5. Переставьте книгу с индексом 0 и 3. Выведите содержимое массива на консоль.
6. Добавьте цикл с выводом книг с именем "Clean code".

 author – Alexandr Bulanov;
 since – 03.12.2019;
 version – $ID$
 */
public class Book {
/*
@name - Имя
@count - кол-во страниц
 */
    private String name;
    private int count;

    public Book(String name, int count){
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
