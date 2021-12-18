package com.teachmeskills.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task4 {
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

            int[] generatedArray = generateArray(count, b);
            System.out.println("Полученный массив: " + Arrays.toString(generatedArray));
            int[] generatedArrayWithNull = convertArrayWithNull(generatedArray,count);
            System.out.println("Массив в котором каждый элемент с нечётным индексом заменён на ноль : ");
            System.out.println(Arrays.toString(generatedArrayWithNull));

        }
    }

    private static int[] generateArray(int count, int b) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt(b+1);
        }
        return array;
    }

    private static int [] convertArrayWithNull(int[] array,int count) {
        for (int i=0;i < count; i++) {
            if (i % 2 == 1) {
                array[i] = 0;
            }
        }
        return array;
    }
}