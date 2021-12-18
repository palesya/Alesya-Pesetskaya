package com.teachmeskills.homework3;

import java.util.Scanner;


public class Task1 {
    public static int a;
    public static int b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validValue = false;
        while (!validValue) {
            System.out.println("Введите начало диапазона массива:");
            a = scanner.nextInt();
            System.out.println("Введите конец диапазона массива:");
            b = scanner.nextInt();
            if (a <= 0) {
                System.out.println("Диапазон не задан. Числа должны быть больше нуля.");
                continue;
            }
            if (b < a) {
                System.out.println("Диапазон не задан. Второе число должно быть больше первого.");
            } else
                validValue = true;
        }
        int count = countEven(a, b);
        System.out.println("Количество чётных элементов в массиве: " + count);
        int[] generatedArray = createEvenArray(count, a);
        // вывод элементов массива в строку, отделяя пробелами:
        System.out.println("Полученный массив в строку: ");
        for (int i : generatedArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-----------------");
        // вывод элементов массива в столбик:
        System.out.println("Полученный массив в столбик: ");
        for (int i : generatedArray) {
            System.out.println(i);
        }
    }

    private static int[] createEvenArray(int count, int a) {
        int[] array = new int[count];
        for (int i = 0, j = a; i < count; i++, j += 2) {
            if (j % 2 == 0 && j != 0) {
                array[i] = j;
            } else if (j % 2 == 1) {
                array[i] = j + 1;
            }
        }
        return array;
    }

    private static int countEven(int a, int b) {
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }
}
