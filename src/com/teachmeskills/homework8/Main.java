package com.teachmeskills.homework8;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//1) Вырезать подстроку из строки начиная с первого вхождения символа(a) до,
//        последнего вхождения сивола(i).
        String myString = "Happy holidays, my dear friends! Level up for nice deed";
        int start = myString.indexOf("a");
        int end = myString.lastIndexOf("i");
        char[] charsFromAToI = new char[end - start];
        myString.getChars(start, end, charsFromAToI, 0);
        System.out.println(charsFromAToI);

        //2) Заменить все вхождения символа стоящего в позиции (3) на сивол стоящий в
        //позиции 0

        char symbolOfIndex3 = myString.charAt(3);
        char symbolOfIndex0 = myString.charAt(0);
        System.out.println(myString.replace(symbolOfIndex3, symbolOfIndex0));

        //3)В исходной строке находятся слова, каждое слово на новой стороке. После
        //запуска программы вывести на экран слова, которые являются полиндромами.

        System.out.println("Palindromes found : " + TextFormaterUtils.findWordPalindrom(myString));
        String[] words = myString.split(" ");
        for (String word : words) {
            if (word.equalsIgnoreCase(new StringBuilder(word).reverse().toString())) {
                System.out.println(word);
            }
        }

        String longString = "Happy holidays,my dear friends!Level up? Nice:deed...Hello everyone.";
        System.out.println("Number of words in sentence: " + TextFormaterUtils.countWordsInLine(longString));

        //4)Есть строка. После запуска программы на экран выподятся только те предложения, в которых от 3-х до 5-ти слов. Если в
        //предложении присутствует слово-палиндром, то не имеет значения какое кол-во
        //слов в предложении, оно выводится на экран.

        String[] sentences = longString.split("[.?!\\...]");
        System.out.println("Sentences with number of words from 3 to 5 or word palindrome exists.");
        for (String sentence : sentences) {
            int wordsInLine = TextFormaterUtils.countWordsInLine(sentence);
            if (TextFormaterUtils.findWordPalindrom(sentence) || wordsInLine >= 3 && wordsInLine <= 5) {
                System.out.println(sentence.trim());
            }
        }
    }
}