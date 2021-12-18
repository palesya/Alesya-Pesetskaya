package com.teachmeskills.homework3;

import java.util.Arrays;
import java.util.Scanner;


public class Task2 {
    public static int count;
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

        int count = countNotEven(a, b);
        System.out.println("Количество нечётных элементов в массиве: " + count);
        int[] generatedArray = createNotEvenArray(count, a);
        // вывод элементов массива в строку:
        System.out.println("Полученный массив в строку: " + Arrays.toString(generatedArray));
        // вывод элементов массива в строку в обратном порядке:
        System.out.print("Полученный массив в строку в обратном порядке:");
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(generatedArray[i] + ", ");
        }
    }

    private static int[] createNotEvenArray(int count, int a) {
        int[] array = new int[count];
        for (int i = 0, j = a; i < count; i++, j += 2) {
            if (j % 2 == 1) {
                array[i] = j;
            } else if (j % 2 == 0 && j != 0) {
                array[i] = j + 1;
            }
        }
        return array;
    }

    private static int countNotEven(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 1) {
                count += 1;
            }
        }
        return count;
    }
}
