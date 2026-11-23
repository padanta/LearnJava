package com.lesson.oop.abstraction;

public class AbtractClassWithInterface {
    public static void main(String[] args) {
        /*
        an abstract class can have abstract and non-abstract instance methods while an interface can have abstract or default instance methods;
        an abstract class can extend another abstract or regular class and an interface can only extend another interface;
        an abstract class can extend only one class while an interface can extend any number of interfaces;
        an abstract class can have final, non-final, static, non-static variables (regular fields) while an interface can only have static final variables;
        an abstract class can provide an implementation of an interface but an interface cannot provide an implementation of an abstract class;
        an abstract class can have a constructor and an interface cannot;
        an abstract class can implement multiple interface;
        in an abstract class, the keyword abstract is mandatory to declare a method as an abstract one while in an interface this keyword is optional.
         */

        interface ManagedDevice{
            void on();
            void off();
        }

        abstract class AbstractDevice implements ManagedDevice{
            private String serialNumber;
            private boolean on;

            AbstractDevice(String serialNumber){
                this.serialNumber = serialNumber;
            }

            void setOn(boolean on){
                this.on = on;
            }
        }

        class Kettle extends AbstractDevice{
            private double volume;

            Kettle(String serialNumber, double volume){
                super(serialNumber);
                this.volume = volume;
            }

            @Override
            public void on(){
                // complex logic to turn on all electronic components
                setOn(true);
            }

            @Override
            public void off(){
                // complex logic to turn off all electronic components
                setOn(false);
            }
        }
    }
}
