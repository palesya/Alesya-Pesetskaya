package com.teachmeskills.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task10 {
    private static Random random = new Random();
    public static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validValue = false;
        while (!validValue) {
            System.out.println("Введите число больше 3: ");
            n = scanner.nextInt();
            if (n <= 3) {
                System.out.println("Число должно быть больше 3.");
            } else {
                validValue = true;
            }
        }
        int[] generatedArray = generateArray(n);
        System.out.println("Полученный массив: " + Arrays.toString(generatedArray));
        int count = countEven(generatedArray, n);
        if (count <= 0) {
            System.out.println("Нет чётных элементов в исходном массиве. Второй массив не сгенерируется");
        } else {
            int[] generatedEvenArray = generateEvenArray(generatedArray, n, count);
            System.out.println("Полученный массив из чётных чисел: " + Arrays.toString(generatedEvenArray));
        }
    }

    private static int[] generateArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
        }
        return array;
    }

    //ноль относим к чётному числу
    private static int countEven(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                count += 1;
            }
        }
        return count;
    }

    private static int[] generateEvenArray(int[] array1, int n, int count) {
        int[] array = new int[count];
        int j = 0;
        for (int i = 0; i < n; i++)
            if (array1[i] % 2 == 0) {
                array[j] = array1[i];
                j++;
            }
        return array;
    }
}
