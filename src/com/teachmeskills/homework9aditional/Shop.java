package com.teachmeskills.homework9aditional;

import java.util.LinkedList;
import java.util.Scanner;

public class Shop {
    public LinkedList<Product> productList;

    public Shop(LinkedList<Product> productList) {
        this.productList = productList;
    }

    Scanner scanner = new Scanner(System.in);

    // метод, который добавляет товар. При попытке добавить товар с id уже существующем в списке,вставка не производится
    public void addProduct() {
        Product product = createProduct();
        if (productList.toArray().length == 0) {
            productList.add(product);
            System.out.println("Был добавлен в список товар:" + product.getName() + "\n");
        } else if (!productList.contains(product)) {
            productList.add(product);
            System.out.println("Был добавлен в список товар:" + product.getName() + "\n");
        } else {
            System.out.println("Вы пытались добавить " + product.getName() + ",но продукт с таким id " + product.getId() + " уже существует\n");
        }
    }

    public void removeProductFromList() {
        if (productList.toArray().length == 0) {
            System.out.println("В списке ещё нет продуктов.\n");
        } else {
            System.out.print("Введите id удаляемого продукта: ");
            int id = scanner.nextInt();
            Product removableProduct = null;
            for (Product product : productList) {
                if (product.getId() == id) {
                    removableProduct = product;
                }
            }
            if (removableProduct != null) {
                productList.remove(removableProduct);
                System.out.println("Был удалён следующий продукт: " + removableProduct.getName() + "\n");
            }
        }
    }

    public void changeProduct() {
        if (productList.toArray().length == 0) {
            System.out.println("В списке ещё нет продуктов.\n");
        } else {
            Product product = createProduct();
            if (productList.contains(product)) {
                productList.add(product);
                System.out.println("Продукт с id=" + product.getId() + " был изменён на продукт=" + product.getName() + " с ценой=" + product.getPrice());
            } else {
                System.out.println("Продукта с таким id=" + product.getId() + " нет в списке.");
            }

        }
    }

    public Product createProduct() {
        System.out.print("Введите id продукта: ");
        int id = scanner.nextInt();
        System.out.print("Введите название продукта: ");
        String name = scanner.next();
        System.out.print("Введите цену продукта: ");
        int price = scanner.nextInt();
        return new Product(id, name, price);
    }

}
