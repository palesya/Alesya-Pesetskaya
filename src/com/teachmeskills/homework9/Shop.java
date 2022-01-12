package com.teachmeskills.homework9;

import java.util.Objects;
import java.util.TreeSet;

public class Shop {
    public TreeSet<Product> productList;

    public Shop(TreeSet<Product> productList) {
        this.productList = productList;
    }


    // метод, который добавляет товар. При попытке добавить товар с id уже существующем в списке,вставка не производится
    public void addProduct(Product product) {
        if (!productList.contains(product)) {
            productList.add(product);
            System.out.println(product.name + " was added to the list.");
        } else {
            System.out.println("You've tryed to add " + product.name + ",but product with such id " + product.id + " already exists");
        }
    }

    //метод, который возвращает список всех продуктов в магазине
    public Object[] allProductsInShop() {
        return productList.toArray();
    }


    public void removeProductFromList(int id) {
        Product removableProduct = null;
        for (Product product : productList) {
            if (product.id == id) {
                removableProduct = product;
            }
        }
        if (removableProduct != null) {
            productList.remove(removableProduct);
            System.out.println(removableProduct.name+ " was removed");
        }
    }
}




