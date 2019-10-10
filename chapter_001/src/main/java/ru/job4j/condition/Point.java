package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        return x;
    }

    public static void main(String[] args) {
        double result = distance(0, 2, 5, 0);
        System.out.println("result (0, 0) to (2, 0)  = " + result);
    }
}

