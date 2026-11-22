package com.lesson.oop.polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        print((short) 100);
    }

    // java will default to int implicit casting if not explicitly casted
    private static void print(int x) {
        System.out.println("Int result: " + x);
    }

    private static void print(long x) {
        System.out.println("Long result: " + x);
    }

    private static void print(double x) {
        System.out.println("Double result: " + x);
    }

    private static void print(float x) {
        System.out.println("Float result:" + x);
    }

    private static void print(short x) {
        System.out.println("Short result: " + x);
    }
}
