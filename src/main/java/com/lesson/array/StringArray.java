package com.lesson.array;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        char[] chars = {'d', 'a', 'n', 't', 'a'};

        String stringFromChars = String.valueOf(chars);
        System.out.println(stringFromChars);

        char[] charFromString = stringFromChars.toCharArray();
        System.out.println(Arrays.toString(charFromString));

        String sameCharArray = new String(charFromString);
        System.out.println(sameCharArray);

        String text = "Danta Tarigan";
        String[] splittedText = text.split("");
        System.out.println(Arrays.toString(splittedText));

        // iteraring over a string
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }

        //
        String str1 = "aaabbcccdaa";
        String str2 = " ";

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (ch != str2.charAt(str2.length() - 1)) {
                str2 += ch;
            }
        }
    }
}
