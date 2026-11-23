package com.lesson.oop.classes;

public class AnonymousClass {
    private static String BYE_STRING = "Auf Wiedersehen!"; // static constant

    public static void main(String[] args) {
        final String hello = "Guten Tag!"; // Final local Variable

        // anonymous class, a class that is declared and instantiated at the same time as an expression
        SpeakingEntity englishSpeakingPerson = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }

            @Override
            public void sayBye() {
                System.out.println("Bye!");
            }
        };

        // another anonymous class
        SpeakingEntity cat = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println("Meow!");
            }

            @Override
            public void sayBye() {
                System.out.println("Meowmi!");
            }
        };

        englishSpeakingPerson.sayHello();
        englishSpeakingPerson.sayBye();
        cat.sayHello();
        cat.sayBye();

        /*
        In the body of an anonymous class, it is possible to capture variables from a context where it is defined:
        - an anonymous class can capture members of its enclosing class (the outer class);
        - an anonymous class can capture local variables that are declared as final or are effectively final (i.e. the variable is not changed but it doesn't have the final keyword).
         */
        SpeakingEntity germanSpeakingPerson = new SpeakingEntity() {
            @Override
            public void sayHello() {
                System.out.println(hello); // it captures the local variable
            }

            @Override
            public void sayBye() {
                System.out.println(BYE_STRING); // it captures the constant field
            }
        };

        germanSpeakingPerson.sayHello();
        germanSpeakingPerson.sayBye();
    }
}

interface SpeakingEntity{
    void sayHello();
    void sayBye();
}

