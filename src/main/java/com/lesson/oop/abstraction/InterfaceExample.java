package com.lesson.oop.abstraction;

public class InterfaceExample {
    public static void main(String[] args) {
        ContohInterface instance = new ContohClassPakaiInterface();
        instance.instanceMethod1();
        instance.instanceMethod2();
        instance.defaultMethod();
    }
}

// declaring interfaces
interface ContohInterface {
    // An interface can contain:
    // A class can implement multiple interfaces.

    int INT_CONSTANT = 0;

    // If the modifiers are not specified once the method is declared, its parameters will be public abstract by default.

    // An interface can't contain constructors, non-public abstract methods, or any fields other than public static final (constants).
    void instanceMethod1();
    void instanceMethod2();

    static void staticMethod(){
        System.out.println("ContohInterface: Static Method");
    }

    default void defaultMethod(){
        System.out.println("ContohInterface: Default Method");
    }

    private void privateMethod(){
        System.out.println("ContohInterface: private Method");
    }
}

// implementing interface
class ContohClassPakaiInterface implements ContohInterface{
    @Override
    public void instanceMethod1(){
        System.out.println("Instance: instanceMethod1");
    }

    public void instanceMethod2(){
        System.out.println("Instance: instanceMethod2");
    }
}