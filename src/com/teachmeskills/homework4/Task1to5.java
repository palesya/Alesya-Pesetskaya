package com.teachmeskills.homework4;

import java.util.Random;
import java.util.Scanner;

public class Task1to5 {

    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int n = scanner.nextInt();
        int[][] generatedMatrix = generateMatrix(n);
        printGeneratedMatrix(generatedMatrix,n);

        int sumOfEvenDiagonalElements = sumMajorDiagonal(generatedMatrix);
        System.out.println("Сумма чётных элементов главной диагонали: " + sumOfEvenDiagonalElements);
        System.out.println("Нечетные элементы находящиеся под главной диагональю(включительно):");
        fintNotEvenElements(generatedMatrix);
        int multiMajorDiagonal = multiplyMajorDiagonal(generatedMatrix);
        int multiSideDiagonal = multiplySideDiagonal(generatedMatrix);
        System.out.println();
        if (multiMajorDiagonal > multiSideDiagonal) {
            System.out.println("Произведение элементов главной диагонали больше и равно: " + multiMajorDiagonal);
        } else if (multiMajorDiagonal < multiSideDiagonal) {
            System.out.println("Произведение элементов побочной диагонали больше и равно: " + multiSideDiagonal);
        } else {
            System.out.println("Произведение элементов обеих диагоналей равно: " + multiMajorDiagonal);
        }
        int sumOfEvenElements = sumEvenElements(generatedMatrix);
        if (sumOfEvenElements == -1) {
            System.out.println("Четных элементов над побочной диагональю нет.");
        } else {
            System.out.println("Cумма четных элементов стоящих над побочной диагональю (не включительно): " + sumOfEvenElements);
        }
        int[][] transposedMatrix = transposeMatrix(generatedMatrix);
        System.out.println("Транспонированная матрица: ");
        printGeneratedMatrix(transposedMatrix,n);

    }

    private static int[][] generateMatrix(int n) {
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(51);
            }
        }
        return array;
    }

    private static void printGeneratedMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int sumMajorDiagonal(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] % 2 == 0)
                sum += matrix[i][i];
        }
        return sum;
    }

    private static void fintNotEvenElements(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (matrix[i][j] % 2 != 0) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    private static int multiplyMajorDiagonal(int[][] matrix) {
        int multi = matrix[0][0];
        for (int i = 1; i < matrix.length; i++) {
            multi *= matrix[i][i];
        }
        return multi;
    }

    private static int multiplySideDiagonal(int[][] matrix) {
        int multi = matrix[matrix.length-1][0];
        for (int i = matrix.length-2; i >= 0; i--) {
            multi *= matrix[i][matrix.length-1 - i];
        }
        return multi;
    }

    private static int sumEvenElements(int[][] matrix) {
        int sum = 0;
        int sum1 = 0;
        int count = 0;
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    sum1 += matrix[i][j];
                    count++;
                }
            }
        }
        if (count > 0) {
            sum = sum1;
        }
        return sum;
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

}
