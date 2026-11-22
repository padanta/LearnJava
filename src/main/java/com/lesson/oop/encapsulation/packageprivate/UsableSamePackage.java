package com.lesson.oop.encapsulation.packageprivate;

public class UsableSamePackage {
    public static void main(String[] args){
        PackagePrivate.helloWorld(); // able to use Package private, because its on the same package!
    }
}
