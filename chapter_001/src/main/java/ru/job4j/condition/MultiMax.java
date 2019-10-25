package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
           // return first > second ? (first > second ? first : third) : (second > third ? second : third);
            if (first > second & first > third) {
                return first;
            }
            if (second > first & second > third) {
                return second;
            } else {
                return third;
            }
    }
}
