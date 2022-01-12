package com.teachmeskills.homework9;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Product implements Comparable<Product> {
    public int id;
    public String name;
    public int price;

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(@NotNull Product p) {
        if (id == p.id)
            return 0;
        else return -1;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

}


