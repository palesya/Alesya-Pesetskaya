package com.teachmeskills.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task5 {
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите конец диапазона массива:");
        int b = scanner.nextInt();
        System.out.println("Введите количество чисел в массиве:");
        int count = scanner.nextInt();
        if (b <= 0 || count <= 0) {
            System.out.println("Диапазон не задан. Числа должны быть больше нуля.");
        } else {

            int[] generatedArray1 = generateArray(count, b);
            int[] generatedArray2 = generateArray(count, b);
            System.out.println("Полученный массив 1: " + Arrays.toString(generatedArray1));
            System.out.println("Полученный массив 2: " + Arrays.toString(generatedArray2));
            double averageSumOfArray1 = countAverageSum(generatedArray1, count);
            double averageSumOfArray2 = countAverageSum(generatedArray2, count);
            if (averageSumOfArray1 > averageSumOfArray2) {
                System.out.println("Среднее арифметическое элементов первого массива больше и равно: " + averageSumOfArray1);
            } else if (averageSumOfArray1 == averageSumOfArray2) {
                System.out.println("Среднее арифметическое элементов обоих массивов равно: " + averageSumOfArray1);
            } else {
                System.out.println("Среднее арифметическое элементов второго массива больше и равно: " + averageSumOfArray2);
            }
        }
    }

    private static int[] generateArray(int count, int b) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt(b+1);
        }
        return array;
    }

    private static double countAverageSum(int[] array, int count) {
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += array[i];
        }
        return sum / count;
    }
}

