package com.teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String[][] generatedMatrix = generateMatrix();
        //пустой
        printGeneratedMatrix(generatedMatrix);
        //1-ый ход
        String gamer = "X";
        boolean ifWin = false;
        for (int i = 0; i < 9; i++) {
            generateMatrixWith(generatedMatrix, gamer);
            printGeneratedMatrix(generatedMatrix);
            if (findIfWin(generatedMatrix)) {
                System.out.println("Это игрок " + gamer+".");
                ifWin = true;
                break;
            }
            gamer = changeGamer(gamer);
        }
        if (!ifWin) {
            System.out.println("Игра окончена с результатом ничья");
        }
    }


    private static String[][] generateMatrix() {
        String[][] matrix = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = "_";
            }
        }
        return matrix;
    }

    private static void printGeneratedMatrix(String[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //проверить ячейку на пустоту и сделать ход для X
    private static void generateMatrixWith(String[][] matrix, String gamer) {
        boolean moveDone = false;
        while (!moveDone) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите номер заполняемой ячейки по горизонтали (от 1 до 3): ");
            int x = scanner.nextInt();
            System.out.println("Введите номер заполняемой ячейки по вертикали (от 1 до 3): ");
            int y = scanner.nextInt();
            if (x < 1 || y < 1 || x > 3 || y > 3) {
                System.out.println("Неверное число. Номер ячейки должен быть от 1 до 3!");

            } else {
                if (matrix[x - 1][y - 1] == "_") {
                    matrix[x - 1][y - 1] = gamer;
                    moveDone = true;
                } else {
                    System.out.println("Данная ячейка занята. Сделайте другой ход.");
                }
            }
        }
    }

    //Проверить наличие победы
    private static boolean findIfWin(String[][] array) {
        boolean ifWin = false;
        String[] mainDiagonal = new String[3];
        String[] SideDiagonal = new String[3];
        String[] column1 = new String[3];
        String[] column2 = new String[3];
        String[] column3 = new String[3];
        String[] WinX = {"X", "X", "X"};
        String[] Win0 = {"0", "0", "0"};
        for (int i = 0; i < 3; i++) {
            SideDiagonal[i] = array[2 - i][i];
            mainDiagonal[i] = array[i][i];
            column1[i] = array[i][0];
            column2[i] = array[i][1];
            column3[i] = array[i][2];
            if (Arrays.equals(mainDiagonal, WinX) | Arrays.equals(mainDiagonal, Win0) |
                    Arrays.equals(SideDiagonal, WinX) | Arrays.equals(SideDiagonal, Win0) |
                    Arrays.equals(column1, WinX) | Arrays.equals(column1, Win0) |
                    Arrays.equals(column2, WinX) | Arrays.equals(column2, Win0) |
                    Arrays.equals(column3, WinX) | Arrays.equals(column3, Win0)) {
                ifWin = true;
                break;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (Arrays.equals(array[i], WinX) | Arrays.equals(array[i], Win0)) {
                ifWin = true;
                break;
            }
        }
        if (ifWin) {
            System.out.print("Игра окончена. Есть победитель! ");
        }
        return ifWin;
    }

    private static String changeGamer(String gamer) {
        if (gamer == "X") {
            gamer = "0";
        } else {
            gamer = "X";
        }
        return gamer;
    }
}

