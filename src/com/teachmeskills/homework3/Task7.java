package com.teachmeskills.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task7 {
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
            int maxIndex = defineIndexOfMaxElement(generatedArray, count);
            System.out.println("Индекс последнего вхождения максимального элемента " + generatedArray[maxIndex] + " в массив: " + maxIndex);
        }
    }


    private static int[] generateArray(int count, int b) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt(b + 1);
        }
        return array;
    }

    private static int defineIndexOfMaxElement(int[] array, int count) {
        int max = array[0];
        int maxIndex = -1;
        for (int i = 0; i < count; i++) {
            if (array[i] >= max) {
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
