package ru.job4j.oop;

public class Story {
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl2 girl2 = new Girl2();
        Wolf2 wolf2 = new Wolf2();

        girl2.help(petya);
        wolf2.eat(girl2);
        petya.kill(wolf2);
    }
}
