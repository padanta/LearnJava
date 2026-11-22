package com.lesson.fundamental;

public class MethodExample {
    public static void main(String[] args) {
        int myParrotWeight = 100;
        int myParrotAge = 3;

        int myParrotPortion = countSeeds(myParrotWeight, myParrotAge);
        addPortion(myParrotPortion); // a copy is created, thus the original portion is not affected
        printSeedCount(myParrotPortion);
    }

    // modifiers(public static) return_type(int) method_name(multiply) list_of_parameter(int x, int y)
    public static int countSeeds(int parrotWeight, int parrotAge) {
        return parrotWeight / 5 + parrotAge;
    }

    // method not to return a value but to perform operations only, the keyword void is used as a return type
    public static void printSeedCount(int seeds) {
        System.out.println("Give your parrot " + seeds + "g of seeds per day");
    }

    public static void addPortion(int portion) {
        portion += 50;
        System.out.println("The Increased portion is " + portion);
    }
}
