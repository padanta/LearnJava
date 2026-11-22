package com.lesson.oop.classes;

public class InstanceMethod {
    public static void main(String[] args){
        class Human{
            static int workDuration = 24;
            int age;
            String name;

            // static method
            // static method can't reference instance variable
            /*
            a static method can access only static fields and cannot access non-static fields;
            a static method can invoke another static method, but it cannot invoke an instance method;
            a static method cannot refer to this keyword because there is no instance in the static context.
             */
            static void averageWorkHours(){
                System.out.println("An average human works 40 hours per week.");
                // age++; X
                // this.age++; X
            }

            // instance method
            // instance method can reference both instance variable and static variable
            void work(){
                System.out.println(this.name + " Loves to work for "+ workDuration + " Hours!");
            }

            void lovesToWorkWith(String other){
                System.out.println(this.name + " Loves to work with " + other);
            }
        }

        // static method doesn't require you to create an object
        Human.averageWorkHours();

        // instance method can only be invoked through an instance of class, thus
        // why you need to create an object first
        Human cindy = new Human();
        cindy.name = "Cindy";
        cindy.age = 25;

        Human danta = new Human();
        danta.name = "Danta";
        danta.age = 24;

        cindy.work();
        cindy.lovesToWorkWith(danta.name);
    }
}
