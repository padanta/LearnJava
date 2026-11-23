package com.lesson.oop.classes;

public class InnerClass {
    public static void main(String[] args) {
        Cat puteh = new Cat("Puteh");
        Cat.Bow bow = puteh.new Bow("Golden");
        Cat.Cloak cloak = new Cat.Cloak("Abstract");
        bow.printColor();
        bow.putOnABow();
        cloak.printAgeAndPattern();
    }
}


// inner class (non static nested class)
class Cat{
    private String name;
    private static int age = 5;


    Cat(String name){
        this.name = name;
    }

    private void sayMeow(){
        System.out.printf("%s says: Meow!\n", this.name);
    }

    class Bow{
        private String color;

        Bow(String color){
            this.color=color;
        }

        void putOnABow(){
            Cat.this.sayMeow();
            System.out.println("Bow is On!");
        }

        void printColor(){
            System.out.printf("Cat %s has a %s Bow\n",Cat.this.name, this.color);
        }
    }

    // static nested class
    static class Cloak{
        private String pattern;

        Cloak(String pattern){
            this.pattern = pattern;
        }

        // don't have reference to cat
//        void printPattern(){
//            System.out.printf("Cat %s has a %s Bow\n",Cat.this.name, this.pattern);
//        }


        // only have reference to static field
        void printAgeAndPattern(){
            System.out.printf("this cat age is %d y.o. and has %s pattern on its cloak!", Cat.age, this.pattern);
        }
    }
}

