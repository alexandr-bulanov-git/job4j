package ru.job4j.condition;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
/**
 * @author Alexandr Bulanov
 * @version $ID$
 * * @since 04.11.2019;
 */
 /*
 Расстояние между точками в трехмерном пространстве.
 Задание:
    1. Перегрузите конструктор Point.
    2. Реализуйте метод distance3d.
    3. Используйте формулу
  */
public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.x = third;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
    }
}
