package com.lesson.oop.polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        OverridingExample1 something = new OverridingExample2(1);
        something.someMethod();
    }
}

class OverridingExample1{
    private int x;

    OverridingExample1(int x){
        this.x = x;
    }

    void someMethod(){
        System.out.println("OverridingExample1: Method");
    }
}

class OverridingExample2 extends OverridingExample1{
    OverridingExample2(int x) {
        super(x);
    }

    @Override
    void someMethod(){
        System.out.println("OverridingExample2: Method");
    }

    void someAnotherMethod(){
        System.out.println("OverridingExample2: My own Method");
    }
}