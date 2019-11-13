package ru.job4j.tracker;

/*
Задание.
1. Создайте три класса Animal > Predator > Tiger.
2. В каждом классе создайте контруктор без параметров.
   В каждом конструкторе сделайте вызов конструктора родителя и вывод на консоль имени класса.
 */

public class Animal {

    public static void main(String[] args) {
        Predator predator = new Predator();
        Tiger tiger = new Tiger();
    }
}
