package ru.job4j.tracker;
/*
Задание.
1. Создайте три класса Animal > Predator > Tiger.
2. В каждом классе создайте контруктор без параметров.
   В каждом конструкторе сделайте вызов конструктора родителя
   и вывод на консоль имени класса.
3. Добавьте в базовый класс Animal поле String name, которое
   должно инициализироваться через конструктор.
4. Поправьте классы наследники, чтобы весь код после изменений
   был корректным.
 */
public class Animal {
    private String name;

    public Animal(){
    }

    public Animal(String name){
    }

    public static void main(String[] args){
        Predator predator;
        predator = new Predator();
        Tiger tiger = new Tiger();
    }
}
