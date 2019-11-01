package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball yellow = new Ball();
        Hare gray = new Hare();
        Fox red = new Fox();
        Wolf angry = new Wolf();


        gray.tryEat(yellow);
        angry.tryEat(yellow);
        red.tryEat(yellow);

    }
}
