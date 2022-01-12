package com.teachmeskills.homework9;

import java.util.Comparator;
import java.util.TreeSet;

public class Shop {
    public TreeSet<Product> productList;

    public Shop(TreeSet<Product> productList) {
        this.productList = productList;
    }


    // метод, который добавляет товар. При попытке добавить товар с id уже существующем в списке,вставка не производится
    public void addProduct(Product product) {
        if (productList.toArray().length==0){
            productList.add(product);
            System.out.println(product.getName() + " was added to the list.");
        }else if(!productList.contains(product)) {
            productList.add(product);
            System.out.println(product.getName() + " was added to the list.");
        } else {
            System.out.println("You've tryed to add " + product.getName() + ",but product with such id " + product.getName() + " already exists");
        }
    }

    //метод, который возвращает список всех продуктов в магазине
    public Object[] allProductsInShop() {
        return productList.toArray();
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
}




