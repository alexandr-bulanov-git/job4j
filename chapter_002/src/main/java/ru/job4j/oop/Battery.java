package ru.job4j.oop;
/*
* Создать метод public void exchange(Battery another).
* Этот метод должен списывать заряд из батареи у кого вызывали метод exchange и добавить к объекту another.
 */
public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(1);
        Battery second = new Battery(2);
        first.exchange(second);
        System.out.println("Заряд батареи:" + " " + first.load + second.load);
    }
}
