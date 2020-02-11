package ru.job4j.pojo;

/**
   Удаление моделей из массива - выполнение задания.
   @author Alexandr Bulanov
   @since –  04.02.2019
   @version – $ID$

   Задание.
   Напишите метод в классе ru.job4j.pojo.Shop.
   public Product[] delete(Product[] products, int index);
   Необходимо сместить все элементы на одну позицию влево, чтобы в массиве не было дырки.
   Для того, чтобы сместить все элементы влево на одну позицию нужно использовать цикл for + index.
   products[index] = products[index + 1];
   После цикла нужно поставить на последнее место в массиве null, чтобы последний и предпоследний элементы не дублировались
   products[products.lenght - 1] = null;
 */

public class Shop {
    public static Product[] delete(Product[] products, int index) {
       for (int i = index + 1; i < products.length; i++) {
            products[i - 1] = products[i];
        }
        return products;
    }

    public static void main(String[] args) {
        Product products[] = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Butter", 12);
        products[2] = new Product("Bread", 4);
        products[3] = new Product("Egg", 19);
        products[4] = null;

        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }

        System.out.println("\nDelete index 1\n");
        delete(products, 0);
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i].getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
