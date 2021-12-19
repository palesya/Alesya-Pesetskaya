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
        for (int i = 0; i < 9; i++) {
            generateMatrixWith(generatedMatrix, gamer);
            printGeneratedMatrix(generatedMatrix);
            if (findIfWin(generatedMatrix)) {
                break;
            }
            gamer = changeGamer(gamer);
        }
        if (!findIfWin(generatedMatrix)) {
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
        boolean ifWin;
        String[] line1 = new String[3];
        String[] line2 = new String[3];
        String[] line3 = new String[3];
        String[] column1 = new String[3];
        String[] column2 = new String[3];
        String[] column3 = new String[3];
        String[] mainDiagonal = new String[3];
        String[] SideDiagonal = new String[3];
        String[] WinX = {"X", "X", "X"};
        String[] Win0 = {"0", "0", "0"};
        for (int i = 0; i < 3; i++) {
            line1[i] = array[0][i];
            line2[i] = array[1][i];
            line3[i] = array[2][i];
            column1[i] = array[i][0];
            column2[i] = array[i][1];
            column3[i] = array[i][2];
            SideDiagonal[i] = array[2 - i][i];
            mainDiagonal[i] = array[i][i];
        }
        ifWin = Arrays.equals(line1, WinX) | Arrays.equals(line1, Win0) |
                Arrays.equals(line2, WinX) | Arrays.equals(line2, Win0) |
                Arrays.equals(line3, WinX) | Arrays.equals(line3, Win0) |
                Arrays.equals(column1, WinX) | Arrays.equals(column1, Win0) |
                Arrays.equals(column2, WinX) | Arrays.equals(column2, Win0) |
                Arrays.equals(column3, WinX) | Arrays.equals(column3, Win0) |
                Arrays.equals(mainDiagonal, WinX) | Arrays.equals(mainDiagonal, Win0) |
                Arrays.equals(SideDiagonal, WinX) | Arrays.equals(SideDiagonal, Win0);
        if (ifWin) {
            System.out.println("Игра окончена. Есть победитель!");
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

