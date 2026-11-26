package com.lesson.fundamental.exceptionhandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {

    // exception hierachy:
    // Throwable -> Error
    //           -> Exception -> RuntimeException -> Unchecked Exception
    //                        -> Checked Exception (FileNotFoundException, IOException, IllegalAccessException)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = scanner.nextInt();
        int b = scanner.nextInt();

//        System.out.println(a / b); // an exception is possible here if b = 0
//        System.out.println("finished");

        if (b == 0){
            System.out.println("Division by zero!"); // prevent exception or "broken" line
        } else{
            System.out.println(a / b);
        }
        System.out.println("finished");

    }

    // checked exception, have to be handled and indicated explicitly
    public static String readLineFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("file.txt")); // throws java.io.FileNotFoundException
        return scanner.nextLine();
    }

    // unchecked exception, are not validated by the compiler, so you don't have to handle them
    public static Long convertStringToLong(String str) {
        return Long.parseLong(str); // It may throw a NumberFormatException
    }
}

