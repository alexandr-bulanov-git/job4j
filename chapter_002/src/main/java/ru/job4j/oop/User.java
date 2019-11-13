package ru.job4j.oop;

public class User {
    private String name; // Переменная (поле) класса, потому что она объявлена в классе.
    private int age;  // Переменная (поле) класса, потому что она объявлена в классе.

    public boolean canDrive() {
        boolean can = false; //Переменная (поле) локальная, потому что она объявлена в методе.
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
