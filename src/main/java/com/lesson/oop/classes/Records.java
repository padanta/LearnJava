package com.lesson.oop.classes;

import java.util.Objects;

public class Records {
    public static void main(String[] args) {
        // records pattern in java 21
        Object obj = new User("Danta", null);

        if(obj instanceof User(String username, String password)){
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        }
    }
    static void printUser(Object obj){
        switch (obj){
            case User(String username, String password) -> System.out.println("Username: " + username);
            default -> System.out.println("not a user");
        }
    }
}


// records are implicitly final
// records cannot: be abstract, extend classes, declare instance fields, and extended by classes.
// records can: be declared inside a class, implement interfaces, be generic, be compatible with annotations, have static components,
// have constructors, have instance methods.
record Name(String first, String last) {}

record User(String username, String password) {
    // body

    // can also make custom constructor (compact constructor)
    User {
        if (username == null || password == null) {
            throw new IllegalArgumentException("Username or Password must not be null!");
        }
    }

    // custom getter
    @Override
    public String username(){
        return username.toUpperCase();
    }

    // setter are not automatically generated in records

}

// class equivalent
class UserClassEquivalent {
    private String username;
    private String password;

    UserClassEquivalent(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        var that = (UserClassEquivalent) obj;
        return Objects.equals(this.username, that.username) &&
                Objects.equals(this.password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }

    @Override
    public String toString() {
        return "User[" +
                "username=" + username + ", " +
                "password=" + password + ']';
    }
}
