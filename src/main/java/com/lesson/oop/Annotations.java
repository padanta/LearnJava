package com.lesson.oop;

class randomClass {
    @Override
    public String toString() {
        return "Overriding toString Method!";
    }
}

public class Annotations {
    public static void main(String[] args) {

        randomClass d = new randomClass();
        System.out.println(d.toString());


        class Animal {
            private String name;

            public Animal(String name) {
                this.name = name;
            }

            void sound() {
                System.out.println("Default Animal Sound");
            }

            // cant be overridden
            final void sayHello(){
                System.out.println("hello");
            }

            @SuppressWarnings("unused")
            void someUselessMethod() {
                System.out.println("damn!");
            }

            // annotation element
            // @SuppressWarnings(value = "unused")
            @SuppressWarnings({"unused", "deprecation"})
            void anotherUselessMethod() {
                System.out.println("damn!!!");
            }
        }

        class Cat extends Animal {
            Cat(String name) {
                super(name);
            }

            // Override
            // Static methods cannot be overridden.
            @Override
            void sound() {
                System.out.println("Meow!");
            }

            // @Override doesnt override the method, its overload sound unique to the subclass
            void sound(String s){
                System.out.printf("Meow!%s",s);
            }

            @Deprecated
            void meowing() {
                System.out.println("Meowing!");
            }

            // annotation element
            @Deprecated(since = "1", forRemoval = true)
            void dep() {
                System.out.println("nope");
            }

        }

        Animal cat = new Cat("putih");
        cat.sound();

        Cat cat1 = new Cat("oci");
        cat1.meowing();
        cat1.sound("halo");



        // another example

    }
}
