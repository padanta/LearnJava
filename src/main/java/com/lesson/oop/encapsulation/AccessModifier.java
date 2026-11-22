package com.lesson.oop.encapsulation;
import com.lesson.oop.encapsulation.publicmodifier.PublicAccessModifier;

// top level class can't be private, its either package-private or public
public class AccessModifier {
     /*
        The common way of using top-level class modifiers is:
        make the classes containing methods for users (the “buttons”) public;
        make all other classes with low-level logic methods used by public ones package-private (cover the engine with the body).
     */
    public static void main (String[] args){
        // package-private(default)
        // available for all classes in the same package (folder)

        // public
        // available outside its class / package
        PublicAccessModifier.helloWorld();

        // private
        // can only be used inside its own top class

        // protected
        // available for classes in the same package and for subclasses (will be covered later);
    }
}
