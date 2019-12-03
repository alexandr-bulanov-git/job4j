package ru.job4j.pojo;
/*
 Модель данных
 author – Alexandr Bulanov;
 since – 03.12.2019;
 version – $ID$
 */
import java.util.Date;

public class Student {
/*  @name - Имя
    @secondName - Фамилиля
    @group - Группа
    @receiptDate - Дата поступления
*/
    private String name;
    private String secondName;
    private String group;
    private Date receiptDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }
}
