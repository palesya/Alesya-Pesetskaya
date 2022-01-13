package com.teachmeskills.homework9;

import java.util.Comparator;

public class SortedByPrice implements Comparator<Product>
{
    public int compare(Product product1, Product product2)
    {
        int price1 = product1.getPrice();
        int price2 = product2.getPrice();

        if (price1 > price2) {
            return 1;
        } else if (price1 < price2) {
            return -1;
        } else {
            return product1.getId() - product2.getId();
        }
    }
}
