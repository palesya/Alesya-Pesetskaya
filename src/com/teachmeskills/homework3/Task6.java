package com.teachmeskills.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    private static Random random = new Random();
    public static int count;
    public static int b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validValue = false;
        while (!validValue) {
            System.out.println("Введите конец диапазона массива:");
            b = scanner.nextInt();
            System.out.println("Введите количество чисел в массиве:");
            count = scanner.nextInt();
            if (b <= 0 || count <= 0) {
                System.out.println("Диапазон не задан. Числа должны быть больше нуля.");
            } else {
                validValue = true;
            }
        }
            int[] generatedArray = generateArray(count, b);
            System.out.println("Полученный массив: " + Arrays.toString(generatedArray));
            if (defineIncrease(generatedArray, count)) {
                System.out.println("Полученный массив строго возрастающий.");
            } else {
                System.out.println("Полученный массив не возрастающий.");
            }
        }

    private static int[] generateArray(int count, int b) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt(b+1);
        }
        return array;
    }

    private static boolean defineIncrease(int[] array, int count) {
        boolean increased = true;
        for (int i = 1; i < count; i++) {
            if (array[i - 1] >= array[i]) {
                increased = false;
                break;
            }
        }
        return increased;
    }
}

