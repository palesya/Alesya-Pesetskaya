package com.teachmeskills.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task8 {
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

            if (defineZeroInArray(generatedArray2, count)) {
                System.out.println("Во втором массиве есть нули. Третий массив не сгенерируется");
            } else {
                double[] generatedArray3 = generateArrayFromArrays(generatedArray1, generatedArray2, count);
                System.out.println("Полученный массив 3: " + Arrays.toString(generatedArray3));
                System.out.println("Число целых чисел в 3 массиве: " + countWholeNumbers(generatedArray3, count));
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

    private static boolean defineZeroInArray(int[] array, int count) {
        boolean zeroInArray = false;
        for (int i = 1; i < count; i++) {
            if (array[i] == 0) {
                zeroInArray = true;
                break;
            }
        }
        return zeroInArray;
    }

    private static double[] generateArrayFromArrays(int[] array1, int[] array2, int count) {
        double[] array = new double[count];
        for (int i = 0; i < count; i++) {
            array[i] = (double) array1[i] / array2[i];
        }
        return array;
    }

    private static int countWholeNumbers(double[] array, int count) {
        int num = 0;
        for (int i = 0; i < count; i++) {
            if (array[i] % 1 == 0) {
                num++;
            }
        }
        return num;
    }
}
