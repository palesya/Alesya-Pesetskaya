package com.teachmeskills.homework8;

import java.util.Arrays;

public class TextFormaterUtils {
//1. Метод принимает строку и возвращает кол-во слов в строке.
    public static int countWordsInLine(String string) {
        int count = 0;
        String[] space = {" ",".","!",":","...",",","?","-"};
        String[] words = string.split(Arrays.toString(space));
        for (String word : words) {
            if (word.trim().length() > 0) {
                count++;
            }
        }
        return count;
    }
//2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//    есть возвращает true, если нет false*/
    public static boolean findWordPalindrom(String string) {
        String[] words = string.split(" ");
        for (String word : words) {
            if (word.equalsIgnoreCase(new StringBuilder(word).reverse().toString())) {
                return true;
            }
        }
        return false;
    }
}
