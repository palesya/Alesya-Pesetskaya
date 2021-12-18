package com.teachmeskills.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task3 {
    private static Random random = new Random();

    public static void main(String[] args) {
        int count=0;
        int b=0;
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
        System.out.println("Число чётных чисел в массиве: ");
        System.out.println(countEven(generatedArray));
    }

    private static int[] generateArray(int count, int b) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt(b + 1);
        }
        return array;
    }

    //ноль чётное
    private static int countEven(int[] array) {
        int even = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                even += 1;
            }
        }
        return even;
    }
}
