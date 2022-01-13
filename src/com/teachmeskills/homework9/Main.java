package com.teachmeskills.homework9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<Product> productList = new LinkedList<>();
        Shop productShop = new Shop(productList);
        Product sourCream = new Product(8, "Sour cream", 2);
        Product butter = new Product(3, "Butter", 3);
        Product bread = new Product(2, "Bread", 1);
        Product milk = new Product(6, "Milk", 2);
        Product cookies = new Product(4, "Cookies", 4);
        Product milk2 = new Product(3, "Milk2", 2);

        //добавляет продукт с уникальным индексом
        productShop.addProduct(milk);
        productShop.addProduct(cookies);
        productShop.addProduct(bread);
        productShop.addProduct(sourCream);
        productShop.addProduct(butter);

        //не добавляет продукт с повторяющимся индексом
        productShop.addProduct(milk2);


        //выводим весь список добавленных продуктов
        System.out.println("List of all products added to the shop: " + productList);

        //выводим отсортированный по цене список добавленных продуктов
        TreeSet<Product> sortedSet=new TreeSet<>(new SortedByPrice());
        sortedSet.addAll(productList);
        System.out.println("Sorted by price list of products: " + sortedSet);

        System.out.println("");
        // удаляет продукт по id
        productShop.removeProductFromList(3);

        System.out.println("");
        //список товаров, отсортированный по порядку добавления(последние добавленные в начале)
        Iterator<Product> productIterator = productList.descendingIterator();
        System.out.println("Sorted by adding to the list in descending order: ");
        while (productIterator.hasNext()) {
            System.out.println(productIterator.next());
        }

        System.out.println("");
        // редактируем один товар
        Product sausages = new Product(4, "Sausages", 6);
        productShop.changeProduct(sausages);


        System.out.println("");
        //итоговый список товаров
        Iterator<Product> productIterator1 = productList.iterator();
        System.out.println("Resulted list of products: ");
        while (productIterator1.hasNext()) {
            System.out.println(productIterator1.next());
        }

    }
}

//• получаем список товаров и выводим в консоль