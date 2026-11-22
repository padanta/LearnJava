package com.lesson.oop.classes;

public class ClassesAndObject {
    public static void main(String[] args) {
        class Laptop {
            String model;
            String os;
            double displaySize;
            int ram;
        }

        Laptop macbook = new Laptop();
        macbook.model = "Macbook Air M1 2020";
        macbook.os = "macOs";
        macbook.displaySize = 13.0;
        macbook.ram = 8;


        Laptop lenovo = new Laptop();
        lenovo.model = "Lenovo Legion 5 Pro 2023";
        lenovo.os = "windows";
        lenovo.ram = 32;
        lenovo.displaySize = 16.1;

        System.out.printf("Object 1: %s\nDisplay size: %.1f\nTotal Ram: %d\nOperating system: %s\n\n", macbook.model, macbook.displaySize, macbook.ram, macbook.os);
        System.out.printf("Object 1: %s\nDisplay size: %.1f\nTotal Ram: %d\nOperating system: %s\n", lenovo.model, lenovo.displaySize, lenovo.ram, lenovo.os);
    }
}
