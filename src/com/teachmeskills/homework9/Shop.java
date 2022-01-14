package com.teachmeskills.homework9;

import java.util.LinkedList;

public class Shop {
    public LinkedList<Product> productList;

    public Shop(LinkedList<Product> productList) {
        this.productList = productList;
    }

    // метод, который добавляет товар. При попытке добавить товар с id уже существующем в списке,вставка не производится
    public void addProduct(Product product) {
        if (productList.toArray().length == 0) {
            productList.add(product);
            System.out.println(product.getName() + " was added to the list.");
        } else if (!productList.contains(product)) {
            productList.add(product);
            System.out.println(product.getName() + " was added to the list.");
        } else {
            System.out.println("You've tryed to add " + product.getName() + ",but product with such id " + product.getId() + " already exists");
        }
    }

    public void removeProductFromList(int id) {
        Product removableProduct = null;
        for (Product product : productList) {
            if (product.getId() == id) {
                removableProduct = product;
            }
        }
        if (removableProduct != null) {
            productList.remove(removableProduct);
            System.out.println(removableProduct.getName() + " was removed");
        }
    }

    public void changeProduct(Product product) {
        if (productList.toArray().length == 0) {
            System.out.println("No products in the list.");
        } else if (productList.contains(product)) {
            productList.add(product);
            System.out.println("Product with id=" + product.getId() + " was changed to name=" + product.getName() + " woth price=" + product.getPrice());
        } else {
            System.out.println("Product with such id=" + product.getId() + " doesn't exist in list.");
        }

    }
}




