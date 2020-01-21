package ru.job4j.inheritance;

/**
 * Переопределение.
 *
 * @author Alexandr Bulanov
 * @version $Id$
 * @since 21.01.2020
 *
 * Задание.
 * 1. Создайте класс JSONReport. Он должен наследоваться от TextReport.
 * 2. Переопределите методы generate. Этот метод должен вернуть шаблон в формате JSON.
 * Пример шаблона
 *  {
 *    name : name,
 *    body : body
 * }
 */

public class ReportUsage {
    public static void main(String[] args) {
        //TextReport report = new TextReport();
        HtmlReport report = new HtmlReport();
        //JSONReport report = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}

