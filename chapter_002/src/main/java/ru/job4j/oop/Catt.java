package ru.job4j.oop;

public class Catt {
    private String food;
    private String name = "Romka";
    public void giveNick(String nick) {
        this.name = nick;
    }
    public void show() {
        System.out.println(this.name + " " + "eat" + " " + this.food);
    }
    public void eat(String meat) {
        this.food = meat;
    }
    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Catt gav = new Catt();
        Catt nick = new Catt();
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black's food.");
        Catt black = new Catt();
        black.eat("fish");
        black.show();
    }
}