package com.teachmeskills.homework9aditional;

import java.util.*;

public class ShopMenu {
    private Scanner scanner;

    public ShopMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    LinkedList<Product> productList = new LinkedList<>();
    Shop userShop = new Shop(productList);

    private void printShopMenu() {
        System.out.println("Меню магазина:");
        System.out.println("1. Вывод всех товаров;");
        System.out.println("2. Добавление товара;");
        System.out.println("3. Удаление товара;");
        System.out.println("4. Редактирование товара;");
        System.out.println("5. Выход;");
    }

    private void printSortingMenu() {
        System.out.println("Варианты сортировки:");
        System.out.println("1. По цене(возрастанию);");
        System.out.println("2. По цене(убыванию);");
        System.out.println("3. По добавлению(сначала новые, потом более старые)");
    }

    public void start() {
        if (this.scanner != null) {
            int keyShopMenu = 0;
            int keySortingMenu;
            do {
                printShopMenu();
                System.out.print("Введите номер из меню магазина от 1 до 5: ");
                keyShopMenu = this.scanner.nextInt();
                switch (keyShopMenu) {
                    case 1:
                        if (productList.toArray().length == 0) {
                            System.out.println("В списке ещё нет продуктов.");
                            break;
                        } else {
                            printSortingMenu();
                            System.out.print("Введите номер из меню сортировки от 1 до 3: ");
                            keySortingMenu = this.scanner.nextInt();
                            switch (keySortingMenu) {
                                case 1:
                                    TreeSet<Product> sortedSet = new TreeSet<>(new SortedByPrice());
                                    sortedSet.addAll(productList);
                                    System.out.println("Продукты отсортированные по цене в порядке возрастания: " + sortedSet);
                                    break;
                                case 2:
                                    TreeSet<Product> sortedSetDesc = new TreeSet<>(new SortedByPrice().reversed());
                                    sortedSetDesc.addAll(productList);
                                    System.out.println("Продукты отсортированные по цене в порядке убывания: " + sortedSetDesc);
                                    break;
                                case 3:
                                    Iterator<Product> productIterator = productList.descendingIterator();
                                    System.out.println("Товары в магазине в порядке добавления(сначала новые, потом более старые):");
                                    while (productIterator.hasNext()) {
                                        System.out.println(productIterator.next());
                                    }
                                    break;
                                default:
                                    System.out.println("Вы ввели неверное значение.\n");
                            }
                        }
                        break;
                    case 2:
                        userShop.addProduct();
                        break;
                    case 3:
                        userShop.removeProductFromList();
                        break;
                    case 4:
                        userShop.changeProduct();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение.\n");
                }
            }
            while (keyShopMenu != 5);
        }
    }
}
