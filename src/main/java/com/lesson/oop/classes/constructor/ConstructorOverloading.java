package com.lesson.oop.classes.constructor;

public class ConstructorOverloading {
    public static void main(String[] args) {
        class Robot {
            String name;
            String model;
            int lifetime;

            public Robot(){
                this.name = "Unknown";
                this.model = "Unidentified";
            }

            public Robot(String name, String model){
                this(name, model, 20);
            }

            public Robot(String name, String model, int lifetime){
                this.name = name;
                this.model = model;
                this.lifetime = lifetime;
                System.out.println("third constructor is called!");
            }
        }

        Robot robo = new Robot("robo", "cop", 50);
        System.out.println(robo);
    }
}
