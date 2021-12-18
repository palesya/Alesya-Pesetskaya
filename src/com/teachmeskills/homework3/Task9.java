package com.teachmeskills.homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Task9 {
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите конец диапазона массива:");
        int b = scanner.nextInt();
        System.out.println("Введите количество чисел в массиве:");
        int count = scanner.nextInt();
        int sumOfFirstHalfArray;
        int sumOfSecondHalfArray;
        if (b <= 0 || count <= 0) {
            System.out.println("Диапазон не задан. Числа должны быть больше нуля.");
        }
        int[] generatedArray1 = generateArray(count, b);
        System.out.println("Полученный массив 1: " + Arrays.toString(generatedArray1));
        //если массив нечётный, то среднее число входит в первую половину массива
        int halfcount = count / 2;
        if (count % 2 == 0) {
            sumOfFirstHalfArray = sumHalfArray(generatedArray1, 0, halfcount);
            sumOfSecondHalfArray = sumHalfArray(generatedArray1, halfcount, count);
        } else {
            sumOfFirstHalfArray = sumHalfArray(generatedArray1, 0, halfcount + 1);
            sumOfSecondHalfArray = sumHalfArray(generatedArray1, halfcount + 1, count);
        }
        if (sumOfFirstHalfArray < sumOfSecondHalfArray) {
            System.out.println("Сумма второй половины массива больше и равна: " + sumOfSecondHalfArray);
        } else if (sumOfFirstHalfArray > sumOfSecondHalfArray) {
            System.out.println("Сумма первой половины массива больше и равна: " + sumOfFirstHalfArray);
        } else {
            System.out.println("Сумма обеих половин массива равна: " + sumOfFirstHalfArray);
        }
    }


    private static int[] generateArray(int count, int b) {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt(b + 1);
        }
        return array;
    }

    private static int sumHalfArray(int[] array, int a, int c) {
        int sum = 0;
        for (int i = a; i < c; i++) {
            sum += array[i];
        }
        return sum;
    }
}
