package ru.job4j.pojo;

import java.net.SocketOption;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Alex");
        student.setSecondName("Bulanov");
        student.setGroup("General");
        student.setReceiptDate(new Date());

        System.out.println(student.getName() + " " + student.getSecondName() + " в группу " + student.getGroup()
                + " поступил " + student.getReceiptDate());
    }
}
