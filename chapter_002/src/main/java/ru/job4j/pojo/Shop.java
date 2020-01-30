package ru.job4j.pojo;
/**
   Удаление моделей из массива - выполнение задания.
   @author Alexandr Bulanov;
   @since –  29.01.2019;
   @version – $ID$

   Задание.
   Напишите метод в классе ru.job4j.pojo.Shop.
   public Product[] delete(Product[] products, int index);
   Необходимо сместить все элементы на одну позицию влево, чтобы в массиве не было дырки.
   Для того, чтобы сместить все элементы влево на одну позицию нужно использовать цикл for + index.
   products[index] = products[index + 1];
   После цикла нужно поставить на последнее место в массиве null, чтобы последний и предпоследний элементы не дублировались
   products[products.lenght - 1] = null;
   Добавьте демонстрацию работы примера в метод main.
 */
public class Shop {
    Product[] delete(Product[] products, int index) {
        System.out.println();
        System.out.println("Удаляем значение из ячейки с индексом " + index);
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            Product product = products[i + 1];
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                products[i] = products[i + 1];
            } else {
                System.out.println("null");
            }
        }
        System.out.println("Массив после удаления:");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        return products;
    }
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        for (Product product : products) {
            //проверяем, что объект не равен null. тк у нас массив не заполнен целиком.
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}
