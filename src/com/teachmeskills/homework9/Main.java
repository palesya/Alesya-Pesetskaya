package com.teachmeskills.homework9;

import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Product> productList = new TreeSet<>();
        Shop productShop = new Shop(productList);
        Product sourCream = new Product(1, "Sour cream", 2);
        Product bread = new Product(2, "Bread", 1);
        Product milk = new Product(3, "Milk", 2);
        Product cookies = new Product(4, "Cookies", 4);
        Product milk2 = new Product(3, "Milk2", 2);

        //добавляет продукт с уникальным индексом
        productShop.addProduct(milk);
        productShop.addProduct(cookies);
        productShop.addProduct(bread);
        productShop.addProduct(sourCream);

        //не добавляет продукт с повторяющимся индексом
        productShop.addProduct(milk2);

        System.out.println("List of all products added to the shop: "+Arrays.toString(productShop.allProductsInShop()));


        // удаляет продукт по id
        productShop.removeProductFromList(3);
        System.out.println("List of all products added to the shop: "+Arrays.toString(productShop.allProductsInShop()));

    }
}
