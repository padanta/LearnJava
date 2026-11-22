package com.lesson.string;

public class FormattedOutput {
    static void main(String[] args) {
        //System.out.printf("My name is %s. I was born in %d", "Danta", 2002);
        //System.out.printf("The sum of %d and %d is %d", 25, 30, 55);
        //System.out.printf("Display a floating number: %.2f", 15.23);

        //char abbr = 'H';
        //String element = "Hydrogen";
        //System.out.printf("%c stands for %s", abbr, element);

        //========

        // String.format()
//        char initial = 'M';
//        String surname = "Padanta";
//        int age = 24;
//        float height = 5.51181F;
//
//        String str = String.format("My name is %c. %s.%nMy age is %d.%nMy height is %.2f.", initial, surname, age, height);
//        System.out.println(str);

        // str.formatted()
        char initial = 'M';
        String surname = "Padanta";
        int age = 24;
        float height = 5.51181F;
        double d = 2.2;

        String str = "My name is %c. %s.%nMy age is %d.%nMy height is %.2f.".formatted(initial, surname, age, height);
        System.out.println(str);
        System.out.println("danta");

        /*
        %d = int, short, byte, long
        %c = char
        %f = float, double
        %s = String
        */

        // future notes: instance and static methods
    }
}
