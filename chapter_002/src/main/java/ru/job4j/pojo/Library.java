package ru.job4j.pojo;

import java.util.Arrays;
import java.util.Collections;

public class Library {
    public static void main(String[] args) {
    //3. В методе main создайте 4 объекта Book. Добавьте их в массив. Сделайте одну книгу с именем "Clean code".
        Book sports = new Book("Sports", 40);
        Book nature = new Book("Nature", 50);
        Book historical = new Book("Historical", 60);
        Book cleanCode = new Book("Clean Code", 70);

        Book[] books = new Book[4];

        books[0] = sports;
        books[1] = nature;
        books[2] = historical;
        books[3] = cleanCode;

//4. Выведите содержимое массива на консоль через цикл for + index.
        System.out.println();
        System.out.println("Вывод содержимого массива: ");
        for (int index = 0; index < books.length; index++){
            Book bk = books[index];
            System.out.println(bk.getName() + "-" + bk.getCount());
        }

//5. Переставьте книгу с индексом 0 и 3. Выведите содержимое массива на консоль.
        System.out.println();
        System.out.println("Переставляем книги местами sport и cleanCode: ");
        Book temp = new Book("Clean Code", 70);
        books[0] = temp;
        books[3] = sports;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getCount());
        }

//6. Добавьте цикл с выводом книг с именем "Clean code".
        System.out.println();
        System.out.println("Выводом книг с именем Clean code: ");
        for (int index = 0; index < books.length; index++){
            Book bk = books[index];
            if (bk.getName().equals("Clean Code")){
                System.out.println(bk.getName());
            }
        }


    }
}
